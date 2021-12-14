package com.example.laba2.scenes;

import com.example.laba2.controllers.ChooseTestController;
import com.example.laba2.controllers.TestController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class TestScene extends Scene {
    private static final int WINDOW_HEIGHT = (int) (2.2 * ONE_PART);
    private static final int WINDOW_WIDTH = 5 * ONE_PART;
    private static final int WINDOW_SPACING_VALUE = ONE_PART / 5;
    private static final int BUTTONS_SPACING_VALUE = ONE_PART / 2;
    private static final int ANSWERS_SPACING_VALUE = ONE_PART / 2;
    private static final int LABEL_SPACING_VALUE = ONE_PART / 10;
    private static final int FONT_SIZE_FOR_TEXT = (int) (ONE_PART / 7.1);

    private final Button backButton = new Button("< НАЗАД");
    private final Button answerButton = new Button("НАЧАТЬ >");

    private final Label numberOfTest = new Label("ТЕСТ №228");
    private final Label numberOfQuestion = new Label("ВОПРОС 1");
    private final Label question = new Label("КАК ЧАСТО НАДО ПОЛИВАТЬ ОГУРЦЫ?");

    private final CheckBox[] checkBoxes = { new CheckBox("ЧАСТО"),
            new CheckBox("ОЧЕНЬ ЧАСТО"), new CheckBox("ОНИ САМИ СПРАВЯТСЯ") };

    private static VBox windowPane;
    private final VBox headerPane = new VBox();
    private final HBox questionPane = new HBox();
    private final GridPane answersPane = new GridPane();
    private final HBox buttonsPane = new HBox();

    public TestScene() {
        super(windowPane = new VBox(), WINDOW_WIDTH, WINDOW_HEIGHT);
        windowName = "Вопрос";
        header.setText("ТЕСТИРОВАНИЕ");
        TestController controller = new TestController();

        question.setFont(new Font(FONT_SIZE_FOR_TEXT));
        for(CheckBox checkBox: checkBoxes)
            checkBox.setFont(new Font(FONT_SIZE_FOR_TEXT));

        backButton.setPrefHeight(BUTTONS_HEIGHT);
        //backButton.setOnAction(event -> controller.backButtonAction());
        backButton.setStyle("-fx-background-color: #7dacea");

        answerButton.setPrefHeight(BUTTONS_HEIGHT);
        //backButton.setOnAction(event -> controller.backButtonAction());
        answerButton.setStyle("-fx-background-color: #7dacea");

        headerPane.getChildren().addAll(header, numberOfTest);
        headerPane.setAlignment(Pos.CENTER);

        questionPane.getChildren().add(numberOfQuestion);
        questionPane.setAlignment(Pos.CENTER);
        questionPane.setSpacing(LABEL_SPACING_VALUE);

        answersPane.add(question, 1, 2);
        GridPane.setMargin(question, new Insets(0, ANSWERS_SPACING_VALUE, 0, 0));
        for(int i = 0; i < checkBoxes.length; i++) {
            answersPane.add(checkBoxes[i], 2, i + 1);
        }

        buttonsPane.getChildren().addAll(backButton, answerButton);
        buttonsPane.setAlignment(Pos.CENTER);
        buttonsPane.setSpacing(BUTTONS_SPACING_VALUE);

        windowPane.getChildren().addAll(headerPane, questionPane, answersPane, buttonsPane);
        windowPane.setSpacing(WINDOW_SPACING_VALUE);
        windowPane.setAlignment(Pos.CENTER);
    }
}
