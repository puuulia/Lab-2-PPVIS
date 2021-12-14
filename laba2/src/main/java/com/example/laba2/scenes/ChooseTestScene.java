package com.example.laba2.scenes;

import com.example.laba2.controllers.ChooseTestController;
import com.example.laba2.controllers.RegistrationController;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class ChooseTestScene extends Scene {
    private static final int WINDOW_HEIGHT = (int) (2.5 * ONE_PART);
    private static final int WINDOW_WIDTH = 2 * ONE_PART;
    private static final int WINDOW_SPACING_VALUE = ONE_PART / 2;
    private static final int BUTTONS_SPACING_VALUE = ONE_PART / 3;
    private static final String PROMPT_TEXT = "ВЫБЕРИТЕ НОМЕР ТЕСТА";

    private final ComboBox<String> comboBox = new ComboBox<>();

    private final Button backButton = new Button("< НАЗАД");
    private final Button startButton = new Button("НАЧАТЬ >");

    private static VBox windowPane;
    private final HBox buttonsPane = new HBox();

    public ChooseTestScene() {
        super(windowPane = new VBox(), WINDOW_WIDTH, WINDOW_HEIGHT);
        windowName = "Выбор теста";
        header.setText("ТЕСТИРОВАНИЕ");
        ChooseTestController controller = new ChooseTestController();

        comboBox.setPromptText(PROMPT_TEXT);

        backButton.setPrefHeight(BUTTONS_HEIGHT);
        //backButton.setOnAction(event -> controller.backButtonAction());
        backButton.setStyle("-fx-background-color: #7dacea");

        startButton.setPrefHeight(BUTTONS_HEIGHT);
        //backButton.setOnAction(event -> controller.backButtonAction());
        startButton.setStyle("-fx-background-color: #7dacea");

        buttonsPane.getChildren().addAll(backButton, startButton);
        buttonsPane.setAlignment(Pos.CENTER);
        buttonsPane.setSpacing(BUTTONS_SPACING_VALUE);

        windowPane.getChildren().addAll(header, comboBox, buttonsPane);
        windowPane.setSpacing(WINDOW_SPACING_VALUE);
        windowPane.setAlignment(Pos.CENTER);
    }
}
