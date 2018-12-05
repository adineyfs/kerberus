package com.kerberus;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Main extends Application {
	
	private static Stage window;
	
	private Components components;
	public Actions actions;
	
	public Main() {
		components = Components.getUniqueInstance();
	}

	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		primaryStage.setTitle("Kerberus");
		primaryStage.getIcons().add(new Image("Kerberus_logo_icon.png"));
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		
		components.scene = new Scene(components.main);
		components.scene.setFill(Color.TRANSPARENT);
		primaryStage.setScene(components.scene);
		components.stage = window;
		LayoutUtil.setInitialLayout(primaryStage);
		actions = new Actions(components, primaryStage);
        actions.setActions();
		
		primaryStage.show();
	}
	
	public static Parent getRoot() {
		Scene scene = window.getScene();
		return scene.getRoot();
	}
	
	public static Stage getPrimaryStage() {
        return window;
    }

	public static void main(String[] args) {	      
		launch(args);

	}
}

