package com.example.laba2;

import com.example.laba2.scenes.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class Window extends Application {

    private static Stage stage;

    @Override
    public void start(Stage stage) {
        Window.stage = stage;
        openNewScene(new StartScene());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void openNewScene(Scene scene) {
        stage.setScene(scene);
        stage.setTitle(scene.windowName);
    }

    public static void openNewWindow(Scene scene) {
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(scene.windowName);
        stage.show();
    }
}
