package com.example.laba2.scenes;

import com.example.laba2.controllers.RecommendationsController;
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

public class CorrectRecommendationsScene extends Scene {
    private static final int WINDOW_HEIGHT = (int)(3.1 * ONE_PART);
    private static final int WINDOW_WIDTH = (int) (4.45 * ONE_PART);
    private static final int FONT_SIZE_FOR_TEXT = ONE_PART / 7;
    private static final int WINDOW_SPACING_VALUE = ONE_PART / 5;
    private static final int CENTER_SPACING_VALUE_FOR_VERTICAL = ONE_PART / 20;
    private static final int CENTER_SPACING_VALUE_FOR_HORIZONTAL = ONE_PART / 4;
    private static final int BUTTONS_SPACING_VALUE = ONE_PART / 10;
    private static final String PROMPT_TEXT = "Введите текст";

    private final Label placeName = new Label("УЧАСТОК: ПЛАТОНОВА 39");

    private final Button backButton = new Button("< НАЗАД");
    private final Button markAsDone = new Button("ПОМЕТИТЬ КАК ВЫПОЛНЕННОЕ");
    private final Button apply = new Button("ПРИМЕНИТЬ ИЗМЕНЕНИЯ");

    private final CheckBox[] checkBoxes = new CheckBox[5];
    private final String[] checkBoxNames = {"Полей огурцы", "Сделай 5-й этап лабораторной", "...", "...", "..."};

    private final TextField[] textFields = new TextField[5];

    private static VBox windowPane;
    private final HBox headerPane = new HBox();
    private final GridPane centerPane = new GridPane();
    private final HBox buttonsPane = new HBox();

    public CorrectRecommendationsScene() {
        super(windowPane = new VBox(), WINDOW_WIDTH, WINDOW_HEIGHT);
        windowName = "Изменение рекомендации";
        header.setText("РЕКОМЕНДАЦИИ");
        RecommendationsController controller = new RecommendationsController();

        placeName.setFont(new Font(FONT_SIZE_FOR_TEXT));

        backButton.setPrefHeight(BUTTONS_HEIGHT);
        markAsDone.setPrefHeight(BUTTONS_HEIGHT);
        apply.setPrefHeight(BUTTONS_HEIGHT);
        backButton.setStyle("-fx-background-color: #7dacea");
        markAsDone.setStyle("-fx-background-color: #7dacea");
        apply.setStyle("-fx-background-color: #7dacea");

        buttonsPane.getChildren().addAll(backButton, markAsDone, apply);
        buttonsPane.setSpacing(BUTTONS_SPACING_VALUE);

        headerPane.getChildren().add(header);
        headerPane.setAlignment(Pos.CENTER);

        centerPane.add(placeName, 1, 1);

        initialize();

        centerPane.setAlignment(Pos.CENTER);

        windowPane.getChildren().addAll(headerPane, centerPane, buttonsPane);
        windowPane.setSpacing(WINDOW_SPACING_VALUE);
        windowPane.setAlignment(Pos.CENTER_LEFT);
    }

    private void initialize() {
        for (int i = 0; i < checkBoxes.length; i++) {
            checkBoxes[i] = new CheckBox(checkBoxNames[i]);
            checkBoxes[i].setFont(new Font(FONT_SIZE_FOR_TEXT));
            centerPane.add(checkBoxes[i], 1, i + 2);
            GridPane.setMargin(checkBoxes[i], new Insets(0,
                    CENTER_SPACING_VALUE_FOR_HORIZONTAL, CENTER_SPACING_VALUE_FOR_VERTICAL, 0));
        }

        for (int i = 0; i < textFields.length; i++) {
            textFields[i] = new TextField();
            textFields[i].setPromptText(PROMPT_TEXT);
            centerPane.add(textFields[i], 2, i + 2);
            GridPane.setMargin(textFields[i], new Insets(0,
                    0, CENTER_SPACING_VALUE_FOR_VERTICAL, CENTER_SPACING_VALUE_FOR_HORIZONTAL));
        }
    }
}
