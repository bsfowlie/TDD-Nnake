package com.github.bsfowlie.snake;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label label = new Label(getGreeting());
        primaryStage.setScene(new Scene(label));
        primaryStage.show();

    }

    public String getGreeting() {

        return "Hello, world!";

    }

}
