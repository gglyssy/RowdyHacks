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

    public void initialize(){
        NOQ.setValue(5);
        NOQ.setItems(NOQOp);
    	Categories.setValue("Movies");
    	Categories.setItems(CategoriesOp);
    
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
