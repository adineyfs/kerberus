package com.kerberus.syntaxValidator;

import java.io.File;
import java.nio.file.Paths;
import java_cup.*;


public class Generator_Cup {
	
	public static void main(String[] args) {
		String rootPath = Paths.get("").toAbsolutePath(). toString();
        String subPath = "\\src\\main\\java\\com\\kerberus\\syntaxValidator\\rules\\";
        
        
        String options[] = new String[5];
        
        options[0] = "-destdir";
        
        options[1] = rootPath + subPath;
        
        options[2] = "-parser";
        
        // options[3] = "rules_SQL_cup";
        options[3] = "SyntaxAnalyzer_commas";
        
        
        //options[4] = rootPath + subPath + "Syntax_Analyzer.cup";
        options[4] = rootPath + subPath + "commas.cup";
        
        //rootPath + subPath + 
        //System.out.println(rootPath + subPath + "Syntax_Analyzer.cup");
        System.out.println(rootPath + subPath + "commas.cup");

        try{
        	java_cup.Main.main(options);
        } catch (Exception e){
            System.out.print(e);
        }
        	

	}
	
	

}
