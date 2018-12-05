package com.kerberus;

import java.io.BufferedReader;
import java.io.StringReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

import com.kerberus.model.syntaxValidator.rules.sql.Cup_Rules_SQL;
import com.kerberus.model.syntaxValidator.rules.sql.JFlex_Rules_SQL;


public class DatabaseController {
    // These connection setting will work on the lab computers
    // If you use a different database, feel free to change these settings!
    private static final String DB_URL     = "jdbc:oracle:thin:@orarac-scan-grid.tecsys.corp:1521/CEORA12C";
    private static final String DB_USER    = "cc1_941sandbox_d";
    private static final String DB_PW      = "tecsys ";
    
    public static boolean testDriver()
    {
        // TODO 1 - Link the driver to the project
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");            
		} 
        catch (ClassNotFoundException e) 
        {
            // Display an error message on the GUI if the driver is not loaded
            System.out.println("Missing Oracle JDBC Driver?");
            return false;
		}
    
       System.out.println("JDBC Driver Loaded!");
        return true;
    }
    
    public static Connection getConnection()
    {
        try
        {
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PW);
        }
        catch(SQLException e)
        {
            System.out.println("Invalid Database Connection parameters!");
            return null;
        }
    }
    
    public static void runSQLStatement(String sqlCommand_prm) {
		try {
			System.out.println(DatabaseController.testDriver());
			System.out.println(DatabaseController.getConnection());
	        Connection connection = DatabaseController.getConnection();
	        //Statement statement = connection.createStatement();
	        //String sqlCommand = "Select * from abc_class"; 
	        
	        String tempSQL = "";
	        
	        for (String sqlCommandArray: sqlCommand_prm.split("-")) {
	            tempSQL = sqlCommandArray.replace(";", "");
	            
	            PreparedStatement preparedStatement = connection.prepareStatement(tempSQL);
	            
		        //ResultSet rset = statement.executeQuery(sqlCommand);
		        ResultSet rset = preparedStatement.executeQuery();
		        
		        //For debugging purposes
		        while (rset.next()) {
		            String coffeeName = rset.getString("ABC_CLASS");
		            //int supplierID = rset.getInt("DAYS_SUPPLY");
		            System.out.println(coffeeName);
		        }
		        
	         }
			}
	        catch(SQLException e) {
	        	System.out.print("FAILED22");
	        }
    }
    
    public static String getTables(String sqlStatement_prm) {
    	//String to return
    	String tableExistence = "";
    	try {
    		System.out.println("^^^^^^^^^^^^^" + sqlStatement_prm);
    		JFlex_Rules_SQL Lex_Analyzer = new JFlex_Rules_SQL( new BufferedReader( new StringReader(sqlStatement_prm) ) ); 
    		Cup_Rules_SQL Syntax_Analyzer1 = new Cup_Rules_SQL(Lex_Analyzer);
    		
	    	Connection connection = DatabaseController.getConnection();
	    	String[] TABLEtype = {"TABLE"};
	    	DatabaseMetaData md = connection.getMetaData();
	    	ResultSet rs = md.getTables(null, "CC1_941SANDBOX_D", "%", TABLEtype);
	    	
	    	//Storing all table names in the database into variable
	    	String tableNames = "";
	    	
	    	while (rs.next()) {
	    		tableNames += rs.getString(3) + " ";
	    		System.out.println(rs.getString(3));
	    		//getColumns(rs.getString(3));
	    	}
	    	
	    	String[] tableNamesArray = tableNames.split(" ");
			// This cleans the list of syntax errors (it might have errors from the previous run).			
			Syntax_Analyzer1.clean_lists();
			
			// Run Syntax Analyzer
			Syntax_Analyzer1.parse();
			
	    	  //Traversing tables from the user SQL statement inputs  
	    	  Iterator<String> itr=Syntax_Analyzer1.Tables.iterator();  
	    	  System.out.println("&&&&&&&" + Syntax_Analyzer1.Tables);
	    	  
	    	  String userInput = Syntax_Analyzer1.Tables.toString();
	    	  
    		  userInput = userInput.replace('[',' ');
    		  userInput = userInput.replace(']',' ');
    		  String[] userInputArray = userInput.split(",");
    		  
	    	  for(int i = 0; i<Syntax_Analyzer1.Tables.size(); i++) {
	    		  Boolean tableFound = false;
	    		  System.out.println(userInputArray[i]);
	    		  for(int o = 0; o<tableNamesArray.length; o++) {
	        		  System.out.println(tableNamesArray[o] + "+++++++++++");
	        		  System.out.println(userInputArray[i] + "@@@@@@@@@@@");
		    		  if(tableNamesArray[o].equalsIgnoreCase(userInputArray[i].trim())) {
		    			  System.out.println(userInputArray[o] + "----------");
			    		  tableExistence += userInputArray[i];
			    		  tableExistence += " = ";
			    		  tableExistence += Boolean.toString(tableNamesArray[o].equalsIgnoreCase(userInputArray[i].trim()));
			    		  tableExistence += " \n ";
			    		  tableFound = true;
		    		  }
	    		  }
	    		  if(!tableFound) {
		    		  tableExistence +=userInputArray[i];
		    		  tableExistence += " = false \n ";
		    		  System.out.println("Hellllllllllo");
	    		  }
	    		  tableFound = false;
	    	  }
/*
	    	  while(itr.hasNext()){
	    		  System.out.println("hhhhh");
	    		  CharSequence cs1 = " " + itr.next() + " ";
	    		  
	    		  boolean retval1 = tableNames.contains(cs1);
	    		  
	    		  tableExistence.concat( itr.next());
	    		  tableExistence.concat(" = ");
	    		  tableExistence.concat(Boolean. toString(retval1));
	    		  tableExistence.concat(" * ");
	    		  //System.out.println(itr.next());
	    		  
	    	  }  
	    	*/
	      	System.out.println(tableExistence + "////////////////");
	    	return tableExistence;
    	}
        catch(Exception ee) {
        	ee.printStackTrace();
        	return "";
        }
    }
    public static String getColumnsOutput(String sqlStatement_prm) {
    	//String to return
    	String colExistence = "";
    	try {
    		System.out.println("^^^^^^^^^^^^^" + sqlStatement_prm);
    		JFlex_Rules_SQL Lex_Analyzer = new JFlex_Rules_SQL( new BufferedReader( new StringReader(sqlStatement_prm) ) ); 
    		Cup_Rules_SQL Syntax_Analyzer1 = new Cup_Rules_SQL(Lex_Analyzer);
    		
	    	Connection connection = DatabaseController.getConnection();
	    	String[] TABLEtype = {"TABLE"};
	    	DatabaseMetaData md = connection.getMetaData();
	    	
	    	ResultSet rsTable = md.getTables(null, "CC1_941SANDBOX_D", "%", TABLEtype);
	    	
	    	//Storing all table names in the database into variable
	    	String tableNames = "";
	    	
	    	while (rsTable.next()) {
	    		tableNames += rsTable.getString(3) + " ";
	    		System.out.println(rsTable.getString(3));
	    		//getColumns(rs.getString(3));
	    	}
	    	
	    	String[] tableNamesArray = tableNames.split(" ");
	    	
	    	
	    	//Each element contains a single SQL statement
	    	String[] userInputSqlStatementArray = sqlStatement_prm.split(";");
	    	
			// This cleans the list of syntax errors (it might have errors from the previous run).			
			Syntax_Analyzer1.clean_lists();
			
			// Run Syntax Analyzer
			Syntax_Analyzer1.parse();
			
			//Formatting [ x, y, z] user columns
			String userInputColumns = Syntax_Analyzer1.Columns.toString();
			userInputColumns = userInputColumns.replace('[',' ');
			userInputColumns = userInputColumns.replace(']',' ');
	  		String[] userColunmsArray = userInputColumns.split(",");
	  		
	  		//Temporary storage of column associated to a table
	  		String[] userColumnToTableArray = new String[2000];
	  		int columnToTableArrayIndex = 0;
			
	  		 // 2 first loops determines which column belongs to which table
	  		 // final inner loop looks if col exist in the table
	  		
	  		 //Looping 1 user sql statement at a time
	    	for(int x = 0; x < userInputSqlStatementArray.length; x++) {
	    		System.out.println("$$x = " + x);
	    		//Looping formatted userColumnsArray SyntaxAnalyser cols
	    		for(int y = 0; y < userColunmsArray.length; y++) {
	    			CharSequence charColumn = userColunmsArray[y].trim();
	    			if(userInputSqlStatementArray[x].contains(charColumn)) {
	    				userColumnToTableArray[columnToTableArrayIndex] = userColunmsArray[y];
	    				System.out.println("Confirmed" + columnToTableArrayIndex);
	    				columnToTableArrayIndex++;
	    			}
	    		}
	    		
	    		System.out.println("TECSYS");
	    		//Db tables
	    		  for(int z = 0; z<tableNamesArray.length; z++) {
	    			  CharSequence charTable = tableNamesArray[z];
	    			  
	    			  //check which table is in the user Input Sql statement
	    			  if(userInputSqlStatementArray[x].contains(charTable)) {
	    				  
	    				  //Retrieve all database columns from the table that matched
	    				  ResultSet rsColumn = md.getColumns(null, "CC1_941SANDBOX_D", tableNamesArray[z].trim().toUpperCase(), "%");
	    			    	//Storing all table names in the database into variable
	    			    	String tempDbColumnToTable = "";

	    			    	while (rsColumn.next()) {
	    			    		tempDbColumnToTable += rsColumn.getString(4) + " ";
	    			    		System.out.println("rsColumn.getString(4) = " + rsColumn.getString(4));
	    			    		
	    				    	  //System.out.println("table: " + tableName_prm + " / column: " + rs.getString(4));
	    				    	 // getColumns(rs.getString(3));
	    				    	}
	    			    	//Db columnToTable in Array
	    			    	String[] dbColumnToTableNameArray = tempDbColumnToTable.split(" ");
	    			    	
	    			    	colExistence += "\nTable: " + tableNamesArray[z].trim().toUpperCase() + " Column: ";
	    			    	
	    			    	Boolean colFound = false;
	    			    	
	    			    	for(int v = 0; v < columnToTableArrayIndex; v++) {
	    			    		System.out.println("v = " + v);
	    			    		for(int w = 0; w < dbColumnToTableNameArray.length; w++) {
		    			    		System.out.println("w = " + w);
		    			    		if(userColumnToTableArray[v].trim().toUpperCase().equalsIgnoreCase(dbColumnToTableNameArray[w].trim().toUpperCase())) {
		    			    			colFound = true;
		    			    			colExistence += userColumnToTableArray[v].trim().toUpperCase() + " = " + colFound + " * ";
		    			    		}
	    			    		}
	    			    		if(!colFound) {
	    			    			colExistence += userColumnToTableArray[v].trim().toUpperCase() + " = " + colFound + " * ";
	    			    		}
	    			    		colFound = false;
	    			    	}
	    			  }
	    		  }
	    		  columnToTableArrayIndex = 0;
	    	}
	    	
	    	/*
	    	ResultSet rsColumn = md.getColumns(null, "CC1_941SANDBOX_D", tableName_prm, "%");
	    	
			// This cleans the list of syntax errors (it might have errors from the previous run).			
			Syntax_Analyzer1.clean_lists();
			
			// Run Syntax Analyzer
			Syntax_Analyzer1.parse();
			
	    	  //Traversing tables from the user SQL statement inputs  
	    	  Iterator<String> itr=Syntax_Analyzer1.Tables.iterator();  
	    	  System.out.println("&&&&&&&" + Syntax_Analyzer1.Tables);
	    	  
	    	  String userInput = Syntax_Analyzer1.Tables.toString();
	    	  
    		  userInput = userInput.replace('[',' ');
    		  userInput = userInput.replace(']',' ');
    		  String[] userInputArray = userInput.split(",");
    		  
	    	  for(int i = 0; i<Syntax_Analyzer1.Tables.size(); i++) {
	    		  Boolean tableFound = false;
	    		  System.out.println(userInputArray[i]);
	    		  for(int o = 0; o<tableNamesArray.length; o++) {
	        		  System.out.println(tableNamesArray[o] + "+++++++++++");
	        		  System.out.println(userInputArray[i] + "@@@@@@@@@@@");
		    		  if(tableNamesArray[o].equalsIgnoreCase(userInputArray[i].trim())) {
		    			  System.out.println(userInputArray[o] + "----------");
			    		  tableExistence += userInputArray[i];
			    		  tableExistence += " = ";
			    		  tableExistence += Boolean.toString(tableNamesArray[o].equalsIgnoreCase(userInputArray[i].trim()));
			    		  tableExistence += " * ";
			    		  tableFound = true;
		    		  }
	    		  }
	    		  if(!tableFound) {
		    		  tableExistence +=userInputArray[i];
		    		  tableExistence += " = false * ";
		    		  System.out.println("Hellllllllllo");
	    		  }
	    		  tableFound = false;
	    	  }
	    	  */
/*
	    	  while(itr.hasNext()){
	    		  System.out.println("hhhhh");
	    		  CharSequence cs1 = " " + itr.next() + " ";
	    		  
	    		  boolean retval1 = tableNames.contains(cs1);
	    		  
	    		  tableExistence.concat( itr.next());
	    		  tableExistence.concat(" = ");
	    		  tableExistence.concat(Boolean. toString(retval1));
	    		  tableExistence.concat(" * ");
	    		  //System.out.println(itr.next());
	    		  
	    	  }  
	    	*/
	    	  /*
	      	System.out.println(tableExistence + "////////////////");
	      	*/
	    	return colExistence;
	    	
    	}
    	
        catch(Exception ee) {
        	ee.printStackTrace();
        	return "";
        }
    	
    }
    
    public static void getColumns(String tableName_prm) {
    	try {
	    	Connection connection = DatabaseController.getConnection();
	    	
	    	
	    	DatabaseMetaData md = connection.getMetaData();
	    	ResultSet rs = md.getColumns(null, "CC1_941SANDBOX_D", tableName_prm, "%");
	    	while (rs.next()) {
	    	  System.out.println("table: " + tableName_prm + " / column: " + rs.getString(4));
	    	 // getColumns(rs.getString(3));
	    	}
	    	
	    	/*
	    	Statement statement = connection.createStatement();
	    	
	    	ResultSet results = statement.executeQuery("SELECT * FROM " + tableName_prm);

	    	// Get resultset metadata
	    	ResultSetMetaData metadata = results.getMetaData();
	    	int columnCount = metadata.getColumnCount();
	    	//System.out.println("test_table columns : ");
	    	// Get the column names; column indices start from 1
	    	for (int i=1; i<=columnCount; i++) {
	    	  String columnName = metadata.getColumnName(i);
	    	  //System.out.println("table: " + tableName_prm + " / column: " + columnName);
	    	}
	    	*/
    	}
        catch(SQLException e) {
        	System.out.print("FAILED");
        }
    	
    }
    
    /*
    public static ArrayList<ProductCategory> getCategories() throws SQLException
    {
        ArrayList<ProductCategory> categoryList = new ArrayList<>();
        
        // TODO 2 - Read all category names and ids from database
        //          and return the list of categories

        return categoryList;
    }
    
    public static ArrayList<Product> getProducts() throws SQLException
    {
        ArrayList<Product> productList = new ArrayList<Product>();
        
        // TODO 3 - 1- Read all product from database using a prepared statement
        //          2- From the resultset, instanciate products, add in the array
                
        return productList;
    }

    public static void insertProduct(Product produdct) throws SQLException
    {
        // TODO 4 - Run a prepared statement to Insert the product in the database
    }
    
    public static void updateProduct(Product product) throws SQLException
    {
        // TODO 5 - Run a prepared statement to Update the product in the database
    }
    
    public static void deleteProduct(int productId) throws SQLException
    {
        // TODO 6 - Run a prepared statement to Delete the product in the database
    }
    */
}
