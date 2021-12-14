package com.example.laba2.scenes;

import com.example.laba2.controllers.TestController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class CorrectTestScene extends Scene {
    private static final int WINDOW_HEIGHT = (int) (3.5 * ONE_PART);
    private static final int WINDOW_WIDTH = (int) (4.25 * ONE_PART);
    private static final int WINDOW_SPACING_VALUE = ONE_PART / 5;
    private static final int BUTTONS_SPACING_VALUE = (int) (1.3 * ONE_PART);
    private static final int ANSWERS_SPACING_VALUE = ONE_PART / 2;
    private static final int LABEL_SPACING_VALUE = ONE_PART / 10;
    private static final int FONT_SIZE_FOR_TEXT = ONE_PART / 8;
    private static final String PROMPT_TEXT = "Введите правки";


    private final Button backButton = new Button("< НАЗАД");
    private final Button answerButton = new Button("ПРИМЕНИТЬ ИЗМЕНЕНИЯ");

    private final Label numberOfTest = new Label("ТЕСТ №228");
    private final Label numberOfQuestion = new Label("ВОПРОС 1");
    private final Label question = new Label("КАК ЧАСТО НАДО ПОЛИВАТЬ ОГУРЦЫ?");

    private final TextField[] textFields = { new TextField(), new TextField(),
            new TextField(), new TextField() };

    private final CheckBox[] checkBoxes = { new CheckBox("ЧАСТО"),
            new CheckBox("ОЧЕНЬ ЧАСТО"), new CheckBox("ОНИ САМИ СПРАВЯТСЯ") };

    private static VBox windowPane;
    private final VBox headerPane = new VBox();
    private final HBox questionPane = new HBox();
    private final GridPane answersPane = new GridPane();
    private final HBox buttonsPane = new HBox();

    public CorrectTestScene() {
        super(windowPane = new VBox(), WINDOW_WIDTH, WINDOW_HEIGHT);
        windowName = "Вопрос";
        header.setText("ТЕСТИРОВАНИЕ");
        TestController controller = new TestController();

        question.setFont(new Font(FONT_SIZE_FOR_TEXT));
        numberOfTest.setFont(new Font(FONT_SIZE_FOR_TEXT));
        numberOfQuestion.setFont(new Font(FONT_SIZE_FOR_TEXT));
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

        textFields[textFields.length - 1].setPromptText(PROMPT_TEXT);

        answersPane.add(question, 1, 1);
        answersPane.add(textFields[textFields.length - 1], 1, 2);
        GridPane.setMargin(textFields[textFields.length - 1], new Insets(0, ANSWERS_SPACING_VALUE,
                ANSWERS_SPACING_VALUE / 5, 0));
        GridPane.setMargin(question, new Insets(0, ANSWERS_SPACING_VALUE,
                ANSWERS_SPACING_VALUE / 5, 0));
        for(int i = 0; i < checkBoxes.length; i++) {
            textFields[i].setPromptText(PROMPT_TEXT);
            answersPane.add(checkBoxes[i], 2, i * 2 + 1);
            answersPane.add(textFields[i], 2, (i + 1) * 2);
            GridPane.setMargin(checkBoxes[i], new Insets(0, 0,
                    ANSWERS_SPACING_VALUE / 5, 0));
            GridPane.setMargin(textFields[i], new Insets(0, 0,
                    ANSWERS_SPACING_VALUE / 5, 0));
        }

        buttonsPane.getChildren().addAll(backButton, answerButton);
        buttonsPane.setAlignment(Pos.CENTER);
        buttonsPane.setSpacing(BUTTONS_SPACING_VALUE);

        windowPane.getChildren().addAll(headerPane, questionPane, answersPane, buttonsPane);
        windowPane.setSpacing(WINDOW_SPACING_VALUE);
        windowPane.setAlignment(Pos.CENTER);
    }
}
