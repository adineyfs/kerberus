package com.kerberus.controller;

import com.kerberus.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HeaderController {
	
	private static double xOffset = 0;
	private static double yOffset = 0;
	
	@FXML
    private Button btnClose;
		
    private Main main;
    
    @FXML
    private Pane mainHeader;

    @FXML
    private void initialize() {
    	
    }
    
    @FXML
    private void handleBtnClose() {
        Stage stage = (Stage) Main.getPrimaryStage();
        stage.close();
    }
    
    @FXML
    private void handleOnMousePressed(MouseEvent event) {
    	Stage stage = (Stage) Main.getPrimaryStage();
    	xOffset = stage.getX() - event.getScreenX();
        yOffset = stage.getY() - event.getScreenY();
    }
    
    @FXML
    private void handleOnMouseDragged(MouseEvent event) {
    	Stage stage = (Stage) Main.getPrimaryStage();
    	stage.setX(event.getScreenX() + xOffset);
    	stage.setY(event.getScreenY() + yOffset);
    }
    
    public void setMainApp(Main main) {
        this.main = main;
    }

}
