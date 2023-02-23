package com.example.week1lab;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.List;

public class HelloController {

    private List<ToDoItem> toDoItems
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}