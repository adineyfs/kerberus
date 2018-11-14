package com.kerberus.model.syntaxValidator.rules.util;

import java.nio.file.Paths;

public class UtilFiles {
	
	private String rootPath = Paths.get("").toAbsolutePath(). toString();
	private String subPath = "\\src\\main\\java\\com\\kerberus\\model\\syntaxValidator\\rules\\";
	private String cupRulesSQLFile = "Cup_Rules_SQL";
	private String cupRulesSQLServerFile = "Cup_Rules_SQL_Server"; // Second
	private String cupRulesCommaFile = "Cup_Rules_Commas";
	
	public String getRootpath() {
		return rootPath;
	}
	public String getSubpath() {
		return subPath;
	}
	public String getCuprulessqlfile() {
		return cupRulesSQLFile;
	}
	// Second
	public String getCuprulessqlserverfile() {
		return cupRulesSQLServerFile;
	}
	public String getCuprulescommafile() {
		return cupRulesCommaFile;
	}
}
