package com.kerberus.controller;

import com.kerberus.model.syntaxValidator.SyntaxAnalizer;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
    private TextField txtFieldSqlStatement;
	
	@FXML
	private TextArea txtAreaSqlValidationReturn;
	
    // Reference to the main application.
    private Main main;

    /**
     * Inicializa a classe controller. Este método é chamado automaticamente
     *  após o arquivo fxml ter sido carregado.
     */
    @FXML
    private void initialize() {
    	
    }
    
    @FXML
    private void handleTestButton() {
    	String sqlStatement = txtFieldSqlStatement.getText();
    	SyntaxAnalizer syntaxAnalyzer = new SyntaxAnalizer();
    	StringBuilder sb = syntaxAnalyzer.analyzeSql(sqlStatement);
    	txtAreaSqlValidationReturn.setText(sb.toString());
    }

    /**
     * É chamado pela aplicação principal para dar uma referência de volta a si mesmo.
     * 
     * @param mainApp
     */
    public void setMainApp(Main main) {
        this.main = main;
    }
}


