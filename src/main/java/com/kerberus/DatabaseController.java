package com.kerberus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


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
    
    public static void runSQLStatement() {
		try {
			System.out.println(DatabaseController.testDriver());
			System.out.println(DatabaseController.getConnection());
	        Connection connection = DatabaseController.getConnection();
	        //Statement statement = connection.createStatement();
	        String sqlCommand = "Select * from abc_class"; //
	        String sqlCommand1 = "Select * from abc_class"; //
	        PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);
	
	        //ResultSet rset = statement.executeQuery(sqlCommand);
	        ResultSet rset = preparedStatement.executeQuery();
	        
	        while (rset.next()) {
	            String coffeeName = rset.getString("ABC_CLASS");
	            //int supplierID = rset.getInt("DAYS_SUPPLY");
	            System.out.println(coffeeName);
	        }
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
