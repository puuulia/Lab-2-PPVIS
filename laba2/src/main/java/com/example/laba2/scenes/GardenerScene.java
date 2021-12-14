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

public class GardenerScene extends Scene {
    private static final int WINDOW_HEIGHT = 3 * ONE_PART;
    private static final int WINDOW_WIDTH = 4 * ONE_PART;
    private static final int FONT_SIZE_FOR_TEXT = ONE_PART / 7;
    private static final int CENTER_SPACING_VALUE_BY_VERTICAL = ONE_PART / 14;
    private static final int FIELDS_WIDTH = 6 * ONE_PART / 5;
    private static final int CENTER_SPACING_VALUE_BY_HORIZONTAL = ONE_PART / 20;
    private static final int WINDOW_SPACING_VALUE = ONE_PART / 8;
    private static final String PROMPT_TEXT_FOR_INFORMATION_ABOUT_PLANT = "Введите текст";
    private static final String PROMPT_TEXT_FOR_RECOMMEND_AND_PLACE_NAME = "Введите название участка";

    private final Label nameLabel = new Label("ПУПКИН ВЯЧЕСЛАВ");

    private final TextField informationAboutPlantField = new TextField();
    private final TextField informationAboutPlaceField = new TextField();
    private final TextField placeNameField = new TextField();

    private final Button informationAboutPlantButton = new Button("ИНФОРМАЦИЯ О РАСТЕНИИ");
    private final Button informationAboutPlaceButton = new Button("ИНФОРМАЦИЯ ОБ УЧАСТКЕ");
    private final Button viewRecommendButton = new Button("ПРОСМОТР РЕКОМЕНДАЦИЙ");
    private final Button workWithTraineeButton = new Button("РАБОТА СО СТАЖЁРАМИ");

    private static VBox windowPane;
    private final VBox headerPane = new VBox();
    private final GridPane centerPane = new GridPane();
    private final HBox botPane = new HBox();

    public GardenerScene() {
        super(windowPane = new VBox(), WINDOW_WIDTH, WINDOW_HEIGHT);

        windowName = "Садовник";
        header.setText("САДОВНИК");

        ManagerController controller = new ManagerController();

        nameLabel.setFont(new Font(FONT_SIZE_FOR_TEXT));

        informationAboutPlantField.setPromptText(PROMPT_TEXT_FOR_INFORMATION_ABOUT_PLANT);
        informationAboutPlantField.setMinWidth(FIELDS_WIDTH);
        informationAboutPlaceField.setPromptText(PROMPT_TEXT_FOR_RECOMMEND_AND_PLACE_NAME);
        informationAboutPlaceField.setMinWidth(FIELDS_WIDTH);
        placeNameField.setPromptText(PROMPT_TEXT_FOR_RECOMMEND_AND_PLACE_NAME);
        placeNameField.setMinWidth(FIELDS_WIDTH);

        informationAboutPlantButton.setPrefSize(WINDOW_WIDTH - informationAboutPlantField.getMinWidth() -
                CENTER_SPACING_VALUE_BY_HORIZONTAL * 2, BUTTONS_HEIGHT);
        informationAboutPlantButton.setStyle("-fx-background-color: #7dacea");

        informationAboutPlaceButton.setPrefSize(WINDOW_WIDTH - informationAboutPlaceField.getMinWidth() -
                CENTER_SPACING_VALUE_BY_HORIZONTAL * 2, BUTTONS_HEIGHT);
        informationAboutPlaceButton.setStyle("-fx-background-color: #7dacea");

        viewRecommendButton.setPrefSize(WINDOW_WIDTH - placeNameField.getMinWidth() -
                CENTER_SPACING_VALUE_BY_HORIZONTAL * 2, BUTTONS_HEIGHT);
        viewRecommendButton.setStyle("-fx-background-color: #7dacea");

        workWithTraineeButton.setPrefSize(WINDOW_WIDTH, BUTTONS_HEIGHT);
        workWithTraineeButton.setStyle("-fx-background-color: #7dacea");

        headerPane.getChildren().addAll(header, nameLabel);
        headerPane.setAlignment(Pos.CENTER);

        centerPane.add(informationAboutPlantField, 1, 1);
        centerPane.add(informationAboutPlaceField, 1, 2);
        centerPane.add(placeNameField, 1, 3);
        centerPane.add(informationAboutPlantButton, 2, 1);
        centerPane.add(informationAboutPlaceButton, 2, 2);
        centerPane.add(viewRecommendButton, 2, 3);
        centerPane.setAlignment(Pos.CENTER);
        GridPane.setMargin(informationAboutPlantField, new Insets(CENTER_SPACING_VALUE_BY_VERTICAL, CENTER_SPACING_VALUE_BY_HORIZONTAL,
                CENTER_SPACING_VALUE_BY_VERTICAL, 0));
        GridPane.setMargin(informationAboutPlaceField, new Insets(CENTER_SPACING_VALUE_BY_VERTICAL, CENTER_SPACING_VALUE_BY_HORIZONTAL,
                CENTER_SPACING_VALUE_BY_VERTICAL, 0));
        GridPane.setMargin(placeNameField, new Insets(CENTER_SPACING_VALUE_BY_VERTICAL, CENTER_SPACING_VALUE_BY_HORIZONTAL,
                CENTER_SPACING_VALUE_BY_VERTICAL, 0));
        GridPane.setMargin(informationAboutPlantButton, new Insets(CENTER_SPACING_VALUE_BY_VERTICAL, 0,
                CENTER_SPACING_VALUE_BY_VERTICAL, CENTER_SPACING_VALUE_BY_HORIZONTAL));
        GridPane.setMargin(informationAboutPlaceButton, new Insets(CENTER_SPACING_VALUE_BY_VERTICAL, 0,
                CENTER_SPACING_VALUE_BY_VERTICAL, CENTER_SPACING_VALUE_BY_HORIZONTAL));
        GridPane.setMargin(viewRecommendButton, new Insets(CENTER_SPACING_VALUE_BY_VERTICAL, 0,
                CENTER_SPACING_VALUE_BY_VERTICAL, CENTER_SPACING_VALUE_BY_HORIZONTAL));

        botPane.getChildren().add(workWithTraineeButton);
        botPane.setAlignment(Pos.CENTER);

        windowPane.getChildren().addAll(headerPane, centerPane, botPane);
        windowPane.setSpacing(WINDOW_SPACING_VALUE);
        windowPane.setAlignment(Pos.CENTER);
    }
}
