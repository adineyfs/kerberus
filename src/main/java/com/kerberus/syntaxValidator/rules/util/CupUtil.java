package com.kerberus.syntaxValidator.rules.util;

public class CupUtil {
	
	public void generateCupFile(String rootPath, String subPath, String fileName){
		String[] cupOptions = new String[5]; 
		cupOptions[0] = "-destdir";
		cupOptions[1] = rootPath + subPath;        
		cupOptions[2] = "-parser";        
		cupOptions[3] = fileName;
		cupOptions[4] = rootPath + subPath + fileName + ".cup";
		try{
        	java_cup.Main.main(cupOptions);
        } catch (Exception e){
            System.out.print(e);
        }
	}
}
