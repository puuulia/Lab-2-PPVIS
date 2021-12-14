package com.example.laba2.scenes;

import com.example.laba2.controllers.ManagerController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class ManagerScene extends Scene {
    private static final int WINDOW_HEIGHT = (int) (2.5 * ONE_PART);
    private static final int WINDOW_WIDTH = 4 * ONE_PART;
    private static final int FONT_SIZE_FOR_TEXT = ONE_PART / 7;
    private static final int CENTER_SPACING_VALUE_BY_VERTICAL = ONE_PART / 14;
    private static final int FIELDS_WIDTH = 6 * ONE_PART / 5;
    private static final int CENTER_SPACING_VALUE_BY_HORIZONTAL = ONE_PART / 20;
    private static final int WINDOW_SPACING_VALUE = ONE_PART / 8;
    private static final String PROMPT_TEXT_FOR_PLANT = "Введите текст";
    private static final String PROMPT_TEXT_FOR_RECOMMEND = "Введите название участка";

    private final Label nameLabel = new Label("ПУПКИН ВЯЧЕСЛАВ");

    private final TextField plantNameField = new TextField();
    private final TextField recommendField = new TextField();

    private final Button correctPlantButton = new Button("РЕДАКТИРОВАНИЕ РАСТЕНИЙ");
    private final Button correctRecommendButton = new Button("РЕДАКТИРОВАНИЕ РЕКОМЕНДАЦИЙ");
    private final Button correctTestsButton = new Button("РЕДАКТИРОВАНИЕ ТЕСТОВ");

    private static VBox windowPane;
    private final VBox headerPane = new VBox();
    private final GridPane centerPane = new GridPane();
    private final HBox botPane = new HBox();

    public ManagerScene() {
        super(windowPane = new VBox(), WINDOW_WIDTH, WINDOW_HEIGHT);

        windowName = "Менеджер";
        header.setText("МЕНЕДЖЕР");

        ManagerController controller = new ManagerController();

        nameLabel.setFont(new Font(FONT_SIZE_FOR_TEXT));

        plantNameField.setPromptText(PROMPT_TEXT_FOR_PLANT);
        plantNameField.setMinWidth(FIELDS_WIDTH);
        recommendField.setPromptText(PROMPT_TEXT_FOR_RECOMMEND);
        recommendField.setMinWidth(FIELDS_WIDTH);

        correctPlantButton.setPrefSize(WINDOW_WIDTH - plantNameField.getMinWidth() -
                CENTER_SPACING_VALUE_BY_HORIZONTAL * 2, BUTTONS_HEIGHT);
        correctPlantButton.setStyle("-fx-background-color: #7dacea");

        correctRecommendButton.setPrefSize(WINDOW_WIDTH - correctRecommendButton.getMinWidth() -
                CENTER_SPACING_VALUE_BY_HORIZONTAL * 2, BUTTONS_HEIGHT);
        correctRecommendButton.setStyle("-fx-background-color: #7dacea");

        correctTestsButton.setPrefSize(WINDOW_WIDTH, BUTTONS_HEIGHT);
        correctTestsButton.setStyle("-fx-background-color: #7dacea");

        headerPane.getChildren().addAll(header, nameLabel);
        headerPane.setAlignment(Pos.CENTER);

        centerPane.add(plantNameField, 1, 1);
        centerPane.add(recommendField, 1, 2);
        centerPane.add(correctPlantButton, 2, 1);
        centerPane.add(correctRecommendButton, 2, 2);
        centerPane.setAlignment(Pos.CENTER);
        GridPane.setMargin(plantNameField, new Insets(CENTER_SPACING_VALUE_BY_VERTICAL, CENTER_SPACING_VALUE_BY_HORIZONTAL,
                CENTER_SPACING_VALUE_BY_VERTICAL, 0));
        GridPane.setMargin(recommendField, new Insets(CENTER_SPACING_VALUE_BY_VERTICAL, CENTER_SPACING_VALUE_BY_HORIZONTAL,
                CENTER_SPACING_VALUE_BY_VERTICAL, 0));
        GridPane.setMargin(correctPlantButton, new Insets(CENTER_SPACING_VALUE_BY_VERTICAL, 0,
                CENTER_SPACING_VALUE_BY_VERTICAL, CENTER_SPACING_VALUE_BY_HORIZONTAL));
        GridPane.setMargin(correctRecommendButton, new Insets(CENTER_SPACING_VALUE_BY_VERTICAL, 0,
                CENTER_SPACING_VALUE_BY_VERTICAL, CENTER_SPACING_VALUE_BY_HORIZONTAL));

        botPane.getChildren().add(correctTestsButton);
        botPane.setAlignment(Pos.CENTER);

        windowPane.getChildren().addAll(headerPane, centerPane, botPane);
        windowPane.setSpacing(WINDOW_SPACING_VALUE);
        windowPane.setAlignment(Pos.CENTER);
    }
}
