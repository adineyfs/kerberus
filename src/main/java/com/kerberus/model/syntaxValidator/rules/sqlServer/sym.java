
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150326 (SVN rev 63)
//----------------------------------------------------

package com.kerberus.model.syntaxValidator.rules.sqlServer;

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int AS = 51;
  public static final int LEFT = 42;
  public static final int VARCHAR2 = 32;
  public static final int IDENTIFIER = 84;
  public static final int REAL = 86;
  public static final int FROM = 9;
  public static final int LTRIM = 65;
  public static final int COLUMN = 29;
  public static final int _GT = 92;
  public static final int OUTER = 45;
  public static final int NATURAL = 41;
  public static final int GROUP = 11;
  public static final int _DIFF2 = 97;
  public static final int RIGHT = 43;
  public static final int TABLE = 17;
  public static final int TOP = 25;
  public static final int ASC = 21;
  public static final int LIKE = 27;
  public static final int SYSDATE = 49;
  public static final int _PLUSEQ = 103;
  public static final int SUM = 57;
  public static final int JOIN = 47;
  public static final int INNER = 46;
  public static final int ALL = 24;
  public static final int _LT = 93;
  public static final int INTEGER = 85;
  public static final int DATETIME = 40;
  public static final int _CLOSEPAR = 112;
  public static final int NOT = 14;
  public static final int NVARCHAR = 36;
  public static final int _OPENPAR = 111;
  public static final int MIN = 59;
  public static final int THEN = 79;
  public static final int _MINUSEQ = 104;
  public static final int LITERAL_STRING = 87;
  public static final int ISNULL = 75;
  public static final int TRIM = 69;
  public static final int LOWER = 71;
  public static final int SMALLINT = 37;
  public static final int WHEN = 78;
  public static final int INTO = 7;
  public static final int SELECT = 2;
  public static final int _AND = 101;
  public static final int FULL = 44;
  public static final int NUMBER = 34;
  public static final int _POWEQ = 109;
  public static final int _DIVIDE = 100;
  public static final int _SEMCOL2 = 115;
  public static final int _LET = 94;
  public static final int ALTER = 28;
  public static final int EXISTS = 83;
  public static final int IIF = 73;
  public static final int ORDER = 18;
  public static final int UNION = 23;
  public static final int NULLIF = 74;
  public static final int DELETE = 5;
  public static final int QCOLALIAS = 90;
  public static final int TABDOTCOL = 89;
  public static final int _MINUS = 99;
  public static final int MATCHED = 82;
  public static final int ADD = 30;
  public static final int _PLUS = 98;
  public static final int LPAD = 61;
  public static final int MAX = 58;
  public static final int CONCAT = 64;
  public static final int ELSE = 80;
  public static final int _MODEQ = 107;
  public static final int TO_TIMESTAMP = 50;
  public static final int INT = 39;
  public static final int INSTR = 67;
  public static final int _GET = 95;
  public static final int LENGTH = 63;
  public static final int AVG = 60;
  public static final int NULL = 55;
  public static final int EOF = 0;
  public static final int _STAR = 114;
  public static final int WHERE = 10;
  public static final int COUNT = 56;
  public static final int CHOOSE = 72;
  public static final int IS = 13;
  public static final int _EQU = 91;
  public static final int RPAD = 62;
  public static final int IN = 53;
  public static final int DATE = 35;
  public static final int SET = 4;
  public static final int error = 1;
  public static final int _OR = 102;
  public static final int ON = 52;
  public static final int DESC = 22;
  public static final int NCHAR = 38;
  public static final int END = 81;
  public static final int REPLACE = 68;
  public static final int BY = 19;
  public static final int QTABLENAME = 88;
  public static final int USING = 48;
  public static final int VALUES = 8;
  public static final int MERGE = 20;
  public static final int _ANDEQ = 108;
  public static final int CREATE = 26;
  public static final int _TIMESEQ = 105;
  public static final int _DIFF = 96;
  public static final int VARCHAR = 33;
  public static final int CASE = 77;
  public static final int _DIVIDEEQ = 106;
  public static final int UPDATE = 3;
  public static final int INSERT = 6;
  public static final int RTRIM = 66;
  public static final int UPPER = 70;
  public static final int COMMIT = 31;
  public static final int _OREQ = 110;
  public static final int DROP = 16;
  public static final int WITH = 15;
  public static final int DISTINCT = 54;
  public static final int HAVING = 12;
  public static final int ILLEGAL_CHAR = 116;
  public static final int _COMMA = 113;
  public static final int TO_CHAR = 76;
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
  "ALTER",
  "COLUMN",
  "ADD",
  "COMMIT",
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
  "NULLIF",
  "ISNULL",
  "TO_CHAR",
  "CASE",
  "WHEN",
  "THEN",
  "ELSE",
  "END",
  "MATCHED",
  "EXISTS",
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

