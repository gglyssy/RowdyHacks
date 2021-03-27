package controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MainPlayGameScreenController {

    @FXML
    public Button Answer4;

    @FXML
    public MenuItem GoHome;

    @FXML
    public Button Answer2;

    @FXML
    public Button Answer3;

    @FXML
    public Button Answer1;

    @FXML
    public MenuItem HTP;

    @FXML
    public void GoHomePressed(ActionEvent event) throws IOException {
    	FXMLLoader main = new FXMLLoader(getClass().getResource("/view/MainScreen.fxml"));
		Parent root = main.load();
		Stage stage = Main.getStage();
		stage.setScene(new Scene(root));
		stage.show();
    }

    @FXML
    public void HTPPressed(ActionEvent event) throws IOException {
    	FXMLLoader HTP = new FXMLLoader(getClass().getResource("/view/HowToPlayInGame.fxml"));
		Parent root = HTP.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
    }

}
