package com.example.demo80085;


//import eu.hansolo.medusa.Gauge

import eu.hansolo.medusa.Gauge;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortException;
import jssc.SerialPortList;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static jssc.SerialPort.MASK_RXCHAR;

public class code69  extends Application {
    Gauge gauge = new Gauge();
    Button btn = new Button();
    SerialPort arduinoPort = null;
    ObservableList<String> portList;

    Label labelValue;
    final int NUM_OF_POINT = 50;
    XYChart.Series series;

    private void detectPort(){

        portList = FXCollections.observableArrayList();

        String[] serialPortNames = SerialPortList.getPortNames();
        for(String name: serialPortNames){
            System.out.println(name);
            portList.add(name);
        }
    }

    @Override
    public void start(Stage primaryStage) {

//        labelValue = new Label();
//        labelValue.setFont(new Font("Arial", 28));
//
        gauge.setTitle("DHOOM");
        gauge.setMaxValue(1023);
        gauge.setMinValue(0);
//        gauge.setSkin(DashboardSkin<> );


        detectPort();
        final ComboBox comboBoxPorts = new ComboBox(portList);
        comboBoxPorts.valueProperty()
                .addListener((ChangeListener<String>) (observable, oldValue, newValue) -> {

                    System.out.println(newValue);
                    disconnectArduino();
                    connectArduino(newValue);
                });

        //LineChart
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Voltage");

        final LineChart<Number,Number> lineChart =
                new LineChart<>(xAxis,yAxis);
        lineChart.setTitle("Arduino Uno A0 Analog Input");
        series = new XYChart.Series();
        series.setName("A0 analog input");
        lineChart.getData().add(series);
        lineChart.setAnimated(false);

//        //pre-load with dummy data
        for(int i=0; i<NUM_OF_POINT; i++){
            series.getData().add(new XYChart.Data(i, 0));
        }
//        //

        VBox vBox = new VBox();
        vBox.getChildren().addAll(
                comboBoxPorts, lineChart, gauge);

        StackPane root = new StackPane();
        root.getChildren().add(vBox);

        Scene scene = new Scene(root, 500, 400);

        primaryStage.setTitle(
                "arduino-er.blogspot.com: Java + JavaFX + jSSC demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void shiftSeriesData(float newValue)
    {
        for(int i=0; i<NUM_OF_POINT-1; i++){
            XYChart.Data<String, Number> ShiftDataUp =
                    (XYChart.Data<String, Number>)series.getData().get(i+1);
            Number shiftValue = ShiftDataUp.getYValue();
            XYChart.Data<String, Number> ShiftDataDn =
                    (XYChart.Data<String, Number>)series.getData().get(i);
            ShiftDataDn.setYValue(shiftValue);
        }
        XYChart.Data<String, Number> lastData =
                (XYChart.Data<String, Number>)series.getData().get(NUM_OF_POINT-1);
        lastData.setYValue(newValue);
    }

    public boolean connectArduino(String port){

        System.out.println("connectArduino");

        boolean success = false;
        SerialPort serialPort = new SerialPort(port);
        try {
            serialPort.openPort();
            serialPort.setParams(
                    SerialPort.BAUDRATE_9600,
                    SerialPort.DATABITS_8,
                    SerialPort.STOPBITS_1,
                    SerialPort.PARITY_NONE);
            serialPort.setEventsMask(MASK_RXCHAR);
            serialPort.addEventListener((SerialPortEvent serialPortEvent) -> {
                if(serialPortEvent.isRXCHAR()){
                    try {
//                            String b = serialPort.readString();
                        byte[] b = serialPort.readBytes();
                        int value = b[0] & 0xff;    //convert to int
                        String st = String.valueOf(value);




                        int k, l;
                        for (k = 0;k <200; k++) {
//                            byte[] b = serialPort.readBytes();
//                            int value = b[0] & 0xff;    //convert to int
//                            String st = String.valueOf(value);

                            for (l = 0; l < 20; l++) {
                                String filename = "/home/sanskar/Documents/sample.xlsx";
                                HSSFWorkbook workbook = new HSSFWorkbook();
                                HSSFSheet sheet = workbook.createSheet("excelsheet");
                                HSSFRow row = sheet.createRow(k);
                                row.createCell(0).setCellValue("value:");
                                row.createCell(1).setCellValue(value);
                                System.out.println(st);
                                FileOutputStream fileOut = new FileOutputStream(filename);
                                workbook.write(fileOut);
                                fileOut.close();
                            }
                        }






//                  int value = Integer.parseInt(b);


//                        Update label in ui thread
                        Platform.runLater(() -> {
//                            labelValue.setText(st);
                            shiftSeriesData((float)value*5/255); //in 5V scale
                            gauge.setValue(Double.parseDouble(st));
                        });

                    } catch (SerialPortException | IOException ex) {
                        Logger.getLogger(code69.class.getName())
                                .log(Level.SEVERE, null, ex);
                    }

                }
            });

            arduinoPort = serialPort;
            success = true;
        } catch (SerialPortException ex) {
            Logger.getLogger(code69.class.getName())
                    .log(Level.SEVERE, null, ex);
            System.out.println("SerialPortException: " + ex.toString());
        }

        return success;
    }

    public void disconnectArduino(){

        System.out.println("disconnectArduino()");
        if(arduinoPort != null){
            try {
                arduinoPort.removeEventListener();

                if(arduinoPort.isOpened()){
                    arduinoPort.closePort();
                }

            } catch (SerialPortException ex) {
                Logger.getLogger(code69.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void stop() throws Exception {
        disconnectArduino();
        super.stop();
    }


    public static void main(String[] args) {
        launch(args);
    }


}
