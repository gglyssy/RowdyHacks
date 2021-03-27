package controller;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    	Parent about;
		try {
			about = FXMLLoader.load(getClass().getResource("/view/AboutScreen.fxml"));
			Scene scene = new Scene(about);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//primaryStage.setScene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}