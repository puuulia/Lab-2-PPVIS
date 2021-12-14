package com.example.laba2.controllers;

import com.example.laba2.Window;
import com.example.laba2.scenes.LogInScene;
import com.example.laba2.scenes.RegistrationScene;

public class StartController {
    public void logInButtonAction() {
        Window.openNewScene(new LogInScene());
    }

    public void registrationButtonAction() {
        Window.openNewScene(new RegistrationScene());
    }
}