package com.kerberus.model.syntaxValidator;

import com.kerberus.model.syntaxValidator.rules.util.CupUtil;
import com.kerberus.model.syntaxValidator.rules.util.FlexUtil;
import com.kerberus.model.syntaxValidator.rules.util.UtilFiles;

public class Generator {
	
	public static void main(String[] args) {
		
		UtilFiles utilFiles = new UtilFiles();
		
		String rootPath = utilFiles.getRootpath();
        String subPath = utilFiles.getSubpath();
        String sqlCupFile = "Cup_Rules_SQL";
        String sqlServerCupFile = "Cup_Rules_SQL_Server"; //Second
        //String commaCupFile = "Cup_Rules_Commas";
        String sqlFlexFile = "JFlex_Rules_SQL";
        String sqlServerFlexFile = "JFlex_Rules_SQL_Server"; //Second
        //String commaFlexFile = "JFlex_Rules_Commas";
			
        
        FlexUtil flexUtil = new FlexUtil();
        flexUtil.generateFlexFile(rootPath, subPath + "sql\\", sqlFlexFile);
        
        CupUtil cupUtil = new CupUtil();
        cupUtil.generateCupFile(rootPath, subPath + "sql\\", sqlCupFile);
        
        FlexUtil flexUtil2 = new FlexUtil();
        flexUtil2.generateFlexFile(rootPath, subPath + "sqlServer\\", sqlServerFlexFile);
        
        CupUtil cupUtil2 = new CupUtil();
        cupUtil2.generateCupFile(rootPath, subPath + "sqlServer\\", sqlServerCupFile);

	}
}
