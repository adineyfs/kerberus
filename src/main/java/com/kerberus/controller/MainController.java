package com.kerberus.controller;

import java.util.LinkedList;

import com.kerberus.model.syntaxValidator.SyntaxAnalizer;
import com.kerberus.model.syntaxValidator.rules.util.PrettyStatement;
import com.kerberus.model.syntaxValidator.rules.util.Categories;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;



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
    
    @SuppressWarnings("restriction")
	@FXML
    private void handleTestButton() {
    	String sqlStatement = txtFieldSqlStatement.getText();
    	SyntaxAnalizer syntaxAnalyzer = new SyntaxAnalizer();
    	StringBuilder sb = syntaxAnalyzer.analyzeSql(sqlStatement);
    	txtAreaSqlValidationReturn.setText(sb.toString());
    	
    	LinkedList<PrettyStatement> ps = syntaxAnalyzer.ps;
    	
    	
    	for (int i = 0; i < ps.size(); i++) {
			//sb.append("\nLexeme: " + ps.get(i).getLexeme() + " - Category: " + Categories.categoryNames[ps.get(i).getCategory()] );
    		
    		sb.append("\nLexeme: " + ps.get(i).getLexeme() + " - Category: " + Categories.categoryNames[ps.get(i).getCategory()] );
    		
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

    /**
     * É chamado pela aplicação principal para dar uma referência de volta a si mesmo.
     * 
     * @param mainApp
     */
    public void setMainApp(Main main) {
        this.main = main;
    }
}


