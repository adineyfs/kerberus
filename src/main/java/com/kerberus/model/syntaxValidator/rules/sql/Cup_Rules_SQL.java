
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150326 (SVN rev 63)
//----------------------------------------------------

package com.kerberus.model.syntaxValidator.rules.sql;

import java_cup.runtime.*;
import java.util.LinkedList;
import java.io.*;
import com.kerberus.model.syntaxValidator.rules.util.*;
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
    "\000\053\000\002\002\004\000\002\006\005\000\002\006" +
    "\004\000\002\006\004\000\002\006\003\000\002\007\003" +
    "\000\002\007\003\000\002\007\003\000\002\010\004\000" +
    "\002\010\005\000\002\011\004\000\002\011\004\000\002" +
    "\002\003\000\002\014\005\000\002\014\003\000\002\022" +
    "\006\000\002\023\004\000\002\024\007\000\002\024\005" +
    "\000\002\025\003\000\002\025\003\000\002\025\003\000" +
    "\002\026\005\000\002\012\004\000\002\003\003\000\002" +
    "\005\003\000\002\013\004\000\002\004\003\000\002\015" +
    "\005\000\002\015\003\000\002\016\005\000\002\021\003" +
    "\000\002\021\003\000\002\021\003\000\002\021\003\000" +
    "\002\020\003\000\002\020\003\000\002\020\003\000\002" +
    "\020\003\000\002\020\003\000\002\020\003\000\002\017" +
    "\003\000\002\017\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\100\000\012\003\013\004\014\005\006\007\011\001" +
    "\002\000\006\012\076\016\100\001\002\000\004\010\062" +
    "\001\002\000\004\012\066\001\002\000\004\030\ufffa\001" +
    "\002\000\012\002\070\004\014\005\006\007\011\001\002" +
    "\000\004\010\062\001\002\000\004\030\061\001\002\000" +
    "\014\002\ufffd\004\ufffd\005\ufffd\007\ufffd\030\060\001\002" +
    "\000\006\012\ufff5\016\ufff5\001\002\000\004\030\ufffc\001" +
    "\002\000\004\030\ufffb\001\002\000\004\006\020\001\002" +
    "\000\004\012\022\001\002\000\004\011\032\001\002\000" +
    "\004\017\023\001\002\000\010\013\024\014\025\015\027" +
    "\001\002\000\006\011\uffee\027\uffee\001\002\000\006\011" +
    "\uffed\027\uffed\001\002\000\006\011\uffef\027\030\001\002" +
    "\000\006\011\uffec\027\uffec\001\002\000\004\012\022\001" +
    "\002\000\004\011\ufff0\001\002\000\012\012\uffe6\013\uffe6" +
    "\014\uffe6\015\uffe6\001\002\000\004\030\ufff2\001\002\000" +
    "\012\012\042\013\036\014\037\015\043\001\002\000\004" +
    "\030\uffe7\001\002\000\024\017\uffe1\020\uffe1\021\uffe1\022" +
    "\uffe1\023\uffe1\024\uffe1\025\uffe1\026\uffe1\030\uffe1\001\002" +
    "\000\024\017\uffe0\020\uffe0\021\uffe0\022\uffe0\023\uffe0\024" +
    "\uffe0\025\uffe0\026\uffe0\030\uffe0\001\002\000\016\017\056" +
    "\020\055\021\054\022\052\023\051\024\050\001\002\000" +
    "\010\025\046\026\045\030\uffe4\001\002\000\024\017\uffe2" +
    "\020\uffe2\021\uffe2\022\uffe2\023\uffe2\024\uffe2\025\uffe2\026" +
    "\uffe2\030\uffe2\001\002\000\024\017\uffdf\020\uffdf\021\uffdf" +
    "\022\uffdf\023\uffdf\024\uffdf\025\uffdf\026\uffdf\030\uffdf\001" +
    "\002\000\012\012\042\013\036\014\037\015\043\001\002" +
    "\000\012\012\uffd7\013\uffd7\014\uffd7\015\uffd7\001\002\000" +
    "\012\012\uffd8\013\uffd8\014\uffd8\015\uffd8\001\002\000\004" +
    "\030\uffe5\001\002\000\012\012\uffd9\013\uffd9\014\uffd9\015" +
    "\uffd9\001\002\000\012\012\uffda\013\uffda\014\uffda\015\uffda" +
    "\001\002\000\012\012\uffdb\013\uffdb\014\uffdb\015\uffdb\001" +
    "\002\000\012\012\042\013\036\014\037\015\043\001\002" +
    "\000\012\012\uffdc\013\uffdc\014\uffdc\015\uffdc\001\002\000" +
    "\012\012\uffdd\013\uffdd\014\uffdd\015\uffdd\001\002\000\012" +
    "\012\uffde\013\uffde\014\uffde\015\uffde\001\002\000\010\025" +
    "\uffe3\026\uffe3\030\uffe3\001\002\000\012\002\ufffe\004\ufffe" +
    "\005\ufffe\007\ufffe\001\002\000\012\002\uffff\004\uffff\005" +
    "\uffff\007\uffff\001\002\000\004\012\uffe9\001\002\000\004" +
    "\011\032\001\002\000\004\012\066\001\002\000\006\011" +
    "\uffea\030\uffea\001\002\000\010\006\uffe8\011\uffe8\030\uffe8" +
    "\001\002\000\004\030\uffeb\001\002\000\004\002\001\001" +
    "\002\000\004\030\072\001\002\000\012\002\000\004\000" +
    "\005\000\007\000\001\002\000\004\006\ufff1\001\002\000" +
    "\006\011\032\030\ufff9\001\002\000\004\030\ufff8\001\002" +
    "\000\006\010\ufff3\027\101\001\002\000\004\010\ufff6\001" +
    "\002\000\004\010\ufff7\001\002\000\004\012\076\001\002" +
    "\000\004\010\ufff4\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\100\000\022\002\003\006\007\007\011\010\014\011" +
    "\004\022\006\023\016\026\015\001\001\000\004\014\076" +
    "\001\001\000\006\003\063\012\073\001\001\000\004\005" +
    "\072\001\001\000\002\001\001\000\020\002\003\007\070" +
    "\010\014\011\004\022\006\023\016\026\015\001\001\000" +
    "\006\003\063\012\062\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\024\020\001\001\000\006" +
    "\004\033\013\032\001\001\000\002\001\001\000\004\025" +
    "\025\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\024\030\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\015\034\016\040\021\037\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\020\052\001\001" +
    "\000\004\017\043\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\015\046\016\040\021\037\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\021\056" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\004\033\013\066\001\001\000" +
    "\004\005\064\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\004\033\013\074" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\014\101\001\001\000\002" +
    "\001\001" });

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



	// This list will store every error found in the syntax analysis process. SE -> Syntax errors
	public static LinkedList<TError> TableSE = new LinkedList<TError>();

	// This object has a list with all columns found and its table
	//public static ColumnEvalutator Columns = new ColumnEvaluator();

	public LinkedList<String> Tables  = new LinkedList<String>();
	public LinkedList<String> Columns = new LinkedList<String>();

	public  Scanner s;
  	public  int errors = 0, line, column;
  	public 	String the_error;
	public 	StringBuilder the_error_message;


	/* This is the error handler */
	public void report_error(String message, Object info) {

        /* Create a StringBuilder called 'm' with the string 'Error' in it. */
        StringBuilder m = new StringBuilder("\n\n---- Error message: " + message + "\n");
   
        /* Check if the information passed to the method is the same
           type as the type java_cup.runtime.Symbol. */
        if (info instanceof java_cup.runtime.Symbol) {

        	errors++;

            /* Declare a java_cup.runtime.Symbol object 's' with the
               information in the object info that is being typecasted
               as a java_cup.runtime.Symbol object. */
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
   
            /* Check if the line number in the input is greater or
               equal to zero. */
            if (s.left >= 0 && s.right >= 0) {

            	the_error = s.value.toString();
                
                m.append("--> Unexpected : " + the_error );
                m.append(" at line: "+(s.left+1));   
                m.append(", column: "+(s.right+1));

				the_error_message = m;
            }
        }
   
        /* Print the contents of the StringBuilder 'm', which contains
           an error message, out on a line. */
        System.err.println(m);
    }
   
    /* Change the method report_fatal_error so when it reports a fatal
       error it will display the line and column number of where the
       fatal error occurred in the input as well as the reason for the
       fatal error which is passed into the method in the object
       'message' and then exit.*/

    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
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
          case 0: // $START ::= statement_group EOF 
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
          case 1: // statement_group ::= statement_group statement _SEMCOL2 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("statement_group",4, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // statement_group ::= statement _SEMCOL2 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("statement_group",4, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // statement_group ::= error _SEMCOL2 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("statement_group",4, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // statement_group ::= error 
            {
              Object RESULT =null;
		int errleft = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()).left;
		int errright = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()).right;
		Object err = (Object)((java_cup.runtime.Symbol) CUP$Cup_Rules_SQL$stack.peek()).value;
		 System.out.println(" Error in left: " + (errleft+1) + ", right: " + (errright+1) + "\n Here: " + err ); 
              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("statement_group",4, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // statement ::= select_s 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("statement",5, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // statement ::= delete_s 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("statement",5, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // statement ::= update_s 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("statement",5, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // select_s ::= select_part from_part 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("select_s",6, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // select_s ::= select_part from_part where_part 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("select_s",6, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // select_part ::= _select _STAR 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("select_part",7, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // select_part ::= _select cols 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("select_part",7, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // _select ::= SELECT 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_select",0, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // cols ::= IDENTIFIER _COMMA cols 
            {
              Object RESULT =null;
		int col1left = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)).left;
		int col1right = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)).right;
		Object col1 = (Object)((java_cup.runtime.Symbol) CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)).value;
		 Columns.add(col1 + ""); 
              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("cols",10, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // cols ::= IDENTIFIER 
            {
              Object RESULT =null;
		int col2left = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()).left;
		int col2right = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()).right;
		Object col2 = (Object)((java_cup.runtime.Symbol) CUP$Cup_Rules_SQL$stack.peek()).value;
		 Columns.add(col2 + ""); 
              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("cols",10, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // update_s ::= update_part SET set_cols where_part 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("update_s",16, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-3)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // update_part ::= UPDATE table_name 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("update_part",17, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // set_cols ::= IDENTIFIER _EQU value _COMMA set_cols 
            {
              Object RESULT =null;
		int col1left = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-4)).left;
		int col1right = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-4)).right;
		Object col1 = (Object)((java_cup.runtime.Symbol) CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-4)).value;
		 Columns.add(col1 + ""); 
              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("set_cols",18, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-4)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // set_cols ::= IDENTIFIER _EQU value 
            {
              Object RESULT =null;
		int col1left = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)).left;
		int col1right = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)).right;
		Object col1 = (Object)((java_cup.runtime.Symbol) CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)).value;
		 Columns.add(col1 + ""); 
              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("set_cols",18, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // value ::= INTEGER 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("value",19, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // value ::= REAL 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("value",19, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // value ::= LITERAL_STRING 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("value",19, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // delete_s ::= DELETE from_part where_part 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("delete_s",20, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // from_part ::= _from table_name 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("from_part",8, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // _from ::= FROM 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_from",1, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // table_name ::= IDENTIFIER 
            {
              Object RESULT =null;
		int tableft = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()).left;
		int tabright = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()).right;
		Object tab = (Object)((java_cup.runtime.Symbol) CUP$Cup_Rules_SQL$stack.peek()).value;
		 Tables.add(tab+""); 
              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("table_name",3, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // where_part ::= _where w_condition 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("where_part",9, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // _where ::= WHERE 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_where",2, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // w_condition ::= cond log_oper w_condition 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("w_condition",11, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // w_condition ::= cond 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("w_condition",11, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // cond ::= element ari_oper element 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("cond",12, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // element ::= IDENTIFIER 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("element",15, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // element ::= INTEGER 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("element",15, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // element ::= REAL 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("element",15, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // element ::= LITERAL_STRING 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("element",15, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // ari_oper ::= _EQU 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("ari_oper",14, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // ari_oper ::= _GT 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("ari_oper",14, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // ari_oper ::= _LT 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("ari_oper",14, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // ari_oper ::= _LET 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("ari_oper",14, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // ari_oper ::= _GET 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("ari_oper",14, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // ari_oper ::= _DIFF 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("ari_oper",14, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // log_oper ::= _AND 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("log_oper",13, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // log_oper ::= _OR 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("log_oper",13, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
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