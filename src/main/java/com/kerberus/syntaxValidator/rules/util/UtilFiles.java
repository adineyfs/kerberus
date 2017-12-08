package com.kerberus.syntaxValidator.rules.util;

import java.nio.file.Paths;

public class UtilFiles {
	
	private String rootPath = Paths.get("").toAbsolutePath(). toString();
	private String subPath = "\\src\\main\\java\\com\\kerberus\\syntaxValidator\\rules\\";
	private String cupRulesSQLFile = "Cup_Rules_SQL";
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
	public String getCuprulescommafile() {
		return cupRulesCommaFile;
	}
}
