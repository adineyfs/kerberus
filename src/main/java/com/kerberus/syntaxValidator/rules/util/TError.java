package com.kerberus.syntaxValidator.rules.util;

public class TError {
	private String lexeme,type,description;
	private int row,column;

	public TError( String le, int li, int col, String ty, String desc){
		lexeme = le;
		type = ty;
		description = desc;
		row = li;
		column = col;
	}
	
	public String getLexeme() {
		return lexeme;
	}
	
	public int getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}
	
	public String getType() {
		return type;
	}
	
	public String getDescription() {
		return description;
	}
	
}
