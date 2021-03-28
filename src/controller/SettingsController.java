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
    

    @FXML
    public void SaveChanges(ActionEvent event) {
    	
    	this.newVolume = VolumeSlider.getValue()/100;
    	this.VolumeSlider.setValue(newVolume*100);
    	this.oldVolume = newVolume;
    	Main.updateVol(newVolume);
    }

    @FXML
    public void CancelChanges(ActionEvent event) {
    	this.VolumeSlider.setValue(oldVolume*100);
    }

}
