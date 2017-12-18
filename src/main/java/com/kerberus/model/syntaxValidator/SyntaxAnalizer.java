package com.kerberus.model.syntaxValidator;

import java.io.BufferedReader;
import java.io.StringReader;

import com.kerberus.model.syntaxValidator.rules.sql.*;
import com.kerberus.model.syntaxValidator.rules.util.CupUtil;
import com.kerberus.model.syntaxValidator.rules.util.FlexUtil;
import com.kerberus.model.syntaxValidator.rules.util.UtilFiles;

public class SyntaxAnalizer {
	
	public StringBuilder analyzeSql(String sqlStatement) {
		

        // ----------- SQL ----------------------------------------------------------------------- 
                
        //String statement = "select _col_1,_col_2,_col_3 FROM some_table WHerE _col_2 = 1 AND _col_3 = 4 OR _col_4 = 30";
		
		JFlex_Rules_SQL Lex_Analyzer = new JFlex_Rules_SQL( new BufferedReader( new StringReader(sqlStatement) ) ); 
		Cup_Rules_SQL Syntax_Analyzer = new Cup_Rules_SQL(Lex_Analyzer);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("----- Lexical and Syntactical Analysis ------\n");
		//sb.append("Statement: \"" + sqlStatement + "\"\n");
		
		try {
			
			// Run Syntax Analyzer
			Syntax_Analyzer.parse();
			
			// Debug Mode
			//Syntax_Analyzer.debug_stack();
			//Syntax_Analyzer.debug_parse();
			
			sb.append("\n-------------- Finished Analysis -----------------------");
			
			if( Syntax_Analyzer.errors > 0 ){
				sb.append("\nnumber of errors found: " + Syntax_Analyzer.errors );
				sb.append(Syntax_Analyzer.the_error_message);
				
			}
			else {
				sb.append("\n -------> Statement is good to go!" );
			}
			
			sb.append("\n-------------- Findings Analysis -----------------------");
			sb.append("\nTable_name (to be validated): " +  Syntax_Analyzer.table_name);
			sb.append("\n" + Syntax_Analyzer.Columns.size()+ " Columns found (to be validated): " + Syntax_Analyzer.Columns);
			
			
			
		} catch (Exception e) {
			// printStackTrace method
            // prints line numbers + call stack
            e.printStackTrace();
             
            // Prints what exception has been thrown
            System.out.println(e);
		}
		
		return sb;

        
        // ------ A SMALL TEST -----------------------------------------------------------------
        
        /*LexAnalyzer_commas Lex_Analyzer = new LexAnalyzer_commas( new BufferedReader( new StringReader("hey, hola, SELECT * ; ") ) ); 
        SyntaxAnalyzer_commas Syntax_Analyzer = new SyntaxAnalyzer_commas(Lex_Analyzer);
		
		try {
			Syntax_Analyzer.parse();
			sb.append("Finished process. # of errors" + Syntax_Analyzer.TableSE.size() );
		} catch (Exception e) {
			// printStackTrace method
            // prints line numbers + call stack
            e.printStackTrace();
             
            // Prints what exception has been thrown
            sb.append(e);
		}*/
	}

}
