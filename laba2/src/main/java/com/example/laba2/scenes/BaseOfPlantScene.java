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

public class BaseOfPlantScene extends Scene {
    private static final int WINDOW_HEIGHT = (int)(3.1 * ONE_PART) - 2;
    private static final int WINDOW_WIDTH = (int) (4.45 * ONE_PART);
    private static final int FONT_SIZE_FOR_TEXT = ONE_PART / 6;
    private static final int WINDOW_SPACING_VALUE = ONE_PART / 5;
    private static final int CENTER_SPACING_VALUE = ONE_PART / 10;

    private final Button backButton = new Button("< НАЗАД");

    private final Label[] labels = { new Label("НАЗВАНИЕ: ОГУРЕЦ"), new Label("СЕМЕЙСТВО: ТЫКВЕННЫЕ"),
            new Label("КЛАССИФИКАЦИЯ: ОВОЩ"), new Label("ТИП: ОДНОЛЕТНЕЕ ТРАВОЯДНОЕ РАСТЕНИЕ"),
            new Label("СЕЗОН: ЛЕТО"), new Label("УХОД: НЕ  ЗАБЫВАТЬ ПОЛИВАТЬ") };

    private static VBox windowPane;
    private final HBox headerPane = new HBox();
    private final VBox centerPane = new VBox();
    private final HBox buttonsPane = new HBox();

    public BaseOfPlantScene() {
        super(windowPane = new VBox(), WINDOW_WIDTH, WINDOW_HEIGHT);
        windowName = "База растений";
        header.setText("БАЗА РАСТЕНИЙ");
        RecommendationsController controller = new RecommendationsController();

        backButton.setPrefHeight(BUTTONS_HEIGHT);
        //enterButton.setOnAction(event -> controller.registrationButtonAction());
        backButton.setStyle("-fx-background-color: #7dacea");

        initialize();

        buttonsPane.getChildren().addAll(backButton);
        buttonsPane.setAlignment(Pos.CENTER);

        headerPane.getChildren().add(header);
        headerPane.setAlignment(Pos.CENTER);

        centerPane.setAlignment(Pos.CENTER_LEFT);
        centerPane.setSpacing(CENTER_SPACING_VALUE);

        windowPane.getChildren().addAll(headerPane, centerPane, buttonsPane);
        windowPane.setSpacing(WINDOW_SPACING_VALUE);
        windowPane.setAlignment(Pos.CENTER_LEFT);
    }

    private void initialize() {
        for (Label label : labels) {
            label.setFont(new Font(FONT_SIZE_FOR_TEXT));
            centerPane.getChildren().add(label);
        }
    }
}
