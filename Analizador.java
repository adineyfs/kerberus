
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150326 (SVN rev 63)
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.*;
import java.io.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20150326 (SVN rev 63) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Analizador extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Analizador() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Analizador(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Analizador(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\004\000\002\002\003\000\002\002\004\000\002\002" +
    "\003\000\002\002\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\006\000\010\004\007\005\006\006\004\001\002\000" +
    "\004\002\ufffe\001\002\000\004\002\010\001\002\000\004" +
    "\002\uffff\001\002\000\004\002\001\001\002\000\004\002" +
    "\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\006\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Analizador$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Analizador$actions(this);
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
    return action_obj.CUP$Analizador$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Analizador$actions {
  private final Analizador parser;

  /** Constructor */
  CUP$Analizador$actions(Analizador parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Analizador$do_action_part00000000(
    int                        CUP$Analizador$act_num,
    java_cup.runtime.lr_parser CUP$Analizador$parser,
    java.util.Stack            CUP$Analizador$stack,
    int                        CUP$Analizador$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Analizador$result;

      /* select the action based on the action number */
      switch (CUP$Analizador$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // statement ::= SELECT 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("statement",0, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= statement EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Analizador$stack.elementAt(CUP$Analizador$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Analizador$stack.elementAt(CUP$Analizador$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Analizador$stack.elementAt(CUP$Analizador$top-1)).value;
		RESULT = start_val;
              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Analizador$stack.elementAt(CUP$Analizador$top-1)), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Analizador$parser.done_parsing();
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // statement ::= UPDATE 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("statement",0, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // statement ::= DELETE 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("statement",0, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Analizador$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Analizador$do_action(
    int                        CUP$Analizador$act_num,
    java_cup.runtime.lr_parser CUP$Analizador$parser,
    java.util.Stack            CUP$Analizador$stack,
    int                        CUP$Analizador$top)
    throws java.lang.Exception
    {
              return CUP$Analizador$do_action_part00000000(
                               CUP$Analizador$act_num,
                               CUP$Analizador$parser,
                               CUP$Analizador$stack,
                               CUP$Analizador$top);
    }
}

}
