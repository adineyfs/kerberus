package com.kerberus.syntaxValidator;

import java.nio.file.Paths;

public class Generator_Cup {
	
	public void generate_Cup_file(String[] options) {
		try{
        	java_cup.Main.main(options);
        } catch (Exception e){
            System.out.print(e);
        }
	}
	public static void main(String[] args) {

		String rootPath = Paths.get("").toAbsolutePath(). toString();
	    String subPath = "\\src\\main\\java\\com\\kerberus\\syntaxValidator\\rules\\sql\\";
	    String the_file = "Cup_Rules_SQL";
		
	    Generator_Cup generator_Cup = new Generator_Cup();
		String options[] = new String[5];		
	    
	    options[0] = "-destdir";
	    options[1] = rootPath + subPath;        
	    options[2] = "-parser";        
	    options[3] = the_file;
	    options[4] = rootPath + subPath + the_file + ".cup";
	    generator_Cup.generate_Cup_file(options);
	
	}

}
