package com.example.laba2.scenes;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class Scene extends javafx.scene.Scene {
    protected static final int ONE_PART = 100;
    protected static final int HEADER_FONT_SIZE = (int) (0.2 * ONE_PART);
    protected static final int BUTTONS_HEIGHT = ONE_PART / 3;
    public String windowName;

    protected Label header = new Label();

    public Scene(Pane pane, int width, int height) {
        super(pane, width, height);
        header.setFont(new Font(HEADER_FONT_SIZE));
        header.setStyle("-fx-font-weight: bold");
    }
}
