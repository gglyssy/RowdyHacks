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
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MainScreenController {

	private Stage primaryStage;
	
	@FXML
    public Button StartAGame;

    @FXML
    public MenuItem HTP;

    @FXML
    public MenuItem Home;

    @FXML
    public MenuItem Settings;

    @FXML
    public MenuItem About;
    
    
    @FXML
    public void goHome(ActionEvent event) throws IOException {
    	FXMLLoader main = new FXMLLoader(getClass().getResource("/view/MainScreen.fxml"));
		Parent root = main.load();
		Stage stage = Main.getStage();
		stage.setScene(new Scene(root));
		stage.show();
    }

    @FXML
    public void SettingsOpened(ActionEvent event) {

    }

    @FXML
    public void HTPPushed(ActionEvent event) throws IOException {
    	FXMLLoader HTP = new FXMLLoader(getClass().getResource("/view/HowToPlayInGame.fxml"));
		Parent root = HTP.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.setTitle("How To Play");
		stage.show();
    }

    @FXML
    public void openAbout(ActionEvent event) throws IOException {
    	FXMLLoader about = new FXMLLoader(getClass().getResource("/view/AboutScreen.fxml"));
		Parent root = about.load();
		Stage stage = Main.getStage();
		stage.setScene(new Scene(root));
		stage.show();
    }
    
    @FXML
    public void StartAGamePressed(ActionEvent event) throws IOException {
    	FXMLLoader Start = new FXMLLoader(getClass().getResource("/view/MainGameOptions.fxml"));
		Parent root = Start.load();
		Stage stage = Main.getStage();
		stage.setScene(new Scene(root));
		stage.show();
    }   

}