package com.kerberus.syntaxValidator;

import java.io.BufferedReader;
import java.io.StringReader;

import com.kerberus.syntaxValidator.rules.comma.*;
import com.kerberus.syntaxValidator.rules.sql.*;
import com.kerberus.syntaxValidator.rules.util.CupUtil;
import com.kerberus.syntaxValidator.rules.util.FlexUtil;
import com.kerberus.syntaxValidator.rules.util.UtilFiles;

public class Main {
	
	public static void main(String[] args) {
		
		UtilFiles utilFiles = new UtilFiles();
		
		String rootPath = utilFiles.getRootpath();
        String subPath = utilFiles.getSubpath();
        String sqlCupFile = "Cup_Rules_SQL";
        String commaCupFile = "Cup_Rules_Commas";
        String sqlFlexFile = "JFlex_Rules_SQL";
        String commaFlexFile = "JFlex_Rules_Commas";
		
        CupUtil cupUtil = new CupUtil();
        cupUtil.generateCupFile(rootPath, subPath + "\\sql\\", sqlCupFile);
        cupUtil.generateCupFile(rootPath, subPath + "\\comma\\", commaCupFile);
        
        FlexUtil flexUtil = new FlexUtil();
        flexUtil.generateFlexFile(rootPath, subPath + "\\sql\\", sqlFlexFile);
        flexUtil.generateFlexFile(rootPath, subPath + "\\comma\\", commaFlexFile);

        // ----------- SQL ----------------------------------------------------------------------- 
                
        String statement = "SElect column1,column2,colum3,colum4,colum5,colum6,columN, FROM products WHERE some = 1";
        
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
