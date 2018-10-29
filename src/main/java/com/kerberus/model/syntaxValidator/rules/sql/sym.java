
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150326 (SVN rev 63)
//----------------------------------------------------

package com.kerberus.model.syntaxValidator.rules.sql;

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int AS = 47;
  public static final int VARCHAR2 = 28;
  public static final int LEFT = 38;
  public static final int IDENTIFIER = 82;
  public static final int REAL = 84;
  public static final int FROM = 9;
  public static final int LTRIM = 61;
  public static final int _GT = 94;
  public static final int GROUP = 11;
  public static final int OUTER = 41;
  public static final int NATURAL = 37;
  public static final int _DIFF2 = 99;
  public static final int NVARCHAR_SIZE = 91;
  public static final int RIGHT = 39;
  public static final int TABLE = 17;
  public static final int TOP = 25;
  public static final int ASC = 21;
  public static final int LIKE = 27;
  public static final int VARCHAR2_SIZE = 90;
  public static final int SYSDATE = 45;
  public static final int _PLUSEQ = 105;
  public static final int SUM = 53;
  public static final int NVL = 70;
  public static final int JOIN = 43;
  public static final int INNER = 42;
  public static final int TO_DATE = 74;
  public static final int ALL = 24;
  public static final int _LT = 95;
  public static final int INTEGER = 83;
  public static final int DATETIME = 36;
  public static final int _CLOSEPAR = 114;
  public static final int NOT = 14;
  public static final int NVARCHAR = 32;
  public static final int _OPENPAR = 113;
  public static final int MIN = 55;
  public static final int THEN = 78;
  public static final int _MINUSEQ = 106;
  public static final int LITERAL_STRING = 85;
  public static final int ISNULL = 73;
  public static final int TRIM = 65;
  public static final int SMALLINT = 33;
  public static final int LOWER = 67;
  public static final int WHEN = 77;
  public static final int INTO = 7;
  public static final int SELECT = 2;
  public static final int _AND = 103;
  public static final int NUMBER = 30;
  public static final int FULL = 40;
  public static final int _POWEQ = 111;
  public static final int _DIVIDE = 102;
  public static final int _SEMCOL2 = 117;
  public static final int _LET = 96;
  public static final int IIF = 69;
  public static final int ORDER = 18;
  public static final int UNION = 23;
  public static final int NULLIF = 72;
  public static final int DELETE = 5;
  public static final int NCHAR_SIZE = 92;
  public static final int QCOLALIAS = 88;
  public static final int TABDOTCOL = 87;
  public static final int _MINUS = 101;
  public static final int MATCHED = 81;
  public static final int _PLUS = 100;
  public static final int MAX = 54;
  public static final int LPAD = 57;
  public static final int CONCAT = 60;
  public static final int ELSE = 79;
  public static final int _MODEQ = 109;
  public static final int INT = 35;
  public static final int TO_TIMESTAMP = 46;
  public static final int INSTR = 63;
  public static final int _GET = 97;
  public static final int LENGTH = 59;
  public static final int AVG = 56;
  public static final int NULL = 51;
  public static final int EOF = 0;
  public static final int _STAR = 116;
  public static final int WHERE = 10;
  public static final int COUNT = 52;
  public static final int CHOOSE = 68;
  public static final int IS = 13;
  public static final int _EQU = 93;
  public static final int RPAD = 58;
  public static final int NVL2 = 71;
  public static final int IN = 49;
  public static final int DATE = 31;
  public static final int VARCHARSIZE = 89;
  public static final int SET = 4;
  public static final int error = 1;
  public static final int _OR = 104;
  public static final int ON = 48;
  public static final int DESC = 22;
  public static final int NCHAR = 34;
  public static final int END = 80;
  public static final int REPLACE = 64;
  public static final int BY = 19;
  public static final int QTABLENAME = 86;
  public static final int VALUES = 8;
  public static final int USING = 44;
  public static final int MERGE = 20;
  public static final int _ANDEQ = 110;
  public static final int CREATE = 26;
  public static final int _TIMESEQ = 107;
  public static final int _DIFF = 98;
  public static final int VARCHAR = 29;
  public static final int CASE = 76;
  public static final int _DIVIDEEQ = 108;
  public static final int UPDATE = 3;
  public static final int INSERT = 6;
  public static final int RTRIM = 62;
  public static final int UPPER = 66;
  public static final int _OREQ = 112;
  public static final int DROP = 16;
  public static final int WITH = 15;
  public static final int HAVING = 12;
  public static final int DISTINCT = 50;
  public static final int ILLEGAL_CHAR = 118;
  public static final int _COMMA = 115;
  public static final int TO_CHAR = 75;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "SELECT",
  "UPDATE",
  "SET",
  "DELETE",
  "INSERT",
  "INTO",
  "VALUES",
  "FROM",
  "WHERE",
  "GROUP",
  "HAVING",
  "IS",
  "NOT",
  "WITH",
  "DROP",
  "TABLE",
  "ORDER",
  "BY",
  "MERGE",
  "ASC",
  "DESC",
  "UNION",
  "ALL",
  "TOP",
  "CREATE",
  "LIKE",
  "VARCHAR2",
  "VARCHAR",
  "NUMBER",
  "DATE",
  "NVARCHAR",
  "SMALLINT",
  "NCHAR",
  "INT",
  "DATETIME",
  "NATURAL",
  "LEFT",
  "RIGHT",
  "FULL",
  "OUTER",
  "INNER",
  "JOIN",
  "USING",
  "SYSDATE",
  "TO_TIMESTAMP",
  "AS",
  "ON",
  "IN",
  "DISTINCT",
  "NULL",
  "COUNT",
  "SUM",
  "MAX",
  "MIN",
  "AVG",
  "LPAD",
  "RPAD",
  "LENGTH",
  "CONCAT",
  "LTRIM",
  "RTRIM",
  "INSTR",
  "REPLACE",
  "TRIM",
  "UPPER",
  "LOWER",
  "CHOOSE",
  "IIF",
  "NVL",
  "NVL2",
  "NULLIF",
  "ISNULL",
  "TO_DATE",
  "TO_CHAR",
  "CASE",
  "WHEN",
  "THEN",
  "ELSE",
  "END",
  "MATCHED",
  "IDENTIFIER",
  "INTEGER",
  "REAL",
  "LITERAL_STRING",
  "QTABLENAME",
  "TABDOTCOL",
  "QCOLALIAS",
  "VARCHARSIZE",
  "VARCHAR2_SIZE",
  "NVARCHAR_SIZE",
  "NCHAR_SIZE",
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

