/* JFlex example: partial Java language lexer specification */

package com.kerberus.syntaxValidator.rules.comma;


import java_cup.runtime.*; 		// Required to send lexemas to Cup
import java.util.LinkedList; 	// Required for LinkedList
import com.kerberus.syntaxValidator.rules.util.*;
import com.kerberus.syntaxValidator.rules.comma.sym;

/**
 * This class is a simple example lexer.
 */

%%
// ------> Directives (flags)
%public
%class JFlex_Rules_Commas
//%cupsym sym		// Symbols is an object that will be sent to Cup (I need to create this class)
%cup 		   		// Enables cup
%unicode
%char 				// Counting amount of character read (starts at zero)
%line
%column
%full  				// use an 8 bit input character set (character codes 0-255)
%ignorecase			// not case sensitive

// -------- states declarations | what's this?


%{
	// Initialize any necessary variables here
	
	// A table I will create to store Lexical Errors found | import library for LinkedList
	public static LinkedList<TError> TableLE = new LinkedList<TError>();
%}

/*-*
 * PATTERN DEFINITIONS:
 */

WhiteSpace      = [" "|\t|\r|\n|\f]
word          = [A-Za-z]+
whitespace      = {WhiteSpace}

%%

{word}    { return new Symbol( sym.WORD, yyline+1, yycolumn+1, yytext() ); }
","			{ return new Symbol( sym.COMMA, yyline+1, yycolumn+1, yytext() ); }

{whitespace}    { /* Ignore whitespace. */ }


// Lexical errors - This is like the default option in a SWITCH clause.
.               { System.out.println("\n### Lexical error (Illegal element) ### - '" + yytext() + "' line: " + yyline + ", column: " + yychar + "\n"); 
				  TError errors_found = new TError(yytext(),yyline,yycolumn,"Lexical Error","This symbol does not exist in this language");
				  TableLE.add(errors_found);
				}