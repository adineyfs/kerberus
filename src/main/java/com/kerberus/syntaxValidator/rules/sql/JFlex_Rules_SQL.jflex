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
letter          = [A-Za-z]
digit           = [0-9]
alphanumeric    = {letter}|{digit}
underscore   	= [\_]
identifier      = {letter}|{underscore}({alphanumeric}|{underscore})*
integer         = {digit}+
real            = {integer}+\.{integer}+
char            = '.' /*Not sure about this*/
//comment         = {leftbrace}{comment_body}{rightbrace}
whitespace      = {WhiteSpace}

%%

/* Reserved words --> Oracle (PLSQL) */
<YYINITIAL> "select" 	{ System.out.println("Recognized: " + yytext()); return new Symbol(sym.SELECT); }
<YYINITIAL> "update" 	{ System.out.println("Recognized: " + yytext()); return new Symbol(sym.UPDATE); }
<YYINITIAL> "delete" 	{ System.out.println("Recognized: " + yytext()); return new Symbol(sym.DELETE); }
<YYINITIAL> "from" 		{ System.out.println("Recognized: " + yytext()); return new Symbol(sym.FROM); }
<YYINITIAL> "where"		{ System.out.println("Recognized: " + yytext()); return new Symbol(sym.WHERE); }

<YYINITIAL> "*"			{ System.out.println("Recognized: " + yytext()); return new Symbol(sym._STAR); }
<YYINITIAL> ","			{ System.out.println("Recognized: " + yytext()); return new Symbol(sym._COMMA); }

// Terminal tokens (LOWERCASE)
{identifier}    { System.out.println("Recognized: " + yytext()); return new Symbol(sym.identifier); }
{integer}       { System.out.println("Recognized: " + yytext()); return new Symbol(sym.integer); }
{real}          { System.out.println("Recognized: " + yytext()); return new Symbol(sym.real); }
{whitespace}    { /* Ignore whitespace. */ }


// Lexical errors - This is like the default option in a SWITCH clause.
.               { System.out.println("\n### Lexical error (Illegal element) ### - '" + yytext() + "' line: " + yyline + ", column: " + yychar + "\n"); 
				  TError errors_found = new TError(yytext(),yyline,yycolumn,"Lexical Error","This symbol does not exist in this language");
				  TableLE.add(errors_found);
				}

