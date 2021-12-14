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

public class CorrectBaseOfPlantsScene extends Scene {
    private static final int WINDOW_HEIGHT = (int)(2.85 * ONE_PART);
    private static final int WINDOW_WIDTH = 5 * ONE_PART;
    private static final int FIELDS_WIDTH = 2 * ONE_PART;
    private static final int FONT_SIZE_FOR_TEXT = ONE_PART / 8;
    private static final int WINDOW_SPACING_VALUE = ONE_PART / 5;
    private static final int CENTER_SPACING_VALUE_FOR_VERTICAL = ONE_PART / 20;
    private static final int CENTER_SPACING_VALUE_FOR_HORIZONTAL = ONE_PART / 4;
    private static final int BUTTONS_SPACING_VALUE = (int) (ONE_PART / 1.42);

    private final Button backButton = new Button("< НАЗАД");
    private final Button deletePlant = new Button("УДАЛИТЬ РАСТЕНИЕ");
    private final Button apply = new Button("ПРИМЕНИТЬ ИЗМЕНЕНИЯ");

    private final Label[] labels = { new Label("НАЗВАНИЕ: ОГУРЕЦ"), new Label("СЕМЕЙСТВО: ТЫКВЕННЫЕ"),
            new Label("КЛАССИФИКАЦИЯ: ОВОЩ"), new Label("ТИП: ОДНОЛЕТНЕЕ ТРАВОЯДНОЕ РАСТЕНИЕ"),
            new Label("СЕЗОН: ЛЕТО"), new Label("УХОД: НЕ  ЗАБЫВАТЬ ПОЛИВАТЬ") };

    private final String[] promptTexts = {"Введите правки названия", "Введите правки семейства",
            "Введите правки классификации", "Введите правки типа", "Введите правки сезона" , "Введите правки ухода"};

    private final TextField[] textFields = { new TextField(), new TextField(), new TextField(), new TextField(),
            new TextField(), new TextField() };

    private static VBox windowPane;
    private final HBox headerPane = new HBox();
    private final GridPane centerPane = new GridPane();
    private final HBox buttonsPane = new HBox();

    public CorrectBaseOfPlantsScene() {
        super(windowPane = new VBox(), WINDOW_WIDTH, WINDOW_HEIGHT);
        windowName = "Изменение растений";
        header.setText("БАЗА РАСТЕНИЙ");
        RecommendationsController controller = new RecommendationsController();

        backButton.setPrefHeight(BUTTONS_HEIGHT);
        deletePlant.setPrefHeight(BUTTONS_HEIGHT);
        apply.setPrefHeight(BUTTONS_HEIGHT);
        backButton.setStyle("-fx-background-color: #7dacea");
        deletePlant.setStyle("-fx-background-color: #7dacea");
        apply.setStyle("-fx-background-color: #7dacea");

        buttonsPane.getChildren().addAll(backButton, deletePlant, apply);
        buttonsPane.setSpacing(BUTTONS_SPACING_VALUE);

        headerPane.getChildren().add(header);
        headerPane.setAlignment(Pos.CENTER);

        initialize();

        centerPane.setAlignment(Pos.CENTER);

        windowPane.getChildren().addAll(headerPane, centerPane, buttonsPane);
        windowPane.setSpacing(WINDOW_SPACING_VALUE);
        windowPane.setAlignment(Pos.CENTER_LEFT);
    }

    private void initialize() {
        for (int i = 0; i < labels.length; i++) {
            labels[i].setFont(new Font(FONT_SIZE_FOR_TEXT));
            centerPane.add(labels[i], 1, i + 1);
            GridPane.setMargin(labels[i], new Insets(0,
                    CENTER_SPACING_VALUE_FOR_HORIZONTAL, CENTER_SPACING_VALUE_FOR_VERTICAL, 0));
        }

        for (int i = 0; i < textFields.length; i++) {
            textFields[i].setPromptText(promptTexts[i]);
            textFields[i].setPrefWidth(FIELDS_WIDTH);
            centerPane.add(textFields[i], 2, i + 1);
            GridPane.setMargin(textFields[i], new Insets(0,
                    0, CENTER_SPACING_VALUE_FOR_VERTICAL, CENTER_SPACING_VALUE_FOR_HORIZONTAL));
        }
    }
}
