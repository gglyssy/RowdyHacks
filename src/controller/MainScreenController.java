package controller;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainScreenController {

    @FXML
    public Button StartAGame;
    
    @FXML
    public Button HowToPlay;

    @FXML
    public Button About;

    @FXML
    public void StartAGamePressed(ActionEvent event) {
    	System.out.println("Start pressed");
    }

    @FXML
    public void HowToPlayPressed(ActionEvent event) {
    	System.out.println("HTP pressed");
    }

    @FXML
    public void AboutPressed(ActionEvent event) {
    	System.out.println("About pressed");
    }

}