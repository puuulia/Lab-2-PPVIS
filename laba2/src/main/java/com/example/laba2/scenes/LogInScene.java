package com.example.laba2.scenes;

import com.example.laba2.controllers.LogInController;
import com.example.laba2.controllers.RegistrationController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class LogInScene extends Scene {
    private static final int WINDOW_HEIGHT = (int)(3.3 * ONE_PART);
    private static final int WINDOW_WIDTH = 4 * ONE_PART;
    private static final int FONT_SIZE_FOR_TEXT = ONE_PART / 6;
    private static final int WINDOW_SPACING_VALUE = 3 * ONE_PART / 10;
    private static final int CENTER_SPACING_VALUE = ONE_PART / 10;
    private static final int BUTTONS_WIDTH = 4 * ONE_PART / 3;
    private static final String PROMPT_TEXT = "Введите текст";


    private final Label loginLabel = new Label("Введите логин:");
    private final Label passwordLabel = new Label("Введите пароль:");
    private final Label individualNumberLabel = new Label("Введите индивидуальный номер работника:");

    private final TextField loginField = new TextField();
    private final PasswordField passwordField = new PasswordField();
    private final TextField individualNumberField = new TextField();

    private final Button backButton = new Button("< НАЗАД");
    private final Button enterButton = new Button("ВОЙТИ >");

    private static VBox windowPane;
    private final AnchorPane buttonsPane = new AnchorPane();
    private final HBox headerPane = new HBox();
    private final VBox centerPane = new VBox();

    public LogInScene() {
        super(windowPane = new VBox(), WINDOW_WIDTH, WINDOW_HEIGHT);
        windowName = "Авторизация";
        header.setText("АВТОРИЗАЦИЯ");
        LogInController controller = new LogInController();

        loginLabel.setFont(new Font(FONT_SIZE_FOR_TEXT));
        passwordLabel.setFont(new Font(FONT_SIZE_FOR_TEXT));
        individualNumberLabel.setFont(new Font(FONT_SIZE_FOR_TEXT));
        loginLabel.setAlignment(Pos.BOTTOM_LEFT);

        loginField.setPromptText(PROMPT_TEXT);
        passwordField.setPromptText(PROMPT_TEXT);
        individualNumberField.setPromptText(PROMPT_TEXT);

        enterButton.setPrefSize(BUTTONS_WIDTH, BUTTONS_HEIGHT);
        enterButton.setOnAction(event -> controller.enterButtonAction());
        enterButton.setStyle("-fx-background-color: #7dacea");

        backButton.setPrefSize(BUTTONS_WIDTH, BUTTONS_HEIGHT);
        backButton.setOnAction(event -> controller.backButtonAction());
        backButton.setStyle("-fx-background-color: #7dacea");

        buttonsPane.getChildren().addAll(backButton, enterButton);
        AnchorPane.setLeftAnchor(backButton, 0.0);
        AnchorPane.setRightAnchor(enterButton, 0.0);

        headerPane.getChildren().add(header);
        headerPane.setAlignment(Pos.CENTER);

        centerPane.getChildren().addAll(loginLabel, loginField, passwordLabel,
                passwordField, individualNumberLabel, individualNumberField);
        centerPane.setAlignment(Pos.CENTER_LEFT);
        centerPane.setSpacing(CENTER_SPACING_VALUE);

        windowPane.getChildren().addAll(headerPane, centerPane, buttonsPane);
        windowPane.setSpacing(WINDOW_SPACING_VALUE);
        windowPane.setAlignment(Pos.CENTER_LEFT);
    }
}
