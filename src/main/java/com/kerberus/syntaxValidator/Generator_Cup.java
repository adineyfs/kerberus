package com.kerberus.syntaxValidator;

public class Generator_Cup {
	
	public void generate_Cup_file(String[] options) {
		try{
        	java_cup.Main.main(options);
        } catch (Exception e){
            System.out.print(e);
        }
	}
	
	

}
