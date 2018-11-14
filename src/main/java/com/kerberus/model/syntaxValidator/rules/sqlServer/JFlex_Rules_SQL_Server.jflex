/* JFlex example: partial Java language lexer specification */

package com.kerberus.model.syntaxValidator.rules.sqlServer;


import java_cup.runtime.*; 		// Required to send lexemas to Cup
import java.util.LinkedList; 	// Required for LinkedList
import com.kerberus.model.syntaxValidator.rules.util.*;
import com.kerberus.model.syntaxValidator.rules.sqlServer.sym;

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

/* comments */
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
//WhiteSpace     = {LineTerminator} | [ \t\f]?
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment 	 = "--" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*          
/* End-comments*/

WhiteSpace      = [ |\t|\r|\n|\f|\r\n]  // [\r\n] --> End of line
letter 			= [A-Za-z]
digit			= [0-9]
alphanumeric	= {letter}|{digit}
under			= [_] 		// Underscore character
// begins with letter or a underscore, followed by characters,numbers or underscore, finishing with letter or a _.
identifier      = ((  {under}({alphanumeric}|{under})+  ) | (  {letter}({alphanumeric}|{under})*  )) 
integer			= {digit}+ //| [-]{digit}+
real			= {digit}+[.]{digit}+
literalString	= '(\\.|[^\\'])*'
QTableName		= \"{identifier}\" 
QColAlias		= \"([^\\\"]|\\.)*\"
TabDotCol	    = {identifier}\.{identifier}
 //0-255
//varcharSize = [^([01]|2[0-4][0-9]|25[0-5])$] //remove the square brackets
/* 0-32767 */
//varchar2_size = [^(([1-9]{1}[0-9]{0,3}|[1-2]{1}[0-9]{1,4}|[3]{1}([0-1]{1}[0-9]{3}|[2]{1}([0-6]{1}[0-9]{2}|[7]{1}([0-5]{1}[0-9]{1}|([6]{1}[0-7]{1}))))))$] //remove the square brackets
//0-4294967295
//nvarchar_size = [^(0|(\+)?[1-9]{1}[0-9]{0,8}|(\+)?[1-3]{1}[0-9]{1,9}|(\+)?[4]{1}([0-1]{1}[0-9]{8}|[2]{1}([0-8]{1}[0-9]{7}|[9]{1}([0-3]{1}[0-9]{6}|[4]{1}([0-8]{1}[0-9]{5}|[9]{1}([0-5]{1}[0-9]{4}|[6]{1}([0-6]{1}[0-9]{3}|[7]{1}([0-1]{1}[0-9]{2}|[2]{1}([0-8]{1}[0-9]{1}|[9]{1}[0-5]{1})))))))))$]
//1-4000
//nchar_size = [^(([1-3]{1}[0-9]{0,3})|[4][0][0][0])$] //remove the square brackets
/*
//SQL Server only
QTabDotCol 		= \"{identifier}\"\.{identifier}
*/
whitespace      = {WhiteSpace}  

%%

