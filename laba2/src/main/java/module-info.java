module com.example.laba2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laba2 to javafx.fxml;
    exports com.example.laba2;
    exports com.example.laba2.scenes;
    opens com.example.laba2.scenes to javafx.fxml;
    exports com.example.laba2.controllers;
    opens com.example.laba2.controllers to javafx.fxml;
}