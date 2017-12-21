package com.kerberus.model.syntaxValidator.rules.util;

public class Categories {
	
	// Background of text field is black
	
	public static final int NOTHING        = 0;			// white - grey
	public static final int ERROR          = 1;			// Red underlined 
	public static final int RESERVED       = 2;			// Blue 
	public static final int IDENTIFIER     = 3;			// ?
	public static final int COMMENT		   = 4;			// Dark grey
	public static final int LITERAL_STRING = 5;			// Yellow (like mustard)
	public static final int NUMBER = 6;					// ?
	
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
