package application;

import javafx.stage.Stage;

import java.io.File;
import controller.SettingsController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Main extends Application {
	
	static MediaPlayer mediaPlayer;
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
		
		String musicFile = "ChillVibes.mp3"; 
		// Play music
		Media sound = new Media(new File(musicFile).toURI().toString());
		mediaPlayer = new MediaPlayer(sound);
		Double Volume = SettingsController.oldVolume;
		mediaPlayer.setVolume(Volume);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer.play();
	}
	
	public static void updateVol(double NewVolume) {
		mediaPlayer.setVolume(NewVolume);
	}
	
	public static Stage getStage() {
		return primaryStage;
	}
	
	public static void main(String[] args) {		
		Application.launch(args);
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