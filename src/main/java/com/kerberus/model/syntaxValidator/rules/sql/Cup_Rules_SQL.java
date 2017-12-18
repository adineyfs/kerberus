
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
    "\000\041\000\002\002\004\000\002\006\005\000\002\006" +
    "\004\000\002\006\004\000\002\006\003\000\002\007\003" +
    "\000\002\010\004\000\002\010\005\000\002\011\004\000" +
    "\002\011\004\000\002\002\003\000\002\014\005\000\002" +
    "\014\003\000\002\012\004\000\002\003\003\000\002\005" +
    "\003\000\002\013\004\000\002\004\003\000\002\015\005" +
    "\000\002\015\003\000\002\016\005\000\002\016\003\000" +
    "\002\021\003\000\002\021\003\000\002\021\003\000\002" +
    "\020\003\000\002\020\003\000\002\020\003\000\002\020" +
    "\003\000\002\020\003\000\002\020\003\000\002\017\003" +
    "\000\002\017\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\054\000\006\003\005\004\012\001\002\000\004\024" +
    "\ufffc\001\002\000\010\002\ufffd\004\ufffd\024\056\001\002" +
    "\000\004\005\024\001\002\000\006\007\017\012\021\001" +
    "\002\000\004\024\016\001\002\000\006\002\014\004\012" +
    "\001\002\000\006\007\ufff7\012\ufff7\001\002\000\004\024" +
    "\015\001\002\000\004\002\001\001\002\000\006\002\000" +
    "\004\000\001\002\000\006\002\uffff\004\uffff\001\002\000" +
    "\006\005\ufff5\023\022\001\002\000\004\005\ufff8\001\002" +
    "\000\004\005\ufff9\001\002\000\004\007\017\001\002\000" +
    "\004\005\ufff6\001\002\000\004\007\ufff3\001\002\000\006" +
    "\006\031\024\ufffb\001\002\000\004\007\030\001\002\000" +
    "\006\006\ufff4\024\ufff4\001\002\000\006\006\ufff2\024\ufff2" +
    "\001\002\000\010\007\ufff0\010\ufff0\011\ufff0\001\002\000" +
    "\004\024\ufffa\001\002\000\010\007\041\010\034\011\037" +
    "\001\002\000\024\013\uffea\014\uffea\015\uffea\016\uffea\017" +
    "\uffea\020\uffea\021\uffea\022\uffea\024\uffea\001\002\000\004" +
    "\024\ufff1\001\002\000\024\013\054\014\053\015\052\016" +
    "\050\017\047\020\046\021\uffec\022\uffec\024\uffec\001\002" +
    "\000\024\013\uffe9\014\uffe9\015\uffe9\016\uffe9\017\uffe9\020" +
    "\uffe9\021\uffe9\022\uffe9\024\uffe9\001\002\000\010\021\044" +
    "\022\043\024\uffee\001\002\000\024\013\uffeb\014\uffeb\015" +
    "\uffeb\016\uffeb\017\uffeb\020\uffeb\021\uffeb\022\uffeb\024\uffeb" +
    "\001\002\000\010\007\041\010\034\011\037\001\002\000" +
    "\010\007\uffe1\010\uffe1\011\uffe1\001\002\000\010\007\uffe2" +
    "\010\uffe2\011\uffe2\001\002\000\004\024\uffef\001\002\000" +
    "\010\007\uffe3\010\uffe3\011\uffe3\001\002\000\010\007\uffe4" +
    "\010\uffe4\011\uffe4\001\002\000\010\007\uffe5\010\uffe5\011" +
    "\uffe5\001\002\000\010\007\041\010\034\011\037\001\002" +
    "\000\010\007\uffe6\010\uffe6\011\uffe6\001\002\000\010\007" +
    "\uffe7\010\uffe7\011\uffe7\001\002\000\010\007\uffe8\010\uffe8" +
    "\011\uffe8\001\002\000\010\021\uffed\022\uffed\024\uffed\001" +
    "\002\000\006\002\ufffe\004\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\054\000\014\002\006\006\010\007\007\010\003\011" +
    "\005\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\003\025\012\024\001\001\000\004\014\017\001\001\000" +
    "\002\001\001\000\012\002\006\007\012\010\003\011\005" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\014\022\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\004\032" +
    "\013\031\001\001\000\004\005\026\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\015\034\016\037\021\035\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\020\050\001\001\000\002" +
    "\001\001\000\004\017\041\001\001\000\002\001\001\000" +
    "\010\015\044\016\037\021\035\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\016\054\021\035" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

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

	public static String table_name = "";
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
          case 6: // select_s ::= select_part from_part 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("select_s",6, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // select_s ::= select_part from_part where_part 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("select_s",6, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // select_part ::= _select _STAR 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("select_part",7, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // select_part ::= _select cols 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("select_part",7, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // _select ::= SELECT 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_select",0, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // cols ::= IDENTIFIER _COMMA cols 
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
          case 12: // cols ::= IDENTIFIER 
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
          case 13: // from_part ::= _from table_name 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("from_part",8, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // _from ::= FROM 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_from",1, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // table_name ::= IDENTIFIER 
            {
              Object RESULT =null;
		int tableft = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()).left;
		int tabright = ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()).right;
		Object tab = (Object)((java_cup.runtime.Symbol) CUP$Cup_Rules_SQL$stack.peek()).value;
		  table_name = tab+""; 
              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("table_name",3, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // where_part ::= _where w_condition 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("where_part",9, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-1)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // _where ::= WHERE 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("_where",2, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // w_condition ::= cond log_oper w_condition 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("w_condition",11, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // w_condition ::= cond 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("w_condition",11, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // cond ::= element ari_oper cond 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("cond",12, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.elementAt(CUP$Cup_Rules_SQL$top-2)), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // cond ::= element 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("cond",12, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // element ::= IDENTIFIER 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("element",15, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // element ::= INTEGER 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("element",15, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // element ::= REAL 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("element",15, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // ari_oper ::= _EQU 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("ari_oper",14, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // ari_oper ::= _GT 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("ari_oper",14, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // ari_oper ::= _LT 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("ari_oper",14, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // ari_oper ::= _LET 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("ari_oper",14, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // ari_oper ::= _GET 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("ari_oper",14, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // ari_oper ::= _DIFF 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("ari_oper",14, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // log_oper ::= _AND 
            {
              Object RESULT =null;

              CUP$Cup_Rules_SQL$result = parser.getSymbolFactory().newSymbol("log_oper",13, ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$Cup_Rules_SQL$stack.peek()), RESULT);
            }
          return CUP$Cup_Rules_SQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // log_oper ::= _OR 
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
