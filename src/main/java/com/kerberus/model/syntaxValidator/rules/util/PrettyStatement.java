package com.kerberus.model.syntaxValidator.rules.util;

public class PrettyStatement {
	
	private String lexeme;
	private int category;
	
	public PrettyStatement(String lex, int cat) {
		lexeme = lex;
		category = cat;
	}
	
	public String getLexeme(){
		return this.lexeme;
	}
	
	public int getCategory(){
		return this.category;
	}

}
