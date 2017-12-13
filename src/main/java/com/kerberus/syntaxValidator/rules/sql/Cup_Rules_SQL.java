
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150326 (SVN rev 63)
//----------------------------------------------------

package com.kerberus.syntaxValidator.rules.sql;

import java_cup.runtime.*;
import java.util.LinkedList;
import java.io.*;
import com.kerberus.syntaxValidator.rules.util.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20150326 (SVN rev 63) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Cup_Rules_SQL extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Cup_Rules_SQL() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Cup_Rules_SQL(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Cup_Rules_SQL(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\033\000\002\002\004\000\002\002\003\000\002\002" +
    "\004\000\002\003\005\000\002\007\004\000\002\004\005" +
    "\000\002\004\003\000\002\004\003\000\002\005\004\000" +
    "\002\006\003\000\002\010\004\000\002\011\005\000\002" +
    "\011\003\000\002\012\005\000\002\012\003\000\002\015" +
    "\003\000\002\015\003\000\002\015\003\000\002\013\003" +
    "\000\002\013\003\000\002\013\003\000\002\013\003\000" +
    "\002\013\003\000\002\013\003\000\002\014\003\000\002" +
    "\014\003\000\002\016\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\045\000\004\004\007\001\002\000\004\007\020\001" +
    "\002\000\006\002\000\030\016\001\002\000\004\002\015" +
    "\001\002\000\006\011\011\014\012\001\002\000\004\007" +
    "\ufffd\001\002\000\006\007\ufffb\026\013\001\002\000\004" +
    "\007\ufffa\001\002\000\006\011\011\014\012\001\002\000" +
    "\004\007\ufffc\001\002\000\004\002\001\001\002\000\004" +
    "\002\uffe7\001\002\000\004\002\uffff\001\002\000\004\011" +
    "\046\001\002\000\004\010\022\001\002\000\010\011\025" +
    "\012\026\013\030\001\002\000\006\002\ufffe\030\ufffe\001" +
    "\002\000\026\002\ufff3\015\043\016\042\017\041\020\040" +
    "\021\037\022\036\023\ufff3\024\ufff3\030\ufff3\001\002\000" +
    "\026\002\ufff2\015\ufff2\016\ufff2\017\ufff2\020\ufff2\021\ufff2" +
    "\022\ufff2\023\ufff2\024\ufff2\030\ufff2\001\002\000\026\002" +
    "\ufff1\015\ufff1\016\ufff1\017\ufff1\020\ufff1\021\ufff1\022\ufff1" +
    "\023\ufff1\024\ufff1\030\ufff1\001\002\000\012\002\ufff5\023" +
    "\033\024\032\030\ufff5\001\002\000\026\002\ufff0\015\ufff0" +
    "\016\ufff0\017\ufff0\020\ufff0\021\ufff0\022\ufff0\023\ufff0\024" +
    "\ufff0\030\ufff0\001\002\000\006\002\ufff7\030\ufff7\001\002" +
    "\000\010\011\uffe8\012\uffe8\013\uffe8\001\002\000\010\011" +
    "\uffe9\012\uffe9\013\uffe9\001\002\000\010\011\025\012\026" +
    "\013\030\001\002\000\006\002\ufff6\030\ufff6\001\002\000" +
    "\010\011\uffea\012\uffea\013\uffea\001\002\000\010\011\uffeb" +
    "\012\uffeb\013\uffeb\001\002\000\010\011\uffec\012\uffec\013" +
    "\uffec\001\002\000\010\011\uffed\012\uffed\013\uffed\001\002" +
    "\000\010\011\uffee\012\uffee\013\uffee\001\002\000\010\011" +
    "\uffef\012\uffef\013\uffef\001\002\000\010\011\025\012\026" +
    "\013\030\001\002\000\012\002\ufff4\023\ufff4\024\ufff4\030" +
    "\ufff4\001\002\000\004\010\ufff8\001\002\000\004\010\ufff9" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\045\000\010\002\005\003\004\007\003\001\001\000" +
    "\004\005\020\001\001\000\004\016\016\001\001\000\002" +
    "\001\001\000\004\004\007\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\013\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\006\046\001\001\000\004\010\022" +
    "\001\001\000\010\011\030\012\026\015\023\001\001\000" +
    "\002\001\001\000\004\013\043\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\014\033\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\011\034\012\026\015\023\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\012\044\015\023\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Cup_Rules_SQL$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Cup_Rules_SQL$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Cup_Rules_SQL$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	// This list will hold every error found in the syntax analysis process. SE -> Syntax errors
	public static LinkedList<TError> TableSE = new LinkedList<TError>();

	// Recoverable syntax errors - This method will take case of the errors, and notify about it
	public void syntax_error(Symbol s) 
	{
		String lexeme = s.value.toString();
		int column = s.right;
		int row = s.left;
		
		System.out.println("### - Syntax error detected - ###\n");
		System.out.println("---> Unexpected: " + lexeme + " at (row,colum): ("+row+"," + column + ").");
		
		TError errors_found = new TError(lexeme,row,column, "Syntax error", "Unexpected " + lexeme);
		TableSE .add(errors_found);
	}
	
	// Unrecoverable syntax errors - This method will catch any other errors that go beyond our language(exceptions)
	public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
	{
		/*
		String lexeme = s.value.toString();
		int row = s.right;
		int column = s.left;
		
		System.out.println("### Syntax error captured ###");
		System.out.println("### - Unrecoverable syntax error detected - ###");
		System.out.println("\t\tLexeme:" + lexeme);
		System.out.println("\t\tRow: " + row);
		System.out.println("\t\tColumn: " + column);
		
		TError errors_found = new TError(lexeme,row,column, "Unrecoverable syntax error", "Unexpected character");
		TableSE .add(errors_found);
		*/
	}	
	


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Cup_Rules_SQL$actions {


	

  private final Cup_Rules_SQL parser;

  /** Constructor */
  CUP$Cup_Rules_SQL$actions(Cup_Rules_SQL parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Cup_Rules_SQL$do_action_part00000000(
    int                        CUP$Cup_Rules_SQL$act_num,
    java_cup.runtime.lr_parser CUP$Cup_Rules_SQL$parser,
    java.util.Stack            CUP$Cup_Rules_SQL$stack,
    int                        CUP$Cup_Rules_SQL$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Cup_Rules_SQL$result;

      /* select the action based on the action number */
      switch (CUP$Cup_Rules_SQL$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= _START_ EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)).value;
		RESULT = start_val;
              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Cup_Rules_SQL$parser.done_parsing();
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // _START_ ::= _SELS_ 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_START_",0, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // _START_ ::= _SELS_ _SC_ 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_START_",0, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // _SELS_ ::= _SEL_ _FRO_ _WHE_ 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_SELS_",1, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // _SEL_ ::= SELECT _COLS_ 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_SEL_",5, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // _COLS_ ::= identifier _COMMA _COLS_ 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_COLS_",2, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // _COLS_ ::= identifier 
            {
              Object RESULT =null;
		int colleft = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()).left;
		int colright = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()).right;
		Object col = (Object)((java_cup.runtime.Symbol) CUP$Cup_Rules_SQL$stack.peek()).value;
		 System.out.println("Column: " + col + " found in (x,y): ("+ colleft +","+ colright +")"); 
              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_COLS_",2, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // _COLS_ ::= _STAR 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_COLS_",2, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // _FRO_ ::= FROM _TABLE_ 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_FRO_",3, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // _TABLE_ ::= identifier 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_TABLE_",4, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // _WHE_ ::= WHERE _WC_ 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_WHE_",6, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // _WC_ ::= _COND_ _LC_ _WC_ 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_WC_",7, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // _WC_ ::= _COND_ 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_WC_",7, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // _COND_ ::= _EL_ _OPER_ _COND_ 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_COND_",8, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // _COND_ ::= _EL_ 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_COND_",8, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // _EL_ ::= identifier 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_EL_",11, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // _EL_ ::= integer 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_EL_",11, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // _EL_ ::= real 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_EL_",11, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // _OPER_ ::= _EQU 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_OPER_",9, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // _OPER_ ::= _GT 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_OPER_",9, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // _OPER_ ::= _LT 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_OPER_",9, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // _OPER_ ::= _LET 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_OPER_",9, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // _OPER_ ::= _GET 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_OPER_",9, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // _OPER_ ::= _DIFF 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_OPER_",9, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // _LC_ ::= _AND 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_LC_",10, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // _LC_ ::= _OR 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_LC_",10, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // _SC_ ::= _SEMCOL2 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_SC_",12, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Cup_Rules_SQL$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Cup_Rules_SQL$do_action(
    int                        CUP$Cup_Rules_SQL$act_num,
    java_cup.runtime.lr_parser CUP$Cup_Rules_SQL$parser,
    java.util.Stack            CUP$Cup_Rules_SQL$stack,
    int                        CUP$Cup_Rules_SQL$top)
    throws java.lang.Exception
    {
              return CUP$Cup_Rules_SQL$do_action_part00000000(
                               CUP$Cup_Rules_SQL$act_num,
                               CUP$Cup_Rules_SQL$parser,
                               CUP$Cup_Rules_SQL$stack,
                               CUP$Cup_Rules_SQL$top);
    }
}

}
