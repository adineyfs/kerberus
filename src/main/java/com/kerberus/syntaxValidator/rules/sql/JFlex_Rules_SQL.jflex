/* JFlex example: partial Java language lexer specification */

package com.kerberus.syntaxValidator.rules.sql;


import java_cup.runtime.*; 		// Required to send lexemas to Cup
import java.util.LinkedList; 	// Required for LinkedList
import com.kerberus.syntaxValidator.rules.util.*;
import com.kerberus.syntaxValidator.rules.sql.sym;

/**
 * This class is a simple example lexer.
 */

%%
// ------> Directives (flags)
%public
%class JFlex_Rules_SQL
//%cupsym symbol		// Symbols is an object that will be sent to Cup (I need to create this class)
%cup 		   			// Enables cup
//%cupdebug				// Activates Cup debug mode
%unicode
%char 					// Counting amount of character read (starts at zero)
%line
%column
%full  					// use an 8 bit input character set (character codes 0-255)
%ignorecase				// not case sensitive

/*
%eofval{
	// return new Symbol(sym.EOF, yyline, yycolumn, yytext());  // Error: duplicated EOF
	//return new java_cup.runtime.Symbol(<CUPSYM>.EOF);			// same error
%eofval}
*/
%{
	// Initialize any necessary variables here
	
	// A table I will create to store Lexical Errors found | import library for LinkedList
	public static LinkedList<TError> TableLE = new LinkedList<TError>();
%}

/*-*
 * PATTERN DEFINITIONS:
 */

WhiteSpace      = [ |\t|\r|\n|\f|\r\n]  // [\r\n] --> End of line
letter 			= [A-Za-z]
digit			= [0-9]
under			= [\_] 		// Underscore character
identifier      = ({under}|{letter})({digit}|{letter}|{under})*({digit}|{letter}) // begins with letter or a _, followed by characters,numbers or underscore, finishing with letter or a _.
integer			= {digit}+
real			= {digit}\.{digit}
whitespace      = {WhiteSpace}
semicolon		= [;]		// Always define these character this way 

%%

/* Reserved words --> Oracle (PLSQL) */
<YYINITIAL> "select" 	{ System.out.println("Recognized: " + yytext()); return new Symbol(sym.SELECT, yyline, yycolumn, yytext()); }
<YYINITIAL> "update" 	{ System.out.println("Recognized: " + yytext()); return new Symbol(sym.UPDATE, yyline, yycolumn, yytext()); }
<YYINITIAL> "delete" 	{ System.out.println("Recognized: " + yytext()); return new Symbol(sym.DELETE, yyline, yycolumn, yytext()); }
<YYINITIAL> "from" 		{ System.out.println("Recognized: " + yytext()); return new Symbol(sym.FROM, yyline, yycolumn, yytext()); }
<YYINITIAL> "where"		{ System.out.println("Recognized: " + yytext()); return new Symbol(sym.WHERE, yyline, yycolumn, yytext()); }

<YYINITIAL> "*"			{ System.out.println("Recognized: " + yytext()); return new Symbol(sym._STAR, yyline, yycolumn, yytext()); }
<YYINITIAL> ","			{ System.out.println("Recognized: " + yytext()); return new Symbol(sym._COMMA, yyline, yycolumn, yytext()); }

/* Logical Operators */
<YYINITIAL> "="			{ System.out.println("Recognized: " + yytext()); return new Symbol(sym._EQU, yyline, yycolumn, yytext()); }
<YYINITIAL> ">"			{ System.out.println("Recognized: " + yytext()); return new Symbol(sym._GT, yyline, yycolumn, yytext()); }
<YYINITIAL> "<"			{ System.out.println("Recognized: " + yytext()); return new Symbol(sym._LT, yyline, yycolumn, yytext()); }
<YYINITIAL> "<="		{ System.out.println("Recognized: " + yytext()); return new Symbol(sym._LET, yyline, yycolumn, yytext()); }
<YYINITIAL> ">="		{ System.out.println("Recognized: " + yytext()); return new Symbol(sym._GET, yyline, yycolumn, yytext()); }
<YYINITIAL> "<>"		{ System.out.println("Recognized: " + yytext()); return new Symbol(sym._DIFF, yyline, yycolumn, yytext()); }

/* Logical conectors */

<YYINITIAL> "and"		{ System.out.println("Recognized: " + yytext()); return new Symbol(sym._AND, yyline, yycolumn, yytext()); }
<YYINITIAL> "or"		{ System.out.println("Recognized: " + yytext()); return new Symbol(sym._OR, yyline, yycolumn, yytext()); }

/* Negation */
<YYINITIAL> "not"		{ System.out.println("Recognized: " + yytext()); return new Symbol(sym._NOT, yyline, yycolumn, yytext()); }

/* Statement closure */
<YYINITIAL> "sc"		{ System.out.println("Recognized: " + yytext()); return new Symbol(sym._SEMCOL1, yyline, yycolumn, yytext()); }
<YYINITIAL> {semicolon}	{ System.out.println("Recognized: " + yytext()); return new Symbol(sym._SEMCOL2, yyline, yycolumn, yytext()); }


// Terminal tokens (LOWERCASE)
<YYINITIAL> {identifier}    { System.out.println("Recognized: " + yytext()); return new Symbol(sym.identifier, yyline, yycolumn, yytext()); }
<YYINITIAL> {integer}       { System.out.println("Recognized: " + yytext()); return new Symbol(sym.integer, yyline, yycolumn, yytext()); }
<YYINITIAL> {real}          { System.out.println("Recognized: " + yytext()); return new Symbol(sym.real, yyline, yycolumn, yytext()); }

<YYINITIAL> {whitespace}    { /* Ignore whitespace */ }


// Lexical errors - This is like the default option in a SWITCH clause.
.               { System.out.println("\n### Lexical error (Illegal element) ### - '" + yytext() + "' line: " + yyline + ", column: " + yychar + "\n"); 
				  TError errors_found = new TError(yytext(),yyline,yycolumn,"Lexical Error","This symbol does not exist in this language");
				  TableLE.add(errors_found);
				}

