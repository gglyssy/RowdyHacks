package controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class EndController {

    @FXML
    public Button PA;

    @FXML
    public MenuItem HomeMenu;

    @FXML
    public Label Message;
    
    @FXML
    public MenuItem HTP;

    @FXML
    public Button Home;

    @FXML
    public MenuItem Settings;

    @FXML
    public MenuItem About;
    
    public void initialize() {
    	String outMessage = MainPlayGameScreenController.getMessage();
    	Message.setText(outMessage);
    }
    
    @FXML
    public void GoHome(ActionEvent event) throws IOException {
    	FXMLLoader main = new FXMLLoader(getClass().getResource("/view/MainScreen.fxml"));
		Parent root = main.load();
		Stage stage = Main.getStage();
		stage.setScene(new Scene(root));
		stage.show();
    }

    @FXML
    public void openSettings(ActionEvent event) throws IOException {
    	FXMLLoader HTP = new FXMLLoader(getClass().getResource("/view/Settings.fxml"));
		Parent root = HTP.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.setTitle("Settings of Trivia Mayhem");
		stage.show();
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
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.setTitle("About Trivia Mayhem");
		stage.show();
    }

    @FXML
    public void PAPressed(ActionEvent event) throws IOException {
    	FXMLLoader Start = new FXMLLoader(getClass().getResource("/view/MainGameOptions.fxml"));
		Parent root = Start.load();
		Stage stage = Main.getStage();
		stage.setScene(new Scene(root));
		stage.show();
    }

    @FXML
    public void goHome(ActionEvent event) throws IOException {
    	FXMLLoader main = new FXMLLoader(getClass().getResource("/view/MainScreen.fxml"));
		Parent root = main.load();
		Stage stage = Main.getStage();
		stage.setScene(new Scene(root));
		stage.show();
    }

}
