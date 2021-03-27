package controller;

import java.io.IOException;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MainGameOptionsController {

	
	ObservableList<String> CategoriesOp = FXCollections.observableArrayList("Movies","History","Shows","Sports");
	ObservableList<Integer> NOQOp = FXCollections.observableArrayList(5,10);
	
    @FXML
    public ChoiceBox<Integer> NOQ;

    @FXML
    public ChoiceBox<String> Categories;

    @FXML
    public Button Launch;

    @FXML
    public MenuItem HTP;

    @FXML
    public MenuItem Home;

    @FXML
    public MenuItem Settings;

    @FXML
    public MenuItem About;
    
    
    
    
    public void initialize(){
        NOQ.setValue(5);
        NOQ.setItems(NOQOp);
    	Categories.setValue("Movies");
    	Categories.setItems(CategoriesOp);
    
    }
    
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
		stage.setTitle("How To Play Trivia Mayhem");
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
    public void LaunchPressed(ActionEvent event) throws IOException {
    	int num = NOQ.getValue();
    	String cat = Categories.getValue();
    	
    	Main.setNum(num);
    	Main.setCat(cat);
    	
    	FXMLLoader Start = new FXMLLoader(getClass().getResource("/view/MainPlayGameScreen.fxml"));
		Parent root = Start.load();
		Stage stage = Main.getStage();
		stage.setScene(new Scene(root));
		stage.show();
    }

}
