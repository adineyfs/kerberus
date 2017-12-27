package com.kerberus.controller;

import java.util.LinkedList;

import com.kerberus.Main;
import com.kerberus.model.syntaxValidator.SyntaxAnalizer;
import com.kerberus.model.syntaxValidator.rules.util.PrettyStatement;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class MainController {
	
	@FXML
    private TextArea txtAreaSqlStatement;
	
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
    private void handleValidateButton() {
    	String sqlStatement = txtAreaSqlStatement.getText();
    	SyntaxAnalizer syntaxAnalyzer = new SyntaxAnalizer();
    	StringBuilder sb = syntaxAnalyzer.analyzeSql(sqlStatement);
    	
    	LinkedList<PrettyStatement> ps = syntaxAnalyzer.ps;
    	
    	
    	for (int i = 0; i < ps.size(); i++) {
			//sb.append("\nLexeme: " + ps.get(i).getLexeme() + " - Category: " + Categories.categoryNames[ps.get(i).getCategory()] );
    		
    		//sb.append("\nLexeme: " + ps.get(i).getLexeme() + " - Category: " + Categories.categoryNames[ps.get(i).getCategory()] );
    		sb.append("\nLexeme: " + ps.get(i).getLexeme());
    		
    		/*
    		if( Categories.categoryNames[ps.get(i).getCategory()] == "RESERVED" ) {
    			
    		}
    		else
    		Text text;
    		txtAreaSqlValidationReturn.setText()
    		*/
		}   
    	
    	txtAreaSqlValidationReturn.setText(sb.toString());
    }
	
	
	@FXML
    private void handleTestButton() {
		BorderPane border = (BorderPane) Main.getRoot();
		border.setCenter(new Button("aa"));
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


