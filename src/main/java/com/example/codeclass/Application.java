package com.example.codeclass;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

import static jdk.internal.org.jline.utils.Colors.s;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));

        FlowPane root = new FlowPane();
//      een sidebar aanmaken
        FlowPane sidebar = new FlowPane();
        sidebar.setPrefWidth(100);
        sidebar.setPrefHeight(600);
        sidebar.setStyle("-fx-background-color: #dbea07");

//      een variabelen aangemaakt om de breedte van het label responsive met de breedte van de sidebar
        double sidebarWidth = sidebar.getPrefWidth();
//      label aanmaken
        Label label = new Label ( "Inf Hotel");
        label.setPrefSize(sidebarWidth ,30);
        label.setStyle("-fx-background-color: #4343e7; -fx-alignment: Center; -fx-border-color: black; -fx-border-width: 1 1 1 1; -fx-font-weight: Bold");
        label.setAlignment(Pos.CENTER);

//      label toevoegen aan sidebar
        sidebar.getChildren().add(label);

        FlowPane tester = new FlowPane();
        tester.setPrefWidth(100);
        tester.setPrefHeight(600);
        tester.setStyle("-fx-background-color: #d307ea");

//      de sidebar toevoegen aan de scene
        root.getChildren().addAll(sidebar,tester);


        Scene scene = new Scene(root, 1024, 600);

        stage.setTitle("InfHotel");
        stage.setScene(scene);
        stage.show();
//      zo kan je het tabblad(aka de stage) niet meer van grote veranderen.
        stage.setResizable(false);
    }

    public static void main(String[] args) {
        launch();
    }
}