package com.kerberus.model.syntaxValidator.rules.util;

import java.util.LinkedList;

public class ColumnEvaluator {
	
	// ToDo: use another object to keep unique columns in the list
	private static LinkedList<String> Columns = new LinkedList<String>();
	private static String table_name;
	

	public ColumnEvaluator() {
		/*Nothing to create here*/
	}
		
	public void addColumn(String new_column){
		Columns.add(new_column);
	}
	
	public void addTable(String new_table){
		table_name = new_table;
	}
	
	public LinkedList<String> getColumns(){
		return Columns;
	}
	
	public String getTable() {
		return table_name;
	}
		
}
