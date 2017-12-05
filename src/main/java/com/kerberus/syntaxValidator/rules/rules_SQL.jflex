/* JFlex example: partial Java language lexer specification */
//import java_cup.runtime.*; //Required to send lexemas to Cup


/**
 * This class is a simple example lexer.
 */

%%

%class SQL_AL
%standalone    // Just for testing through command line
%unicode
//%cup 		   // Enables cup
%line
%column

%{
   /*
	* Initialize any necessary variables here
	* Overwrite JFlex{s methods}
	*/
%}

/*-*
 * PATTERN DEFINITIONS:
 */

LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\f]

letter          = [A-Za-z]
digit           = [0-9]
alphanumeric    = {letter}|{digit}
identifier      = ({letter}|\_)({alphanumeric}|\_)*
integer         = {digit}+
real            = {integer}+\.{integer}+
star			= \*
table			= {identifier}| {identifier}\.{identifier}
whitespace      = {WhiteSpace}

%%

/* Reserved words --> Oracle (PLSQL) */
"select" 		{ System.out.println("Recognized: " + yytext());}
"update" 		{ System.out.println("Recognized: " + yytext());}
"delete" 		{ System.out.println("Recognized: " + yytext());}
"from" 			{ System.out.println("Recognized: " + yytext());}
"where"			{ System.out.println("Recognized: " + yytext());}
"distinct"		{ System.out.println("Recognized: " + yytext());}
"on"			{ System.out.println("Recognized: " + yytext());}
"where"			{ System.out.println("Recognized: " + yytext());}
"by"			{ System.out.println("Recognized: " + yytext());}
"and"			{ System.out.println("Recognized: " + yytext());}
"order"			{ System.out.println("Recognized: " + yytext());}
"group"			{ System.out.println("Recognized: " + yytext());}
"having"		{ System.out.println("Recognized: " + yytext());}
"desc"			{ System.out.println("Recognized: " + yytext());}
"asc"			{ System.out.println("Recognized: " + yytext());}



{identifier}    { System.out.println("Recognized: " + yytext()); }
{integer}       { System.out.println("Recognized: " + yytext()); }
{real}          { System.out.println("Recognized: " + yytext()); }
{whitespace}    { /* Ignore whitespace. */ }

.               { System.out.println("Illegal char, '" + yytext() + "' line: " + yyline + ", column: " + yychar); }


