package controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;

public class SettingsController {

	

	
    @FXML
    public Button Cancel;

    @FXML
    public Button Save;

    @FXML
    public Slider VolumeSlider;
	

    public static Double oldVolume = .5;
    public Double newVolume;
    

    public void initialize() {
    	VolumeSlider.setValue(oldVolume*100);
    }
    
    @FXML
    public void SaveChanges(ActionEvent event) {
    	
    	newVolume = VolumeSlider.getValue()/100;
    	VolumeSlider.setValue(newVolume*100);
    	oldVolume = newVolume;
    	Main.updateVol(newVolume);
    }

    @FXML
    public void CancelChanges(ActionEvent event) {
    	VolumeSlider.setValue(oldVolume*100);
    }

}
