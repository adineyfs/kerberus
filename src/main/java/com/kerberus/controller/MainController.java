package com.kerberus.controller;

import java.util.LinkedList;

import org.fxmisc.richtext.CodeArea;

import com.kerberus.Main;
import com.kerberus.model.syntaxValidator.SyntaxAnalizer;
import com.kerberus.model.syntaxValidator.rules.util.PrettyStatement;
import com.kerberus.util.LogFileUtil;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class MainController {
	
	@FXML
    private CodeArea codeAreaSqlStatement;
	
	@FXML
	private TextArea txtAreaSqlValidationReturn;

    @FXML
    private void initialize() {

    }
    
	@FXML
    private void handleValidateButton() {
    	String sqlStatement = codeAreaSqlStatement.getText();
    	SyntaxAnalizer syntaxAnalyzer = new SyntaxAnalizer();
    	StringBuilder sb = syntaxAnalyzer.analyzeSql(sqlStatement);
    	
    	LinkedList<PrettyStatement> ps = syntaxAnalyzer.ps;
    	
    	/*for (int i = 0; i < ps.size(); i++) {
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
		//}
    	this.writeFile(sb);
    	
    	txtAreaSqlValidationReturn.setText(sb.toString());
    }
	
	
	@FXML
    private void handleTestButton() {
		BorderPane border = (BorderPane) Main.getRoot();
		border.setCenter(new Button("aa"));
	}
	
	@FXML
	private void handleKeyPressed() {

	}
	
	
	private void writeFile(StringBuilder sb) {
		try {
			LogFileUtil logFile = new LogFileUtil();
			logFile.writeLine(sb.toString());
		} catch (Exception e) {
			System.out.println("Error creating file");
		}
	}
    
}


