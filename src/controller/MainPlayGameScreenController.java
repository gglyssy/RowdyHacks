package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import model.Categories;
import model.Questions;
import model.QuestionList;

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
    
    HashMap<Categories, ArrayList<Questions>> questionMap = new HashMap<Categories, ArrayList<Questions>>();
    
    public void initialize() throws IOException {
    	QuestionList ql = new QuestionList("Trivia Mayhem", questionMap);
    	ql.loadData("data/Questions.csv");
    	ql.loadCategories();
    	ArrayList<Questions> questionAL = ql.getDataList();
    	ArrayList<Categories> categoryAL = ql.getCategoryList();
    	HashMap<Categories, ArrayList<Questions>> questionMap = ql.createMap(categoryAL, questionAL);

    	
    }
    

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
		stage.setTitle("How To Play");
		stage.show();
    }

}
