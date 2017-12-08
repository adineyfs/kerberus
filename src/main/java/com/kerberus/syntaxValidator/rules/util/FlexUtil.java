package com.kerberus.syntaxValidator.rules.util;

import java.io.File;

public class FlexUtil {
	
	public void generateFlexFile(String rootPath, String subPath, String fileName){
		String file = rootPath + subPath + fileName + ".jflex";
		File sourceCode = new File(file);
		try{
	        jflex.Main.generate(sourceCode);
        } catch (Exception e){
            System.out.print(e);
        }
	}

}
