package application;

import javafx.stage.Stage;

import java.util.Random;
import java.util.stream.IntStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root=FXMLLoader.load(getClass().getResource("/view/MainScreen.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
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
	
	public static void main(String[] args) {
		
		launch(args);
		System.out.println("test again!");
		shuffleArray(array);
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
