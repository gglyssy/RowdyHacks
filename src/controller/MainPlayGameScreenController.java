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
    public Button Answer2;

    @FXML
    public Button Answer3;

    @FXML
    public Button Answer1;

    @FXML
    public MenuItem HTP;

    @FXML
    public MenuItem Home;

    @FXML
    public MenuItem Settings;

    @FXML
    public MenuItem About;
    
    @FXML
    public Label QuestionTitle;

    @FXML
    public Label SolutionTitle;
    
    HashMap<Categories, ArrayList<Questions>> questionMap = new HashMap<Categories, ArrayList<Questions>>();
    String choice1 = "";
    String choice2 = "";
    String choice3 = "";
    String choice4 = "";
    String solution = "";
    ArrayList<Questions> QAL = new ArrayList<Questions>();
    int questionNum = 0;
    
    public void initialize() throws IOException {
    	QuestionList ql = new QuestionList("Trivia Mayhem", questionMap);
    	ql.loadData("data/Questions.csv");
    	ql.loadCategories();
    	ArrayList<Questions> questionAL = ql.getDataList();
    	ArrayList<Categories> categoryAL = ql.getCategoryList();
    	HashMap<Categories, ArrayList<Questions>> questionMap = ql.createMap(categoryAL, questionAL);
    	String cat = Main.getCat();
    	int catNum = 1;
    	if(cat.equals("History")) {
    		catNum = 0;
    	}
    	if(cat.equals("Movies")){
    		catNum = 1;
    	}
    	if(cat.equals("Sports")) {
    		catNum = 2;
    	}
    	if(cat.equals("Shows")) {
    		catNum = 3;
    	}
    	Categories category = categoryAL.get(catNum);
    	QAL = questionMap.get(category);
    	Collections.shuffle(QAL);
    	String title = QAL.get(0).getQuestion();
    	choice1 = QAL.get(0).getChoice1();
    	choice2 = QAL.get(0).getChoice2();
    	choice3 = QAL.get(0).getChoice3();
    	choice4 = QAL.get(0).getChoice4();
    	solution = QAL.get(0).getAnswer();
    	QuestionTitle.setText(title);
    	Answer1.setText(choice1);
    	Answer2.setText(choice2);
    	Answer3.setText(choice3);
    	Answer4.setText(choice4);
    	SolutionTitle.setText("");
    	
    	
    }
    
    public void NextQuestion() {
    	String title = QAL.get(questionNum).getQuestion();
    	choice1 = QAL.get(questionNum).getChoice1();
    	choice2 = QAL.get(questionNum).getChoice2();
    	choice3 = QAL.get(questionNum).getChoice3();
    	choice4 = QAL.get(questionNum).getChoice4();
    	solution = QAL.get(questionNum).getAnswer();
    	QuestionTitle.setText(title);
    	Answer1.setText(choice1);
    	Answer2.setText(choice2);
    	Answer3.setText(choice3);
    	Answer4.setText(choice4);
    	SolutionTitle.setText("");
    }
    
    public void categoryComplete() {
    	SolutionTitle.setText("Congrats! You have comepleted this category");
    }
    
    @FXML
    public void checkSolution1(ActionEvent event) {
    	 if(choice1.equals(solution)) {
    		 SolutionTitle.setText("Correct!");
    		 questionNum++;
    		 if(questionNum > 4) {
    			 categoryComplete();
    		 }
    		 else
    			 NextQuestion();
    	 } 
    	 
    	 else {
    		 SolutionTitle.setText("Incorrect! The correct answer is : "+ solution);
    	 }
    }
    
    @FXML
    public void checkSolution2(ActionEvent event) {
    	if(choice2.equals(solution)) {
   		 	SolutionTitle.setText("Correct!");
   		 	questionNum++;
   		 	if(questionNum > 4) {
   		 		categoryComplete();
   		 	}
   		else
   			NextQuestion();
   	 	} 
    	
    	else {
   		 SolutionTitle.setText("Incorrect! The correct answer is : "+ solution);
   	 }
   }
    
    @FXML
    public void checkSolution3(ActionEvent event) {
    	if(choice3.equals(solution)) {
   		 SolutionTitle.setText("Correct!");
   		 questionNum++;
   		 if(questionNum > 4) {
   			 categoryComplete();
   		 }
   		 else
   			 NextQuestion();
   	 } 
    	
    	else {
   		 SolutionTitle.setText("Incorrect! The correct answer is : "+ solution);
   	 }
   }
    
    @FXML
    public void checkSolution4(ActionEvent event) {
    	if(choice4.equals(solution)) {
   		 SolutionTitle.setText("Correct!");
   		 questionNum++;
   		 if(questionNum > 4) {
   			 categoryComplete();
   		 }
   		 else
   			 NextQuestion();
   	 } 
    	
    	else {
   		 SolutionTitle.setText("Incorrect! The correct answer is : "+ solution);
   	 }
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
    public void SettingsOpened(ActionEvent event) {

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
    
    @FXML
    public void openAbout(ActionEvent event) throws IOException {
    	FXMLLoader about = new FXMLLoader(getClass().getResource("/view/AboutScreen.fxml"));
		Parent root = about.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.setTitle("About Trivia Mayhem");
		stage.show();
    }

}
