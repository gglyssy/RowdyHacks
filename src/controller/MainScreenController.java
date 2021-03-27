package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainScreenController {

    @FXML
    private Button Sample;

    @FXML
    private void onPress(ActionEvent event) {
    	System.out.println("This button was pressed.");
    }
}