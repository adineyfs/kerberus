package com.kerberus.syntaxValidator;

import java.io.File;
import java.nio.file.Paths;

public class Generator_JFlex {

	public static void main(String[] args) {
		String rootPath = Paths.get("").toAbsolutePath(). toString();
        String subPath = "/src/main/java/com/kerberus/syntaxValidator/rules/sql/";

        //String file = rootPath + subPath + "JFlex_Rules_Commas.jflex";
        String file = rootPath + subPath + "JFlex_Rules_SQL.jflex";

        File sourceCode = new File(file);

        jflex.Main.generate(sourceCode);

	}

}
