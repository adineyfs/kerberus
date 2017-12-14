package com.kerberus.syntaxValidator;

import java.io.BufferedReader;
import java.io.StringReader;

//import com.kerberus.syntaxValidator.rules.comma.*;
import com.kerberus.syntaxValidator.rules.sql.*;
import com.kerberus.syntaxValidator.rules.util.CupUtil;
import com.kerberus.syntaxValidator.rules.util.FlexUtil;
import com.kerberus.syntaxValidator.rules.util.UtilFiles;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * 
		 */
		
		UtilFiles utilFiles = new UtilFiles();
		
		String rootPath = utilFiles.getRootpath();
        String subPath = utilFiles.getSubpath();
        String sqlCupFile = "Cup_Rules_SQL";
        String commaCupFile = "Cup_Rules_Commas";
        String sqlFlexFile = "JFlex_Rules_SQL";
        String commaFlexFile = "JFlex_Rules_Commas";
		
        /*
        CupUtil cupUtil = new CupUtil();
        cupUtil.generateCupFile(rootPath, subPath + "\\sql\\", sqlCupFile);
        cupUtil.generateCupFile(rootPath, subPath + "\\comma\\", commaCupFile);
        
        FlexUtil flexUtil = new FlexUtil();
        flexUtil.generateFlexFile(rootPath, subPath + "\\sql\\", sqlFlexFile);
        flexUtil.generateFlexFile(rootPath, subPath + "\\comma\\", commaFlexFile);
        */
        
        FlexUtil flexUtil = new FlexUtil();
        flexUtil.generateFlexFile(rootPath, subPath + "\\sql\\", sqlFlexFile);
        
        CupUtil cupUtil = new CupUtil();
        cupUtil.generateCupFile(rootPath, subPath + "\\sql\\", sqlCupFile);

        // ----------- SQL ----------------------------------------------------------------------- 
                
        String statement = "select _col_1,_col_2,_col_3 FROM some_table WHerE _col_2 = 1 AND _"
        		+ "col_3 = 4 OR _col_4 = 30";
        //String statement = "select _ord1,one_two_three,_a_b_c,___4,colum5,colum6,colum FROM product WHERE hola = 1 ;";
        //String statement = "select column1,column2,colum3,colum4,colum5,colum6,colum, FROM product WHERE hola = 1 AND hola = 2";
        //String statement = "select column1,column2,colum3,colum4,colum5,colum6,colum ? FROM product WHERE hola = 1 AND hola = 2";
        
		JFlex_Rules_SQL Lex_Analyzer = new JFlex_Rules_SQL( new BufferedReader( new StringReader(statement) ) ); 
		Cup_Rules_SQL Syntax_Analyzer = new Cup_Rules_SQL(Lex_Analyzer);
		
		System.out.println("\n\n\n\n----- Lexical and Syntactical Analysis ------\n");
		System.out.println("Statement: \"" + statement + "\"\n");
		
		try {
			
			// Run Syntax Analyzer
			Syntax_Analyzer.parse();
			
			// Debug Mode
			//Syntax_Analyzer.debug_stack();
			//Syntax_Analyzer.debug_parse();
			
			System.out.println("\n-------------- Finished Analysis -----------------------");
			System.out.println("number of errors found: " + Syntax_Analyzer.TableSE.size() );
			System.out.println("----------------------------------------------------------\n");
			
			if( !Syntax_Analyzer.TableSE.isEmpty() ){
				int co,ro;
				String le,err;
				
				co = Syntax_Analyzer.TableSE.getFirst().getColumn();
				ro = Syntax_Analyzer.TableSE.getFirst().getRow();
				le = Syntax_Analyzer.TableSE.getFirst().getLexeme();
				le = Syntax_Analyzer.TableSE.getFirst().getLexeme();
				err = Syntax_Analyzer.TableSE.getFirst().getDescription();
				
				System.out.println(statement);
				
				for (int i = 0; i < co; i++) {
					
					System.out.print(" ");
					if( i == (co-1) )
						System.out.println("^ " + err );
				}
				
			}
			
			System.out.println(Syntax_Analyzer.Columns + " " + Syntax_Analyzer.Columns.size());
			
			
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
