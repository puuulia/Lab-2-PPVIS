package com.example.laba2.scenes;

import com.example.laba2.controllers.ProfileController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ProfileScene extends Scene {
    private static final int WINDOW_HEIGHT = 3 * ONE_PART;
    private static final int WINDOW_WIDTH = 4 * ONE_PART;
    private static final int CENTER_BUTTONS_WIDTH = WINDOW_WIDTH / 3;
    private static final int BOTTOM_BUTTONS_WIDTH = WINDOW_WIDTH / 5 * 4;
    private static final int FONT_SIZE_FOR_TEXT = ONE_PART / 7;
    private static final int CENTER_SPACING_VALUE = ONE_PART / 14;
    private static final int WINDOW_SPACING_VALUE = ONE_PART / 8;
    private static final int NAME_SPACING_VALUE = ONE_PART / 14;
    private static final String PROMPT_TEXT = "Введите текст";

    private final Label nameLabel = new Label("ИМЯ: ПУПКИН ВЯЧЕСЛАВ БОРИСОВИЧ");

    private final TextField newNameField = new TextField();
    private final PasswordField passwordField = new PasswordField();

    private final Button changeNameButton = new Button("Изменить имя");
    private final Button changePasswordButton = new Button("Изменить пароль");
    private final Button watchListRequestsButton = new Button("ПОСМОТРЕТЬ СПИСОК ДОСТУПНЫХ РАЗДЕЛОВ");

    private Image image;

    private static VBox windowPane;
    private final HBox headerPane = new HBox();
    private final HBox namePane = new HBox();
    private final GridPane centerPane = new GridPane();
    private final HBox botPane = new HBox();

    public ProfileScene() {
        super(windowPane = new VBox(), WINDOW_WIDTH, WINDOW_HEIGHT);

        windowName = "Профиль";
        header.setText("ПРОФИЛЬ");

        ProfileController controller = new ProfileController();

        try {
            image = new Image(new FileInputStream("D:\\Images\\avatar.png"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ImageView avatar = new ImageView(image);
        avatar.setFitHeight(40);
        avatar.setFitWidth(40);

        nameLabel.setFont(new Font(FONT_SIZE_FOR_TEXT));

        newNameField.setPromptText(PROMPT_TEXT);
        passwordField.setPromptText(PROMPT_TEXT);

        changeNameButton.setPrefSize(CENTER_BUTTONS_WIDTH, BUTTONS_HEIGHT);
        //changeNameButton.setOnAction(event -> controller.registrationButtonAction());
        changeNameButton.setStyle("-fx-background-color: #7dacea");

        changePasswordButton.setPrefSize(CENTER_BUTTONS_WIDTH, BUTTONS_HEIGHT);
        //changePasswordButton.setOnAction(event -> controller.backButtonAction());
        changePasswordButton.setStyle("-fx-background-color: #7dacea");

        watchListRequestsButton.setPrefSize(BOTTOM_BUTTONS_WIDTH, BUTTONS_HEIGHT);
        watchListRequestsButton.setStyle("-fx-background-color: #7dacea");

        headerPane.getChildren().add(header);
        headerPane.setAlignment(Pos.CENTER);

        namePane.getChildren().addAll(avatar, nameLabel);
        namePane.setAlignment(Pos.CENTER_LEFT);
        namePane.setSpacing(NAME_SPACING_VALUE);

        centerPane.add(newNameField, 1, 1);
        centerPane.add(passwordField, 1, 2);
        centerPane.add(changeNameButton, 2, 1);
        centerPane.add(changePasswordButton, 2, 2);
        centerPane.setAlignment(Pos.CENTER);
        GridPane.setMargin(newNameField, new Insets(CENTER_SPACING_VALUE));
        GridPane.setMargin(passwordField, new Insets(CENTER_SPACING_VALUE));
        GridPane.setMargin(changeNameButton, new Insets(CENTER_SPACING_VALUE));
        GridPane.setMargin(changePasswordButton, new Insets(CENTER_SPACING_VALUE));

        botPane.getChildren().add(watchListRequestsButton);
        botPane.setAlignment(Pos.CENTER);

        windowPane.getChildren().addAll(headerPane, namePane, centerPane, botPane);
        windowPane.setSpacing(WINDOW_SPACING_VALUE);
        windowPane.setAlignment(Pos.CENTER_LEFT);
    }
}
