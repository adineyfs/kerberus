package com.kerberus.model.syntaxValidator;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.LinkedList;

import com.kerberus.model.syntaxValidator.rules.sql.Cup_Rules_SQL;
import com.kerberus.model.syntaxValidator.rules.sql.JFlex_Rules_SQL;
import com.kerberus.model.syntaxValidator.rules.util.PrettyStatement;
import com.kerberus.util.ErrorHandler;
import com.kerberus.util.LogFileUtil;

public class SyntaxAnalizer {
	
	public LinkedList<PrettyStatement> ps = new LinkedList<PrettyStatement>();
	
	private LogFileUtil logFile = LogFileUtil.getInstance();
	
	private ErrorHandler errorHandler = ErrorHandler.getInstance();
	
	public StringBuilder analyzeSql(String sqlStatement) {
		

        // ----------- SQL ----------------------------------------------------------------------- 
                
        //String statement = "select _col_1,_col_2,_col_3 FROM some_table WHerE _col_2 = 1 AND _col_3 = 4 OR _col_4 = 30";
		
		JFlex_Rules_SQL Lex_Analyzer = new JFlex_Rules_SQL( new BufferedReader( new StringReader(sqlStatement) ) ); 
		Cup_Rules_SQL Syntax_Analyzer = new Cup_Rules_SQL(Lex_Analyzer);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("----- Lexical and Syntactical Analysis -----\n");
		//sb.append("Statement: \"" + sqlStatement + "\"\n");
		
		try {
			
			if ( sqlStatement.isEmpty() )
				//return sb.append("No input.\n\nPlease enter a valid SQL statement ಠ_ಠ");
				return sb.append("No input.\n\nPlease enter a valid SQL statement.");
			
			
			// This cleans the list of syntax errors (it might have errors from the previous run).			
			Syntax_Analyzer.clean_lists();
			
			// Run Syntax Analyzer
			Syntax_Analyzer.parse();
			
			// Debug Mode
			//Syntax_Analyzer.debug_stack();
			//Syntax_Analyzer.debug_parse();
			
			//sb.append("\n-------------- Finished Analysis -----------------------");
			
			if( Syntax_Analyzer.errors > 0 ){
				sb.append("\nnumber of errors found: " + Syntax_Analyzer.errors );
				
				// Hits this when Panic Mode happens
				if(Syntax_Analyzer.the_error_message != null) {
					sb.append(Syntax_Analyzer.the_error_message);
					if (Syntax_Analyzer.TableSE.isEmpty() == false)
						sb.append("\n"+Syntax_Analyzer.TableSE.getFirst().getDescription());
				}
				// Hits this when regular error happens
				else 
					if (Syntax_Analyzer.TableSE.isEmpty() == false)
						sb.append("\n"+Syntax_Analyzer.TableSE.getFirst().getDescription());
				
			}
			else {
				sb.append("\n ----> Everything is Ok ✓✓✓  \n" );
				
				this.createSuccessfullStatementFile(sqlStatement);
				
				if (Syntax_Analyzer.selects_read > 0)
				{
					sb.append("\n\t- Valid SELECTS found: " + Syntax_Analyzer.selects_read );
				}
				
				if (Syntax_Analyzer.updates_read > 0)
				{
					sb.append("\n\t- Valid UPDATES found: " + Syntax_Analyzer.updates_read );
				}
				
				if (Syntax_Analyzer.deletes_read > 0)
				{
					sb.append("\n\t- Valid DELETES found: " + Syntax_Analyzer.deletes_read );
				}

				if (Syntax_Analyzer.inserts_read > 0)
				{
					sb.append("\n\t- Valid INSERTS found: " + Syntax_Analyzer.inserts_read );
				}

				if (Syntax_Analyzer.merge_read > 0)
				{
					sb.append("\n\t- Valid MERGE found: " + Syntax_Analyzer.merge_read );
				}
				
				if (Syntax_Analyzer.creates_read > 0)
				{
					sb.append("\n\t- Valid CREATE found: " + Syntax_Analyzer.creates_read );
				}
				
				if (Syntax_Analyzer.with_read > 0)
				{
					sb.append("\n\t- Valid WITH found: " + Syntax_Analyzer.with_read );
				}
				
				if (Syntax_Analyzer.alter_read > 0)
				{
					sb.append("\n\t- Valid ALTER found: " + Syntax_Analyzer.alter_read );
				}
				
				if (Syntax_Analyzer.drop_read > 0)
				{
					sb.append("\n\t- Valid DROP found: " + Syntax_Analyzer.drop_read );
				}
				
				sb.append("\n\t- Total: " + (Syntax_Analyzer.selects_read+Syntax_Analyzer.updates_read+Syntax_Analyzer.deletes_read+Syntax_Analyzer.inserts_read+Syntax_Analyzer.merge_read+Syntax_Analyzer.creates_read+Syntax_Analyzer.with_read+Syntax_Analyzer.alter_read+Syntax_Analyzer.drop_read) );
			}
			
			sb.append("\n\n-------------- Findings Analysis --------------");
			sb.append("\n" + Syntax_Analyzer.Tables.size()+ " Tables found (to be validated):\n" + Syntax_Analyzer.Tables);
			sb.append("\n" + Syntax_Analyzer.Columns.size()+ " Columns found (to be validated):\n" + Syntax_Analyzer.Columns);
			
			sb.append("\n\n-------------- SQL Statement Copy --------------\n");
			sb.append(sqlStatement);
			/*
			for (int i = 0; i < Lex_Analyzer.StmtCopy.size(); i++) {
				sb.append(Lex_Analyzer.StmtCopy.get(i));
			}
			*/
			this.ps = Lex_Analyzer.PrettyfiedStatement;
			/*
			for (int i = 0; i < ps.size(); i++) {
				sb.append("\nLexeme: " + ps.get(i).getLexeme() + " - Category: " + Categories.categoryNames[ps.get(i).getCategory()] );
			}
			*/
			
			
			
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
	
	private void createSuccessfullStatementFile(String sb) {
		try {
			logFile.CreateSuccessfullSQLFile();
			logFile.writeSuccessfullSQLLog(sb.toString());
			logFile.close();
		} catch (Exception e) {
			errorHandler.throwError(e.toString());
		}
	}

}
