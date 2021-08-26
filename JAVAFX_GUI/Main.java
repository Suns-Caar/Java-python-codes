package com.example.javafxgui;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {

            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("GPA CALCULATOR");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
//    public ObservableList<HelloController> tabledata(){
//        ObservableList<HelloController> data = FXCollections.observableArrayList();
//        data.add(new data)

}
