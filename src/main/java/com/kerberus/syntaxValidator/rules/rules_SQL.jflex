/* JFlex example: partial Java language lexer specification */

package com.kerberus.syntaxValidator.rules;


import java_cup.runtime.*; 		// Required to send lexemas to Cup
import java.util.LinkedList; 	// Required for LinkedList

/**
 * This class is a simple example lexer.
 */

%%
// ------> Directives (flags)
%public
%class SQL_AL
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

WhiteSpace      = [ \t\r\n\f]
letter          = [A-Za-z]
digit           = [0-9]
alphanumeric    = {letter}|{digit}
underscore   	= [_]
identifier      = {letter}|{underscore}({alphanumeric}|{underscore})*
integer         = {digit}+
real            = {integer}+\.{integer}+
char            = '.' /*Not sure about this*/
//comment         = {leftbrace}{comment_body}{rightbrace}
whitespace      = {WhiteSpace}

%%

/* Reserved words --> Oracle (PLSQL) */
<YYINITIAL> "select" 		{ System.out.println("Recognized: " + yytext()); return Symbol(sym.SELECT); }
<YYINITIAL> "update" 		{ System.out.println("Recognized: " + yytext()); return Symbol(sym.UPDATE); }
<YYINITIAL> "delete" 		{ System.out.println("Recognized: " + yytext()); return Symbol(sym.SELECT); }
<YYINITIAL> "from" 			{ System.out.println("Recognized: " + yytext()); return Symbol(sym.SELECT); }
<YYINITIAL> "where"			{ System.out.println("Recognized: " + yytext()); return Symbol(sym.SELECT); }


{identifier}    { System.out.println("Recognized: " + yytext()); return Symbol(sym.IDENT); }
{integer}       { System.out.println("Recognized: " + yytext()); return Symbol(sym.INT); }
{real}          { System.out.println("Recognized: " + yytext()); return Symbol(sym.REAL); }
{whitespace}    { /* Ignore whitespace. */ }


// Lexical errors - This is like the default option in a SWITCH clause.
.               { System.out.println("\n### Lexical error (Illegal element) ### - '" + yytext() + "' line: " + yyline + ", column: " + yychar + "\n"); 
				  TError errors_found = new TError(yytext(),yyline,yycolumn,"Lexical Error","This symbol does not exist in this language");
				  TableLE.add(errors_found);
				}

