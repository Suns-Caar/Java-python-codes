package com.example.javafxgui;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.shape.Rectangle;

public class HelloController {

    @FXML
    private TextField marks1;
    @FXML
    private TextField marks2;
    @FXML
    private TextField credits2;
    @FXML
    private TextField credits1;
    @FXML
    private Button button1;
    @FXML
    private Label error;
    @FXML
    private Label finalgpa;
//   g

    int marks_1;
    int marks_2;
    int credits;
    int credits_2;
    public double sum;
    public double total;
    public double GPA;

    public void RESET(ActionEvent ev){
        try {
            marks_2 = Integer.parseInt(marks1.getText());
            credits_2 = Integer.parseInt(credits1.getText());
            if((marks_2 <= 10 || credits_2 <= 10)){
                sum = sum + credits_2;
                System.out.println("credits: " + sum);

                total = total + marks_2*credits_2;
                System.out.println("Total: " + total);

                GPA = total/sum;





            }

        }
        catch (Exception r){
            error.setText("error");
        }
        marks1.clear();
        credits1.clear();








    }

    public void UP(ActionEvent ev){
        marks1.clear();
        credits1.clear();
//        marks_1 = Integer.parseInt(marks1.getText());
//        credits = Integer.parseInt(credits1.getText());
        sum =0;
        total = 0;
        System.out.println(GPA);
        finalgpa.setText(String.format("%.2f", GPA));

    }

}
