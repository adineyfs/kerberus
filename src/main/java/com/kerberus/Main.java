package com.kerberus;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	
	private static Stage window;

	@Override
	public void start(Stage window) throws Exception {
		try {
			this.window = window;
			window.setTitle("Kerberus");
			window.initStyle(StageStyle.TRANSPARENT);
			
			//Call the main layouts
			BorderPane main = FXMLLoader.load(getClass().getResource("view/Main.fxml"));
			Pane menu = (Pane) FXMLLoader.load(getClass().getResource("view/Menu.fxml"));
			Pane header = (Pane) FXMLLoader.load(getClass().getResource("view/header.fxml"));
			AnchorPane mainView = (AnchorPane) FXMLLoader.load(getClass().getResource("view/MainView.fxml"));
			
			//Set the rounded corners on the main window
			Rectangle mainShape = new Rectangle(1000,600);
			mainShape.setArcHeight(60.0);
			mainShape.setArcWidth(60.0);
			main.setClip(mainShape);			
			
			//Sets the elements of the border pane
			main.setTop(header);
			main.setLeft(menu);
			
			main.setCenter(mainView);
			
			Scene scene = new Scene(main);
			scene.setFill(Color.TRANSPARENT);
			window.setScene(scene);
			window.show();
		} catch (IOException e) {
            e.printStackTrace();
        }

        //initRootLayout();
	}
	
	public static Parent getRoot() {
		Scene scene = window.getScene();
		return scene.getRoot();
	}
	
	public Stage getPrimaryStage() {
        return window;
    }

	public static void main(String[] args) {
		launch(args);
	}
}

