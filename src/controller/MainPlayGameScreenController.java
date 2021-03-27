package controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainPlayGameScreenController {

    @FXML
    public Button HTP;

    @FXML
    public Button Submit;

    @FXML
    public Button Quit;

    @FXML
    public void SubmitPressed(ActionEvent event) {

    }

    @FXML
    public void HTPPushed(ActionEvent event) throws IOException {
    	
       FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/HowToPlayInGame.fxml"));
 	   Parent root = loader.load();   
 	  
 	   Stage stage = new Stage();
 	   stage.setScene(new Scene(root));
 	   stage.show();
    }

    @FXML
    public void QuitPushed(ActionEvent event) throws IOException {
    	FXMLLoader main = new FXMLLoader(getClass().getResource("/view/MainScreen.fxml"));
		Parent root = main.load();
		Stage stage = Main.getStage();
		stage.setScene(new Scene(root));
		stage.show();
    }

}