<YYINITIAL> {
/* Reserved words */
	"select" 		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.SELECT, yyline+1, yycolumn+1, yytext()); }
	"update" 		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.UPDATE, yyline+1, yycolumn+1, yytext()); }
	"set" 			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.SET, yyline+1, yycolumn+1, yytext()); }
	"delete" 		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.DELETE, yyline+1, yycolumn+1, yytext()); }
	"insert" 		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.INSERT, yyline+1, yycolumn+1, yytext()); }
	"into" 		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.INTO, yyline+1, yycolumn+1, yytext()); }
	"values" 		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.VALUES, yyline+1, yycolumn+1, yytext()); }
	"from" 			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.FROM, yyline+1, yycolumn+1, yytext()); }
	"where"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.WHERE, yyline+1, yycolumn+1, yytext()); }
	"with"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.WITH, yyline+1, yycolumn+1, yytext()); }
	"is"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.IS, yyline+1, yycolumn+1, yytext()); }
	"not"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.NOT, yyline+1, yycolumn+1, yytext()); }
	"by"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.BY, yyline+1, yycolumn+1, yytext()); }
	"group"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.GROUP, yyline+1, yycolumn+1, yytext()); }
	"having"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.HAVING, yyline+1, yycolumn+1, yytext()); }
	"sysdate"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.SYSDATE, yyline+1, yycolumn+1, yytext()); }
	"order"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.ORDER, yyline+1, yycolumn+1, yytext()); }
	"by"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.BY, yyline+1, yycolumn+1, yytext()); }
	"asc"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.ASC, yyline+1, yycolumn+1, yytext()); }
	"desc"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.DESC, yyline+1, yycolumn+1, yytext()); }
	"drop"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.DROP, yyline+1, yycolumn+1, yytext()); }
	"table"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.TABLE, yyline+1, yycolumn+1, yytext()); }
	"merge"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.MERGE, yyline+1, yycolumn+1, yytext()); }
	"top"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.TOP, yyline+1, yycolumn+1, yytext()); }
	"create"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.CREATE, yyline+1, yycolumn+1, yytext()); }
	"like"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.LIKE, yyline+1, yycolumn+1, yytext()); }
	"add"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.ADD, yyline+1, yycolumn+1, yytext()); }
	"column"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.COLUMN, yyline+1, yycolumn+1, yytext()); }
	"alter"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.ALTER, yyline+1, yycolumn+1, yytext()); }
	"commit"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.COMMIT, yyline+1, yycolumn+1, yytext()); }
	
/* Date functions */
	"to_timestamp"	{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.TO_TIMESTAMP, yyline+1, yycolumn+1, yytext()); }
	
/* Datatypes oracle */
	"varchar"	{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.VARCHAR, yyline+1, yycolumn+1, yytext()); }
	"varchar2"	{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.VARCHAR2, yyline+1, yycolumn+1, yytext()); }
	"number"	{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.NUMBER, yyline+1, yycolumn+1, yytext()); }
	"date"	{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.DATE, yyline+1, yycolumn+1, yytext()); }
	// put the two below in curly braces and change the categories to NUMBERS
	//"varcharSize"	{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.VARCHARSIZE, yyline+1, yycolumn+1, yytext()); }
	//"varchar2_size"	{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.VARCHAR2_SIZE, yyline+1, yycolumn+1, yytext()); }
	
	/* Datatypes server */
	"nvarchar"	{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.NVARCHAR, yyline+1, yycolumn+1, yytext()); }
	"smallint"	{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.SMALLINT, yyline+1, yycolumn+1, yytext()); }
	"nchar"	{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.NCHAR, yyline+1, yycolumn+1, yytext()); }
	"int"	{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.INT, yyline+1, yycolumn+1, yytext()); }
	"datetime"	{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.DATETIME, yyline+1, yycolumn+1, yytext()); }
	// put the two below in curly braces and change the categories to NUMBERS
	//"nvarchar_size"	{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.NVARCHAR_SIZE, yyline+1, yycolumn+1, yytext()); }
	//"nchar_size"	{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.NCHAR_SIZE, yyline+1, yycolumn+1, yytext()); }
	
/* Case expressions */
	"case"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.CASE, yyline+1, yycolumn+1, yytext()); }
	"when"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.WHEN, yyline+1, yycolumn+1, yytext()); }
	"then"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.THEN, yyline+1, yycolumn+1, yytext()); }
	"else"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.ELSE, yyline+1, yycolumn+1, yytext()); }
	"end"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.END, yyline+1, yycolumn+1, yytext()); }
	"matched"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.MATCHED, yyline+1, yycolumn+1, yytext()); }
	"exists"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.EXISTS, yyline+1, yycolumn+1, yytext()); }
	
	
