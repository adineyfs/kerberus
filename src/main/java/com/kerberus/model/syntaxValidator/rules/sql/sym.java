
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150326 (SVN rev 63)
//----------------------------------------------------

package com.kerberus.model.syntaxValidator.rules.sql;

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
<<<<<<< HEAD
  public static final int _ANDEQ = 53;
  public static final int QCOLALIAS = 35;
  public static final int WHEN = 25;
  public static final int _POWEQ = 54;
  public static final int _MODEQ = 52;
  public static final int NATURAL = 8;
  public static final int CASE = 24;
  public static final int OUTER = 12;
  public static final int INTEGER = 30;
  public static final int _SEMCOL2 = 60;
  public static final int UPDATE = 3;
  public static final int DELETE = 5;
  public static final int _STAR = 59;
  public static final int WHERE = 7;
  public static final int _MINUS = 44;
  public static final int _DIVIDE = 45;
  public static final int FULL = 11;
  public static final int _AND = 46;
  public static final int _LT = 38;
  public static final int _OR = 47;
  public static final int IN = 17;
  public static final int _GET = 40;
  public static final int _COMMA = 58;
  public static final int ON = 16;
  public static final int SELECT = 2;
  public static final int _PLUS = 43;
  public static final int MIN = 23;
  public static final int LEFT = 9;
  public static final int EOF = 0;
  public static final int error = 1;
  public static final int DISTINCT = 18;
  public static final int _OREQ = 55;
  public static final int _TIMESEQ = 50;
  public static final int NULL = 19;
  public static final int JOIN = 14;
  public static final int INNER = 13;
  public static final int _PLUSEQ = 48;
  public static final int FROM = 6;
  public static final int REAL = 31;
  public static final int TABDOTCOL = 34;
  public static final int _EQU = 36;
  public static final int _OPENPAR = 56;
  public static final int ELSE = 27;
  public static final int ILLEGAL_CHAR = 61;
  public static final int LITERAL_STRING = 32;
  public static final int _LET = 39;
  public static final int THEN = 26;
  public static final int QTABLENAME = 33;
  public static final int END = 28;
  public static final int SUM = 21;
  public static final int _MINUSEQ = 49;
  public static final int _DIFF = 41;
  public static final int _DIFF2 = 42;
  public static final int COUNT = 20;
  public static final int AS = 15;
  public static final int RIGHT = 10;
  public static final int _CLOSEPAR = 57;
  public static final int _DIVIDEEQ = 51;
  public static final int _GT = 37;
  public static final int MAX = 22;
  public static final int SET = 4;
  public static final int IDENTIFIER = 29;
=======
  public static final int _ANDEQ = 51;
  public static final int QCOLALIAS = 33;
  public static final int WHEN = 23;
  public static final int _POWEQ = 52;
  public static final int _MODEQ = 50;
  public static final int NATURAL = 8;
  public static final int USING = 15;
  public static final int CASE = 22;
  public static final int OUTER = 12;
  public static final int INTEGER = 28;
  public static final int _SEMCOL2 = 58;
  public static final int UPDATE = 3;
  public static final int DELETE = 5;
  public static final int _STAR = 57;
  public static final int WHERE = 7;
  public static final int _MINUS = 42;
  public static final int _DIVIDE = 43;
  public static final int FULL = 11;
  public static final int _AND = 44;
  public static final int _LT = 36;
  public static final int _OR = 45;
  public static final int IN = 18;
  public static final int _GET = 38;
  public static final int _COMMA = 56;
  public static final int ON = 17;
  public static final int SELECT = 2;
  public static final int _PLUS = 41;
  public static final int LEFT = 9;
  public static final int EOF = 0;
  public static final int error = 1;
  public static final int DISTINCT = 19;
  public static final int _OREQ = 53;
  public static final int _TIMESEQ = 48;
  public static final int NULL = 20;
  public static final int JOIN = 14;
  public static final int INNER = 13;
  public static final int _PLUSEQ = 46;
  public static final int FROM = 6;
  public static final int REAL = 29;
  public static final int TABDOTCOL = 32;
  public static final int _EQU = 34;
  public static final int _OPENPAR = 54;
  public static final int ELSE = 25;
  public static final int ILLEGAL_CHAR = 59;
  public static final int LITERAL_STRING = 30;
  public static final int _LET = 37;
  public static final int THEN = 24;
  public static final int QTABLENAME = 31;
  public static final int END = 26;
  public static final int _MINUSEQ = 47;
  public static final int _DIFF = 39;
  public static final int _DIFF2 = 40;
  public static final int COUNT = 21;
  public static final int AS = 16;
  public static final int RIGHT = 10;
  public static final int _CLOSEPAR = 55;
  public static final int _DIVIDEEQ = 49;
  public static final int _GT = 35;
  public static final int SET = 4;
  public static final int IDENTIFIER = 27;
>>>>>>> release-0.3_card_47
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "SELECT",
  "UPDATE",
  "SET",
  "DELETE",
  "FROM",
  "WHERE",
  "NATURAL",
  "LEFT",
  "RIGHT",
  "FULL",
  "OUTER",
  "INNER",
  "JOIN",
  "USING",
  "AS",
  "ON",
  "IN",
  "DISTINCT",
  "NULL",
  "COUNT",
  "SUM",
  "MAX",
  "MIN",
  "CASE",
  "WHEN",
  "THEN",
  "ELSE",
  "END",
  "IDENTIFIER",
  "INTEGER",
  "REAL",
  "LITERAL_STRING",
  "QTABLENAME",
  "TABDOTCOL",
  "QCOLALIAS",
  "_EQU",
  "_GT",
  "_LT",
  "_LET",
  "_GET",
  "_DIFF",
  "_DIFF2",
  "_PLUS",
  "_MINUS",
  "_DIVIDE",
  "_AND",
  "_OR",
  "_PLUSEQ",
  "_MINUSEQ",
  "_TIMESEQ",
  "_DIVIDEEQ",
  "_MODEQ",
  "_ANDEQ",
  "_POWEQ",
  "_OREQ",
  "_OPENPAR",
  "_CLOSEPAR",
  "_COMMA",
  "_STAR",
  "_SEMCOL2",
  "ILLEGAL_CHAR"
  };
}

