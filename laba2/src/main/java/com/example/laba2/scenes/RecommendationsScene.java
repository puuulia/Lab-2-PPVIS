package com.example.laba2.scenes;

import com.example.laba2.controllers.RecommendationsController;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class RecommendationsScene extends Scene {
    private static final int WINDOW_HEIGHT = (int)(3.1 * ONE_PART);
    private static final int WINDOW_WIDTH = (int) (4.45 * ONE_PART);
    private static final int FONT_SIZE_FOR_TEXT = ONE_PART / 6;
    private static final int WINDOW_SPACING_VALUE = ONE_PART / 5;
    private static final int CENTER_SPACING_VALUE = ONE_PART / 10;
    private static final int BUTTONS_SPACING_VALUE = ONE_PART / 10;


    private final Label placeName = new Label("УЧАСТОК: ПЛАТОНОВА 39");

    private final Button backButton = new Button("< НАЗАД");
    private final Button markAsDone = new Button("ПОМЕТИТЬ КАК ВЫПОЛНЕННОЕ");
    private final Button apply = new Button("ПРИМЕНИТЬ ИЗМЕНЕНИЯ");

    private final CheckBox checkBox1 = new CheckBox("Полей огурцы");
    private final CheckBox checkBox2 = new CheckBox("Сделай 5-й этап лабораторной");
    private final CheckBox checkBox3 = new CheckBox("...");
    private final CheckBox checkBox4 = new CheckBox("...");
    private final CheckBox checkBox5 = new CheckBox("...");

    private static VBox windowPane;
    private final HBox headerPane = new HBox();
    private final VBox centerPane = new VBox();
    private final HBox buttonsPane = new HBox();

    public RecommendationsScene() {
        super(windowPane = new VBox(), WINDOW_WIDTH, WINDOW_HEIGHT);
        windowName = "Рекомендации";
        header.setText("РЕКОМЕНДАЦИИ");
        RecommendationsController controller = new RecommendationsController();

        placeName.setFont(new Font(FONT_SIZE_FOR_TEXT));
        checkBox1.setFont(new Font(FONT_SIZE_FOR_TEXT));
        checkBox2.setFont(new Font(FONT_SIZE_FOR_TEXT));
        checkBox3.setFont(new Font(FONT_SIZE_FOR_TEXT));
        checkBox4.setFont(new Font(FONT_SIZE_FOR_TEXT));
        checkBox5.setFont(new Font(FONT_SIZE_FOR_TEXT));

        backButton.setPrefHeight(BUTTONS_HEIGHT);
        markAsDone.setPrefHeight(BUTTONS_HEIGHT);
        apply.setPrefHeight(BUTTONS_HEIGHT);
        //enterButton.setOnAction(event -> controller.registrationButtonAction());
        backButton.setStyle("-fx-background-color: #7dacea");
        markAsDone.setStyle("-fx-background-color: #7dacea");
        apply.setStyle("-fx-background-color: #7dacea");

        buttonsPane.getChildren().addAll(backButton, markAsDone, apply);
        buttonsPane.setSpacing(BUTTONS_SPACING_VALUE);

        headerPane.getChildren().add(header);
        headerPane.setAlignment(Pos.CENTER);

        centerPane.getChildren().addAll(placeName, checkBox1, checkBox2, checkBox3, checkBox4, checkBox5);
        centerPane.setAlignment(Pos.CENTER_LEFT);
        centerPane.setSpacing(CENTER_SPACING_VALUE);

        windowPane.getChildren().addAll(headerPane, centerPane, buttonsPane);
        windowPane.setSpacing(WINDOW_SPACING_VALUE);
        windowPane.setAlignment(Pos.CENTER_LEFT);
    }
}
