package com.kerberus.controller;

import java.util.LinkedList;

import org.fxmisc.richtext.CodeArea;

import com.kerberus.Main;
import com.kerberus.model.syntaxValidator.SyntaxAnalizer;
import com.kerberus.model.syntaxValidator.SyntaxAnalizerServer;
import com.kerberus.model.syntaxValidator.rules.util.PrettyStatement;
import com.kerberus.util.Cache;
import com.kerberus.util.ErrorHandler;
import com.kerberus.util.LogFileUtil;

import com.kerberus.DatabaseController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

public class MainController {
	
	private LogFileUtil logFile = LogFileUtil.getInstance();
	private ErrorHandler errorHandler = ErrorHandler.getInstance();
	
	@FXML
    private CodeArea codeAreaSqlStatement;
	
	@FXML
	private CodeArea codeAreaSqlValidationReturn;
	
	@FXML
	private Button btnValidate;
	
	@FXML
	private ComboBox comboDatabaseOption;
	

    @FXML
    private void initialize() {

    }
    @FXML
    private void handleValidateButton() {
		//System.out.println("Hello " + comboDatabaseOption.getValue());
		if(comboDatabaseOption.getValue().equals("Oracle")) {
			System.out.println("This is in Oracle!!!!");
			Cache cache = Cache.getInstance();
	    	String sqlStatement = codeAreaSqlStatement.getText();
	    	int databaseOption = comboDatabaseOption.getSelectionModel().getSelectedIndex();
	    	SyntaxAnalizer syntaxAnalyzer = new SyntaxAnalizer();
	    	
	    	cache.setSQLStatement(sqlStatement);
	    	cache.setDatabaseOption(databaseOption);
	    	
	    	StringBuilder sb = syntaxAnalyzer.analyzeSql(sqlStatement);
	    	
	    	LinkedList<PrettyStatement> ps = syntaxAnalyzer.ps;
	    	
	    	/*for (int i = 0; i < ps.size(); i++) {
	    	//sb.append("<h1>teste</h1>");
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
			//}
	    	this.writeFile(sb);
	    	codeAreaSqlValidationReturn.clear();
	    	codeAreaSqlValidationReturn.replaceText(sb.toString());
	    	
	    	System.out.println("This is sb: " + sb);
	    	
	    	codeAreaSqlValidationReturn.deleteText(0,1);
	    	codeAreaSqlValidationReturn.position(0, 0);
	    	
	    	/*
	    	int index = codeAreaSqlValidationReturn.getText().indexOf("Lexical");
	    	codeAreaSqlValidationReturn.moveTo(index);
	    	codeAreaSqlValidationReturn.selectRange(index, index);
	    	*/
	    	
	    	//System.out.println("----> index: " + index);
	    	
	    	//DatabaseController.runSQLStatement(sqlStatement);
		}
		else {
			System.out.println("This is in Server");
			Cache cache = Cache.getInstance();
	    	String sqlStatement = codeAreaSqlStatement.getText();
	    	int databaseOption = comboDatabaseOption.getSelectionModel().getSelectedIndex();
	    	SyntaxAnalizerServer syntaxAnalyzerServer = new SyntaxAnalizerServer();
	    	
	    	cache.setSQLStatement(sqlStatement);
	    	cache.setDatabaseOption(databaseOption);
	    	
	    	StringBuilder sb = syntaxAnalyzerServer.analyzeSql(sqlStatement);
	    	
	    	LinkedList<PrettyStatement> ps = syntaxAnalyzerServer.ps;
	    	
	    	/*for (int i = 0; i < ps.size(); i++) {
	    	//sb.append("<h1>teste</h1>");
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
			//}
	    	this.writeFile(sb);
	    	codeAreaSqlValidationReturn.clear();
	    	codeAreaSqlValidationReturn.replaceText(sb.toString());
	    	
	    	codeAreaSqlValidationReturn.deleteText(0,1);
	    	codeAreaSqlValidationReturn.position(0, 0);
	    	
	    	/*
	    	int index = codeAreaSqlValidationReturn.getText().indexOf("Lexical");
	    	codeAreaSqlValidationReturn.moveTo(index);
	    	codeAreaSqlValidationReturn.selectRange(index, index);
	    	*/
	    	
	    	//System.out.println("----> index: " + index);
	    	//DatabaseController.runSQLStatement(sqlStatement);
		}
    }
	
	
	@FXML
    private void handleTestButton() {
		BorderPane border = (BorderPane) Main.getRoot();
		border.setCenter(new Button("aa"));
	}
	
	@FXML
	private void handleKeyPressed() {

	}
	
	@FXML
	public void handleEnterPress(KeyEvent event){
	    if(event.getCode().toString().equals("ENTER") && event.isControlDown()) {
	    	this.handleValidateButton();
	    }
	}
	
	
	private void writeFile(StringBuilder sb) {
		try {
			logFile.CreateLogFile();
			logFile.writeLine(sb.toString());
			logFile.close();
		} catch (Exception e) {
			errorHandler.throwError(e.toString());
		}
	}
    
}


