package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainScreenController {

	private Stage primaryStage;
	
    @FXML
    public Button StartAGame;
    
    @FXML
    public Button HowToPlay;

    @FXML
    public Button About;
    
    @FXML
    public void StartAGamePressed(ActionEvent event) throws IOException {
    	FXMLLoader Start = new FXMLLoader(getClass().getResource("/view/MainGameOptions.fxml"));
		Parent root = Start.load();
		Stage stage = Main.getStage();
		stage.setScene(new Scene(root));
		stage.show();
    }

    @FXML
    public void HowToPlayPressed(ActionEvent event) throws IOException {
    	FXMLLoader HTP = new FXMLLoader(getClass().getResource("/view/HowToPlayScreen.fxml"));
		Parent root = HTP.load();
		Stage stage = Main.getStage();
		stage.setScene(new Scene(root));
		stage.show();
    }

    @FXML
    public void AboutPressed(ActionEvent event) throws IOException {
			FXMLLoader about = new FXMLLoader(getClass().getResource("/view/AboutScreen.fxml"));
			Parent root = about.load();
			Stage stage = Main.getStage();
			stage.setScene(new Scene(root));
			stage.show();
		
    }
    
    

}