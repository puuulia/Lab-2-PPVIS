package com.example.laba2.scenes;

import com.example.laba2.controllers.ChooseTestForCorrectController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ChooseTestForCorrectScene extends Scene {
    private static final int WINDOW_HEIGHT = (int) (1.9 * ONE_PART);
    private static final int WINDOW_WIDTH = 3 * ONE_PART;
    private static final int WINDOW_SPACING_VALUE = ONE_PART / 4;
    private static final int BUTTONS_SPACING_VALUE = (int) (ONE_PART * 1.1);
    private static final String PROMPT_TEXT_FOR_TEST = "ВЫБЕРИТЕ ТЕСТ";
    private static final String PROMPT_TEXT_FOR_ANSWER = "ВЫБЕРИТЕ ВОПРОС";

    private final ComboBox<String> selectTestBox = new ComboBox<>();
    private final ComboBox<String> selectQuestionBox = new ComboBox<>();

    private final Button backButton = new Button("< НАЗАД");
    private final Button startButton = new Button("РЕДАКТИРОВАТЬ >");

    private static VBox windowPane;
    private final HBox buttonsPane = new HBox();

    public ChooseTestForCorrectScene() {
        super(windowPane = new VBox(), WINDOW_WIDTH, WINDOW_HEIGHT);
        windowName = "Выбор теста";
        header.setText("РЕДАКТИРОВАНИЕ ТЕСТОВ");
        ChooseTestForCorrectController controller = new ChooseTestForCorrectController();

        selectTestBox.setPromptText(PROMPT_TEXT_FOR_TEST);
        selectQuestionBox.setPromptText(PROMPT_TEXT_FOR_ANSWER);

        backButton.setPrefHeight(BUTTONS_HEIGHT);
        //backButton.setOnAction(event -> controller.backButtonAction());
        backButton.setStyle("-fx-background-color: #7dacea");

        startButton.setPrefHeight(BUTTONS_HEIGHT);
        //backButton.setOnAction(event -> controller.backButtonAction());
        startButton.setStyle("-fx-background-color: #7dacea");

        buttonsPane.getChildren().addAll(backButton, startButton);
        buttonsPane.setAlignment(Pos.CENTER);
        buttonsPane.setSpacing(BUTTONS_SPACING_VALUE);

        windowPane.getChildren().addAll(header, selectTestBox, selectQuestionBox, buttonsPane);
        windowPane.setSpacing(WINDOW_SPACING_VALUE);
        windowPane.setAlignment(Pos.CENTER);
    }
}
