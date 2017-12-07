package com.kerberus.syntaxValidator.rules.util;

public class TError {
	String lexeme,type,description;
	int line,column;

	public TError( String le, int li, int col, String ty, String desc){
		lexeme = le;
		type = ty;
		description = desc;
		line = li;
		column = col;
	}
}