/* JOINS */	
	"join"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.JOIN, yyline+1, yycolumn+1, yytext()); }
	"natural"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.NATURAL, yyline+1, yycolumn+1, yytext()); }
	"left"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.LEFT, yyline+1, yycolumn+1, yytext()); }
	"right"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.RIGHT, yyline+1, yycolumn+1, yytext()); }
	"outer"		    { System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.OUTER, yyline+1, yycolumn+1, yytext()); }
	"full"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.FULL, yyline+1, yycolumn+1, yytext()); }
	"inner"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.INNER, yyline+1, yycolumn+1, yytext()); }
	"on"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.ON, yyline+1, yycolumn+1, yytext()); }
	"into"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.INTO, yyline+1, yycolumn+1, yytext()); }
	"using"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.USING, yyline+1, yycolumn+1, yytext()); }
	"union"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.UNION, yyline+1, yycolumn+1, yytext()); }
	"all"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.ALL, yyline+1, yycolumn+1, yytext()); }
	
/* Aggregated function */
	"count"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.COUNT, yyline+1, yycolumn+1, yytext()); }
	"avg"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.AVG, yyline+1, yycolumn+1, yytext()); }
	"lpad"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.LPAD, yyline+1, yycolumn+1, yytext()); }
	"rpad"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.RPAD, yyline+1, yycolumn+1, yytext()); }
	"length"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.LENGTH, yyline+1, yycolumn+1, yytext()); }
	"sum"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.SUM, yyline+1, yycolumn+1, yytext()); }
	"max"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.MAX, yyline+1, yycolumn+1, yytext()); }
	"min"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.MIN, yyline+1, yycolumn+1, yytext()); }

/* Logical functions */
	"choose"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.CHOOSE, yyline+1, yycolumn+1, yytext()); }
	"iif"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.IIF, yyline+1, yycolumn+1, yytext()); }
	
/* String functions*/
	"concat"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.CONCAT, yyline+1, yycolumn+1, yytext()); }
	"replace"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.REPLACE, yyline+1, yycolumn+1, yytext()); }
	"trim"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.TRIM, yyline+1, yycolumn+1, yytext()); }
	"upper"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.UPPER, yyline+1, yycolumn+1, yytext()); }
	"lower"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.LOWER, yyline+1, yycolumn+1, yytext()); }
	"ltrim"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.LTRIM, yyline+1, yycolumn+1, yytext()); }
	"rtrim"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.RTRIM, yyline+1, yycolumn+1, yytext()); }
	"instr"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.INSTR, yyline+1, yycolumn+1, yytext()); }

/* Null Functions */
	"nullif"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.NULLIF, yyline+1, yycolumn+1, yytext()); }
	"isnull"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.ISNULL, yyline+1, yycolumn+1, yytext()); }

/* Other Function */
	"to_date"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.TO_DATE, yyline+1, yycolumn+1, yytext()); }
	"to_char"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.TO_CHAR, yyline+1, yycolumn+1, yytext()); }
	
/* Other operators */
	"as"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.AS, yyline+1, yycolumn+1, yytext()); }
	"in"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.IN, yyline+1, yycolumn+1, yytext()); }
	"distinct"		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.DISTINCT, yyline+1, yycolumn+1, yytext()); }
	"null"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym.NULL, yyline+1, yycolumn+1, yytext()); }
	
/* Logical conectors */
	"and"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym._AND, yyline+1, yycolumn+1, yytext()); }
	"or"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.RESERVED); return new Symbol(sym._OR, yyline+1, yycolumn+1, yytext()); }
/* Negation */
	//"not"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), ); return new Symbol(sym._NOT, yyline+1, yycolumn+1, yytext()); }
	
/* Logical Operators */
	"="				{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._EQU, yyline+1, yycolumn+1, yytext()); }
	">"				{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._GT, yyline+1, yycolumn+1, yytext()); }
	"<"				{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._LT, yyline+1, yycolumn+1, yytext()); }
	"<="			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._LET, yyline+1, yycolumn+1, yytext()); }
	">="			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._GET, yyline+1, yycolumn+1, yytext()); }
	"<>"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._DIFF, yyline+1, yycolumn+1, yytext()); }
	"!="			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._DIFF2, yyline+1, yycolumn+1, yytext()); }

