package com.kerberus.syntaxValidator;

import java.io.BufferedReader;
import java.io.StringReader;
import java.nio.file.Paths;

import com.kerberus.syntaxValidator.rules.sql.Cup_Rules_SQL;
import com.kerberus.syntaxValidator.rules.sql.JFlex_Rules_SQL;

public class Main {
	
	public static void main(String[] args) {
		
		String rootPath = Paths.get("").toAbsolutePath(). toString();
        String subPath = "\\src\\main\\java\\com\\kerberus\\syntaxValidator\\rules\\sql\\";
        String the_file = "Cup_Rules_SQL";
		
        Generator_Cup generator_Cup = new Generator_Cup();
		String options[] = new String[5];		
        
        options[0] = "-destdir";
        options[1] = rootPath + subPath;        
        options[2] = "-parser";        
        options[3] = the_file;
        options[4] = rootPath + subPath + the_file + ".cup";
        generator_Cup.generate_Cup_file(options);
        
        
        subPath = "\\src\\main\\java\\com\\kerberus\\syntaxValidator\\rules\\comma\\";
        options[0] = "-destdir";
        options[1] = rootPath + subPath;        
        options[2] = "-parser";        
        // options[3] = "rules_SQL_cup";
        options[3] = "Cup_Rules_Commas";
        options[4] = rootPath + subPath + "Cup_Rules_Commas.cup";
        generator_Cup.generate_Cup_file(options);
        
		
		
		
        // ----------- SQL ----------------------------------------------------------------------- 
        
		/*ToDo: rename generated analyzer to: LexicalAnalyzer and SyntacticalAnalyzer*/
        
        String statement = "SElect column1,column2,colum3,colum4,colum5,colum6,columN FROm products";
        
		JFlex_Rules_SQL Lex_Analyzer = new JFlex_Rules_SQL( new BufferedReader( new StringReader(statement) ) ); 
		Cup_Rules_SQL Syntax_Analyzer = new Cup_Rules_SQL(Lex_Analyzer);
		
		System.out.println("\n\n\n\n----- Lexical and Syntactical Analysis ------\n");
		System.out.println("Statement: \"" + statement + "\"\n");
		
		try {
			Syntax_Analyzer.parse();
			System.out.println("\n-------------- Finished Analysis -----------------------");
			System.out.println("number of errors found: " + Syntax_Analyzer.TableSE.size() );
			System.out.println("----------------------------------------------------------");
		} catch (Exception e) {
			// printStackTrace method
            // prints line numbers + call stack
            e.printStackTrace();
             
            // Prints what exception has been thrown
            System.out.println(e);
		}
		

        
        // ------ A SMALL TEST -----------------------------------------------------------------
        
        /*LexAnalyzer_commas Lex_Analyzer = new LexAnalyzer_commas( new BufferedReader( new StringReader("hey, hola, SELECT * ; ") ) ); 
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
		}*/
	}

}
