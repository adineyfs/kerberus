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
identifier      = [A-Za-z]([0-9]|[A-Za-z])* // {letter}({digit}|{letter})*
whitespace      = {WhiteSpace}

%%

/* Reserved words --> Oracle (PLSQL) */
<YYINITIAL> "select" 	{ System.out.println("Recognized: " + yytext()); return new Symbol(sym.SELECT, yyline+1, yycolumn+1, yytext()); }
<YYINITIAL> "update" 	{ System.out.println("Recognized: " + yytext()); return new Symbol(sym.UPDATE, yyline+1, yycolumn+1, yytext()); }
<YYINITIAL> "delete" 	{ System.out.println("Recognized: " + yytext()); return new Symbol(sym.DELETE, yyline+1, yycolumn+1, yytext()); }
<YYINITIAL> "from" 		{ System.out.println("Recognized: " + yytext()); return new Symbol(sym.FROM, yyline+1, yycolumn+1, yytext()); }
<YYINITIAL> "where"		{ System.out.println("Recognized: " + yytext()); return new Symbol(sym.WHERE, yyline+1, yycolumn+1, yytext()); }

<YYINITIAL> "*"			{ System.out.println("Recognized: " + yytext()); return new Symbol(sym._STAR, yyline+1, yycolumn+1, yytext()); }
<YYINITIAL> ","			{ System.out.println("Recognized: " + yytext()); return new Symbol(sym._COMMA, yyline+1, yycolumn+1, yytext()); }

// Terminal tokens (LOWERCASE)
{identifier}    { System.out.println("Recognized: " + yytext()); return new Symbol(sym.identifier, yyline+1, yycolumn+1, yytext()); }
/*
{integer}       { System.out.println("Recognized: " + yytext()); return new Symbol(sym.integer, yyline+1, yycolumn+1, yytext()); }
{real}          { System.out.println("Recognized: " + yytext()); return new Symbol(sym.real, yyline+1, yycolumn+1, yytext()); }
*/
{whitespace}    { /* Ignore whitespace. */ }


// Lexical errors - This is like the default option in a SWITCH clause.
.               { System.out.println("\n### Lexical error (Illegal element) ### - '" + yytext() + "' line: " + yyline + ", column: " + yychar + "\n"); 
				  TError errors_found = new TError(yytext(),yyline,yycolumn,"Lexical Error","This symbol does not exist in this language");
				  TableLE.add(errors_found);
				}