/* Special Assignment operators*/ 
	"+="			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._PLUSEQ, yyline+1, yycolumn+1, yytext()); }
	"-="			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._MINUSEQ, yyline+1, yycolumn+1, yytext()); }
	"*="			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._TIMESEQ, yyline+1, yycolumn+1, yytext()); }
	"/="			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._DIVIDEEQ, yyline+1, yycolumn+1, yytext()); }
	"%="			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._MODEQ, yyline+1, yycolumn+1, yytext()); }
	"&="			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._ANDEQ, yyline+1, yycolumn+1, yytext()); }	
	"^="			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._POWEQ, yyline+1, yycolumn+1, yytext()); }
	"|="			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._OREQ, yyline+1, yycolumn+1, yytext()); }	
	
/* Arithmetic Operators */
	"+"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._PLUS, yyline+1, yycolumn+1, yytext()); }
	"-"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._MINUS, yyline+1, yycolumn+1, yytext()); }
//	"*"			/* Already defined as _START below*/
	"/"			{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._DIVIDE, yyline+1, yycolumn+1, yytext()); }
	
/* Grouping operators */
	
	"("				{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._OPENPAR, yyline+1, yycolumn+1, yytext()); }
	")"				{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._CLOSEPAR, yyline+1, yycolumn+1, yytext()); }

/* Statement closure */
	";"				{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._SEMCOL2, yyline+1, yycolumn+1, yytext()); }

/* Other characters */
	"*"				{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._STAR, yyline+1, yycolumn+1, yytext()); }
	","				{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); return new Symbol(sym._COMMA, yyline+1, yycolumn+1, yytext()); }
	
// Terminal tokens (LOWERCASE)
	{identifier}    { System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.IDENTIFIER); return new Symbol(sym.IDENTIFIER, yyline+1, yycolumn+1, yytext()); }
	{QTableName} 	{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.IDENTIFIER); return new Symbol(sym.QTABLENAME, yyline+1, yycolumn+1, yytext()); }
	{QColAlias}		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.IDENTIFIER); return new Symbol(sym.QCOLALIAS, yyline+1, yycolumn+1, yytext()); }	
	{TabDotCol}		{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.IDENTIFIER); return new Symbol(sym.TABDOTCOL, yyline+1, yycolumn+1, yytext()); }
	
	/*
	// SQL Server only
	{QTabDotCol}	{ System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.IDENTIFIER); return new Symbol(sym.QTABDOTCOL, yyline+1, yycolumn+1, yytext()); }
	*/
	
	{integer}       { System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NUMBER); return new Symbol(sym.INTEGER, yyline+1, yycolumn+1, yytext()); }
	{real}          { System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.NUMBER); return new Symbol(sym.REAL, yyline+1, yycolumn+1, yytext()); }
	{literalString} { System.out.println("Recognized: " + yytext()); prettyfier(yytext(), Categories.LITERAL_STRING); return new Symbol(sym.LITERAL_STRING, yyline+1, yycolumn+1, yytext()); }
// Comments
	{Comment}    	{ System.out.println("Recognized comment: " + yytext()); prettyfier(yytext(), Categories.COMMENT ); }
// Save spaces to copy SQL statement
	{whitespace}    { System.out.println("Recognized space: " + yytext()); prettyfier(yytext(), Categories.NOTHING ); }
}


// Lexical errors - This is like the default option in a SWITCH clause.
	[^]            	{ System.out.println("\n### Lexical error (Illegal element) ### - '" + yytext() + "' line: " + yyline + ", column: " + yychar + "\n"); 
				  	  TError errors_found = new TError(yytext(),yyline,yycolumn,"Lexical Error","Unrecognized symbol.");
				  	  TableLE.add(errors_found); 
				  	  prettyfier(yytext(), Categories.ERROR);
					  return new Symbol(sym.ILLEGAL_CHAR, yyline, yycolumn, yytext());
				  	}
