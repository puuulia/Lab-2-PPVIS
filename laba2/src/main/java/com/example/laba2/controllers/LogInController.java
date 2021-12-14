package com.example.laba2.controllers;

import com.example.laba2.Window;
import com.example.laba2.scenes.*;

public class LogInController {
    public void backButtonAction() {
        //Window.openNewScene(new StartScene());
    }

    public void enterButtonAction() {
        Window.openNewWindow(new ProfileScene());
        Window.openNewWindow(new TraineeScene());
        Window.openNewWindow(new ManagerScene());
        Window.openNewWindow(new GardenerScene());
    }
}
