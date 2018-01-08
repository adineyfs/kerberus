package com.kerberus;

import java.io.IOException;

import org.fxmisc.richtext.CodeArea;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Components {
	
	public volatile static Components uniqueInstance;
	
	public BorderPane main;
	public Pane menu;
	public Pane header;
	public AnchorPane mainView;
	public Scene scene;
	public Stage stage;
	public CodeArea code;
	
	
	public Components() {
		try {
			//Call the main layouts
			main = FXMLLoader.load(getClass().getClassLoader().getResource("Main.fxml"));
			menu = (Pane) FXMLLoader.load(getClass().getClassLoader().getResource("Menu.fxml"));
			header = (Pane) FXMLLoader.load(getClass().getClassLoader().getResource("Header.fxml"));
			mainView = (AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("MainView.fxml"));			

			
			//Set the rounded corners on the main window
			Rectangle mainShape = new Rectangle(1400,900);
			mainShape.setArcHeight(30.0);
			mainShape.setArcWidth(30.0);
			main.setClip(mainShape);			
			
			//Sets the elements of the border pane
			main.setTop(header);
			main.setLeft(menu);
			main.setCenter(mainView);			
			
			code = (CodeArea) mainView.lookup("#codeAreaSqlStatement");
			
		} catch (IOException e) {
			throw new NullPointerException(getClass().toString());
		}
		
	}
	
	
	public static Components getUniqueInstance() {
        if (uniqueInstance == null)
        {
            synchronized (Components.class)
            {
                if (uniqueInstance == null)
                {
                    uniqueInstance = new Components();
                }
            }
        }
        return uniqueInstance;
    }

}
