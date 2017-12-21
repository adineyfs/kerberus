package com.kerberus.model.syntaxValidator.rules.util;

public class Categories {
	
	public static final int NOTHING        = 0;
	public static final int ERROR          = 1;
	public static final int RESERVED       = 2;
	public static final int IDENTIFIER     = 3;
	public static final int COMMENT		   = 4;
	public static final int LITERAL_STRING = 5;
	public static final int NUMBER = 6;
	
	public static final String[] categoryNames = new String[] {
		"NOTHING",	
		"ERROR",
		"RESERVED",
		"IDENTIFIER",
		"COMMENT",
		"LITERAL_STRING",
		"NUMBER"
	};
}
