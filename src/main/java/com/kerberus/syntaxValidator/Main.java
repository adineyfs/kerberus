package com.kerberus.syntaxValidator;

import java.nio.file.Paths;

public class Main {
	
	public static void main(String[] args) {
		
		String rootPath = Paths.get("").toAbsolutePath(). toString();
        String subPath = "\\src\\main\\java\\com\\kerberus\\syntaxValidator\\rules\\sql\\"; 
		
        Generator_Cup generator_Cup = new Generator_Cup();
		String options[] = new String[5];		
        
        options[0] = "-destdir";
        options[1] = rootPath + subPath;        
        options[2] = "-parser";        
        options[3] = "Cup_Rules_SQL";
        options[4] = rootPath + subPath + "Cup_Rules_SQL.cup";
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
