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

public class AboutScreenController {

    @FXML
    public Button GoBackButton;

    @FXML
    public void goBackToMain(ActionEvent event) throws IOException {
    	FXMLLoader main = new FXMLLoader(getClass().getResource("/view/MainScreen.fxml"));
		Parent root = main.load();
		Stage stage = Main.getStage();
		stage.setScene(new Scene(root));
		stage.show();
    }

}
