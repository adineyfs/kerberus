package com.kerberus;

import java.io.IOException;

import org.fxmisc.richtext.CodeArea;

import com.kerberus.util.ErrorHandler;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Components {
	
	public volatile static Components uniqueInstance;
	
	public BorderPane main;
	public Pane menu;
	public HBox header;
	public VBox mainView;
	public Scene scene;
	public Stage stage;
	public CodeArea code;
	
	private ErrorHandler errorHandler = ErrorHandler.getInstance();
	
	
	public Components() {
		try {
			//Call the main layouts
			main = (BorderPane) FXMLLoader.load(getClass().getClassLoader().getResource("Main.fxml"));
			menu = (Pane) FXMLLoader.load(getClass().getClassLoader().getResource("Menu.fxml"));
			header = (HBox) FXMLLoader.load(getClass().getClassLoader().getResource("Header.fxml"));
			mainView = (VBox) FXMLLoader.load(getClass().getClassLoader().getResource("MainView.fxml"));			
			
			//LayoutUtil.setInitialLayout(main);
			
			/*Rectangle mainShape = new Rectangle(LayoutUtil.getScreenWidth() * 0.75, LayoutUtil.getScreenHeight() * 0.9);
			System.out.println(Screen.getPrimary().getVisualBounds());
			mainShape.setArcHeight(60.0);
			mainShape.setArcWidth(60.0);
			main.setClip(mainShape);*/
			
			//Sets the elements of the border pane
			main.setTop(header);
			main.setLeft(menu);
			main.setCenter(mainView);
			
			code = (CodeArea) mainView.lookup("#codeAreaSqlStatement");
			
		} catch (IOException e) {
			errorHandler.throwError(e.toString());
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
