/* JFlex example: partial Java language lexer specification */

package com.kerberus.model.syntaxValidator.rules.sql;


import java_cup.runtime.*; 		// Required to send lexemas to Cup
import java.util.LinkedList; 	// Required for LinkedList
import com.kerberus.model.syntaxValidator.rules.util.*;
import com.kerberus.model.syntaxValidator.rules.sql.sym;

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
//%unicode
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
	public LinkedList<TError> TableLE = new LinkedList<TError>();
	public LinkedList<String> StmtCopy = new LinkedList<String>(); // DELETE THIS, will be replaced by PrettyfiedStatement
	
	public LinkedList<PrettyStatement> PrettyfiedStatement = new LinkedList<PrettyStatement>();
		
	// Will need to create a structure to save the lexeme and its corresponding category code.
	public void prettyfier (String lexeme, int category) {
		
		PrettyStatement ps = new PrettyStatement(lexeme,category);
		PrettyfiedStatement.add(ps);
	}
%}

/*-*
 * PATTERN DEFINITIONS:
 */

WhiteSpace      = [ |\t|\r|\n|\f|\r\n]  // [\r\n] --> End of line
letter 			= [A-Za-z]
digit			= [0-9]
alphanumeric	= {letter}|{digit}
under			= [_] 		// Underscore character
// begins with letter or a underscore, followed by characters,numbers or underscore, finishing with letter or a _.
identifier      = ((  {under}({alphanumeric}|{under})+  ) | (  {letter}({alphanumeric}|{under})*  )) 
integer			= {digit}+
real			= {digit}\.{digit}
literalString	= '(\\.|[^\\'])+'
whitespace      = {WhiteSpace} 

%%

<YYINITIAL> {
/*reserved words*/
	"select" 		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.SELECT, yyline+1, yycolumn+1, yytext()); }
	"update" 		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.UPDATE, yyline+1, yycolumn+1, yytext()); }
	"set" 			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.SET, yyline+1, yycolumn+1, yytext()); }
	"delete" 		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.DELETE, yyline+1, yycolumn+1, yytext()); }
	"from" 			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.FROM, yyline+1, yycolumn+1, yytext()); }
	"where"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.WHERE, yyline+1, yycolumn+1, yytext()); }
	/* Logical conectors */
	"and"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym._AND, yyline+1, yycolumn+1, yytext()); }
	"or"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym._OR, yyline+1, yycolumn+1, yytext()); }
/* Negation */
	//"not"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), ); return new Symbol(sym._NOT, yyline+1, yycolumn+1, yytext()); }
	
	"*"				{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._STAR, yyline+1, yycolumn+1, yytext()); }
	","				{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._COMMA, yyline+1, yycolumn+1, yytext()); }

/* Logical Operators */
	"="				{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._EQU, yyline+1, yycolumn+1, yytext()); }
	">"				{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._GT, yyline+1, yycolumn+1, yytext()); }
	"<"				{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._LT, yyline+1, yycolumn+1, yytext()); }
	"<="			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._LET, yyline+1, yycolumn+1, yytext()); }
	">="			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._GET, yyline+1, yycolumn+1, yytext()); }
	"<>"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._DIFF, yyline+1, yycolumn+1, yytext()); }


/* Statement closure */
	";"				{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._SEMCOL2, yyline+1, yycolumn+1, yytext()); }


// Terminal tokens (LOWERCASE)
	{identifier}    { System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.IDENTIFIER); return new Symbol(sym.IDENTIFIER, yyline+1, yycolumn+1, yytext()); }
	{integer}       { System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NUMBER); return new Symbol(sym.INTEGER, yyline+1, yycolumn+1, yytext()); }
	{real}          { System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NUMBER); return new Symbol(sym.REAL, yyline+1, yycolumn+1, yytext()); }
	{literalString} { System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.LITERAL_STRING); return new Symbol(sym.LITERAL_STRING, yyline+1, yycolumn+1, yytext()); }

// Save spaces to copy SQL statement
	{whitespace}    { System.out.println("Recognized space: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); }
}


// Lexical errors - This is like the default option in a SWITCH clause.
[^]               	{ System.out.println("\n### Lexical error (Illegal element) ### - '" + yytext() + "' line: " + yyline + ", column: " + yychar + "\n"); 
				  	  TError errors_found = new TError(yytext(),yyline,yycolumn,"Lexical Error","This symbol does not exist in this language");
				  	  TableLE.add(errors_found); 
				  	  prettyfier(yytext(), Categories.ERROR);
					  return new Symbol(sym.ILLEGAL_CHAR, yyline, yycolumn, yytext());
				  	}