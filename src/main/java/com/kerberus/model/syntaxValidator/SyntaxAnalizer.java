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
                
        String statement = "select _col_1,_col_2,_col_3 FROM some_table WHerE _col_2 = 1 AND _"
        		+ "col_3 = 4 OR _col_4 = 30";
        //String statement = "select _ord1,one_two_three,_a_b_c,___4,colum5,colum6,colum FROM product WHERE hola = 1 ;";
        //String statement = "select column1,column2,colum3,colum4,colum5,colum6,colum, FROM product WHERE hola = 1 AND hola = 2";
        //String statement = "select column1,column2,colum3,colum4,colum5,colum6,colum ? FROM product WHERE hola = 1 AND hola = 2";
        
		JFlex_Rules_SQL Lex_Analyzer = new JFlex_Rules_SQL( new BufferedReader( new StringReader(sqlStatement) ) ); 
		Cup_Rules_SQL Syntax_Analyzer = new Cup_Rules_SQL(Lex_Analyzer);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n\n\n\n----- Lexical and Syntactical Analysis ------\n");
		sb.append("Statement: \"" + sqlStatement + "\"\n");
		
		try {
			
			// Run Syntax Analyzer
			Syntax_Analyzer.parse();
			
			// Debug Mode
			//Syntax_Analyzer.debug_stack();
			//Syntax_Analyzer.debug_parse();
			
			sb.append("\n-------------- Finished Analysis -----------------------");
			sb.append("\nnumber of errors found: " + Syntax_Analyzer.TableSE.size() );
			sb.append("\n----------------------------------------------------------\n");
			
			if( !Syntax_Analyzer.TableSE.isEmpty() ){
				int co,ro;
				String le,err;
				
				co = Syntax_Analyzer.TableSE.getFirst().getColumn();
				ro = Syntax_Analyzer.TableSE.getFirst().getRow();
				le = Syntax_Analyzer.TableSE.getFirst().getLexeme();
				le = Syntax_Analyzer.TableSE.getFirst().getLexeme();
				err = Syntax_Analyzer.TableSE.getFirst().getDescription();
				
				sb.append(sqlStatement);
				
				for (int i = 0; i < co; i++) {
					
					if( i == (co-1) )
						sb.append("\n^ " + err );
				}
				
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
