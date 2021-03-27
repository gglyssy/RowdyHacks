package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
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
import javafx.scene.control.Label;
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
    
    @FXML
    public Label QuestionTitle;

    @FXML
    public Label SolutionTitle;
    
    HashMap<Categories, ArrayList<Questions>> questionMap = new HashMap<Categories, ArrayList<Questions>>();
    
    public void initialize() throws IOException {
    	QuestionList ql = new QuestionList("Trivia Mayhem", questionMap);
    	ql.loadData("data/Questions.csv");
    	ql.loadCategories();
    	ArrayList<Questions> questionAL = ql.getDataList();
    	ArrayList<Categories> categoryAL = ql.getCategoryList();
    	HashMap<Categories, ArrayList<Questions>> questionMap = ql.createMap(categoryAL, questionAL);
    	Categories category = categoryAL.get(1);
    	ArrayList<Questions> QAL = questionMap.get(category);
    	Collections.shuffle(QAL);
    	String title = QAL.get(1).getQuestion();
    	String choice1 = QAL.get(1).getChoice1();
    	String choice2 = QAL.get(1).getChoice2();
    	String choice3 = QAL.get(1).getChoice3();
    	String choice4 = QAL.get(1).getChoice4();
    	QuestionTitle.setText(title);
    	Answer1.setText(choice1);
    	Answer2.setText(choice2);
    	Answer3.setText(choice3);
    	Answer4.setText(choice4);
    	
    	
    }
    
    @FXML
    public void checkSolution(ActionEvent event) {
    	System.out.println("Answer Pushed");
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
