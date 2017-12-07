package com.kerberus.syntaxValidator;

import java.io.File;
import java.nio.file.Paths;

public class Generator {

	public static void main(String[] args) {
		String rootPath = Paths.get("").toAbsolutePath(). toString();
        String subPath = "/src/main/java/com/kerberus/syntaxValidator/rules/";

        //String file = rootPath + subPath + "rules_SQL.jflex";
        String file = rootPath + subPath + "commas.jflex";

        File sourceCode = new File(file);

        jflex.Main.generate(sourceCode);

	}

}
