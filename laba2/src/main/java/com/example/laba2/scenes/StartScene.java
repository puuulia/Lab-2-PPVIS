package com.example.laba2.scenes;

import com.example.laba2.controllers.StartController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class StartScene extends Scene {
    private static final int WINDOW_HEIGHT = 3 * ONE_PART;
    private static final int WINDOW_WIDTH = 4 * ONE_PART;
    private static final int BUTTON_WIDTH = 2 * ONE_PART;
    private static final int SPACING_VALUE = ONE_PART / 4;

    private static VBox pane;

    private final Button logIn = new Button("ВОЙТИ");
    private final Button registration = new Button("РЕГИСТРАЦИЯ");

    public StartScene() {
        super(pane = new VBox(), WINDOW_WIDTH, WINDOW_HEIGHT);
        header.setText("САДОВЫЙ УЧАСТОК");
        windowName = "Стартовое окно";

        StartController controller = new StartController();

        logIn.setPrefSize(BUTTON_WIDTH, BUTTONS_HEIGHT);
        registration.setPrefSize(BUTTON_WIDTH, BUTTONS_HEIGHT);
        logIn.setDefaultButton(true);
        registration.setDefaultButton(true);
        logIn.setOnAction(event -> controller.logInButtonAction());
        registration.setOnAction(event -> controller.registrationButtonAction());

        pane.getChildren().addAll(header, logIn, registration);
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(SPACING_VALUE);
    }
}