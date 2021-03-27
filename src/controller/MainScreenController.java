package controller;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainScreenController {

    @FXML
    public Button Sample;

    @FXML
    public void onPress(ActionEvent event) {
    	System.out.println("The button works");
    }

}