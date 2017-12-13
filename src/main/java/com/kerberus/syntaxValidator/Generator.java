package com.kerberus.syntaxValidator;

import java.io.BufferedReader;
import java.io.StringReader;


//import com.kerberus.syntaxValidator.rules.sql.*;
import com.kerberus.syntaxValidator.rules.util.CupUtil;
import com.kerberus.syntaxValidator.rules.util.FlexUtil;
import com.kerberus.syntaxValidator.rules.util.UtilFiles;

public class Generator {
	
	public static void main(String[] args) {
		
		UtilFiles utilFiles = new UtilFiles();
		
		String rootPath = utilFiles.getRootpath();
        String subPath = utilFiles.getSubpath();
        
        String sqlFlexFile = "JFlex_Rules_SQL";
        String sqlCupFile = "Cup_Rules_SQL";		
        
        FlexUtil flexUtil = new FlexUtil();
        flexUtil.generateFlexFile(rootPath, subPath + "\\sql\\", sqlFlexFile);
        
        CupUtil cupUtil = new CupUtil();
        cupUtil.generateCupFile(rootPath, subPath + "\\sql\\", sqlCupFile);

	}
}
