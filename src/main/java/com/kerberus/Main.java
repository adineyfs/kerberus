package com.kerberus;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	
	private static Stage window;

	@Override
	public void start(Stage window) throws Exception {
		try {
			this.window = window;
			window.setTitle("Kerberus");
			window.initStyle(StageStyle.UTILITY);
			BorderPane main = (BorderPane) FXMLLoader.load(getClass().getResource("view/Main.fxml"));
			AnchorPane mainView = (AnchorPane) FXMLLoader.load(getClass().getResource("view/MainView.fxml"));
			
			main.setCenter(mainView);

			Scene scene = new Scene(main);
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

