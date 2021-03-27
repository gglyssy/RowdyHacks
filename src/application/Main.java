package application;

import javafx.stage.Stage;

import java.util.Random;
import java.util.stream.IntStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	
	static Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = (BorderPane) FXMLLoader.load(Main.class.getResource("/view/MainScreen.fxml")); 		//Import from SceneBuilder fxml file
		Scene scene = new Scene(root); 															//Create new scene
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); //Add style to scene
		Main.primaryStage = primaryStage;
		primaryStage.setScene(scene);
		primaryStage.setTitle("Trivia Mayhem");
		primaryStage.show();
	}
	
	static int array[] = IntStream.range(0, 10).toArray();
	
	public static void shuffleArray(int[] array) {
	    int index;
	    Random random = new Random();
	    for (int i = array.length - 1; i > 0; i--)
	    {
	        index = random.nextInt(i + 1);
	        if (index != i)
	        {
	            array[index] ^= array[i];
	            array[i] ^= array[index];
	            array[index] ^= array[i];
	        }
	    }
	}
	
	public static Stage getStage() {
		return primaryStage;
	}
	
	public static void main(String[] args) {		
		Application.launch(args);
		shuffleArray(array);
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	public static int NumOfQuestions;
	public static String CategorySelected = "";

	public static void setNum(int num) {
		NumOfQuestions = num;
	}
	
	public static int getNum() {
		return NumOfQuestions;
	}
	
	public static void setCat(String cat) {
		CategorySelected = cat;
	}
	
	public static String getCat() {
		return CategorySelected;
	}
}