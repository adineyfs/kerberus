package com.kerberus.syntaxValidator;

import java.io.BufferedReader;
import java.io.File;
import java.io.StringReader;
import java.nio.file.Paths;

import com.kerberus.syntaxValidator.rules.LexAnalyzer_commas;
import com.kerberus.syntaxValidator.rules.SyntaxAnalyzer_commas;
import com.kerberus.syntaxValidator.rules.rules_SQL;
import com.kerberus.syntaxValidator.rules.rules_SQL_cup;

public class Main {
	
	public static void main(String[] args) {
                
        // ----------- SQL ----------------------------------------------------------------------- 
        
		/*ToDo: rename generated analyzer to: LexicalAnalyzer and SyntacticalAnalyzer*/
        /*
		rules_SQL Lex_Analyzer = new rules_SQL( new BufferedReader( new StringReader("SELECT * FROM tabla;") ) ); 
		rules_SQL_cup Syntax_Analyzer = new rules_SQL_cup(Lex_Analyzer);
		
		try {
			Syntax_Analyzer.parse();
			System.out.println("Finished process. # of errors" + Syntax_Analyzer.TableSE.size() );
		} catch (Exception e) {
			// printStackTrace method
            // prints line numbers + call stack
            e.printStackTrace();
             
            // Prints what exception has been thrown
            System.out.println(e);
		}
		*/

        
        // ------ A SMALL TEST -----------------------------------------------------------------
        
        LexAnalyzer_commas Lex_Analyzer = new LexAnalyzer_commas( new BufferedReader( new StringReader("hey, hola, SELECT * ; ") ) ); 
        SyntaxAnalyzer_commas Syntax_Analyzer = new SyntaxAnalyzer_commas(Lex_Analyzer);
		
		try {
			Syntax_Analyzer.parse();
			System.out.println("Finished process. # of errors" + Syntax_Analyzer.TableSE.size() );
		} catch (Exception e) {
			// printStackTrace method
            // prints line numbers + call stack
            e.printStackTrace();
             
            // Prints what exception has been thrown
            System.out.println(e);
		}
			}

}
