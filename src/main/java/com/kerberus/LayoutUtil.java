package com.kerberus;

import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class LayoutUtil {
	
	public static void setInitialLayout(Stage main) {
		Components components = Components.getUniqueInstance();
		main.setMaximized(false);
		main.setHeight(getScreenHeight() * 0.9);
		main.setWidth(getScreenWidth() * 0.75);
		Rectangle mainShape = new Rectangle(getScreenWidth() * 0.75, getScreenHeight() * 0.9);
		mainShape.setArcHeight(60.0);
		mainShape.setArcWidth(60.0);
		
		BorderPane mainView = components.main;
		mainView.setClip(mainShape);
	}
	
	public static void setMaximizedLayout(Stage main) {
		Components components = Components.getUniqueInstance();
		main.setMaximized(true);
		Rectangle mainShape = new Rectangle(getScreenWidth(), getScreenHeight());
		BorderPane mainView = components.main;
		mainView.setClip(mainShape);
	}
	
	public static double getScreenWidth() {
		return Screen.getPrimary().getVisualBounds().getWidth();
	}
	
	public static double getScreenHeight() {
		return Screen.getPrimary().getVisualBounds().getHeight();
	}

}
