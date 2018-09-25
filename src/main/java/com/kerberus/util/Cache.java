package com.kerberus.util;

public class Cache {
	
	public final int ORACLE_DATABASE = 0;
	public final int SQL_SERVER_DATABASE = 1;
	
	private static Cache cacheInstance = null;
	
	private String SQLStatement = null;
	private int databaseOption = 0;
	
	protected Cache() {
		
	}
	
	public static Cache getInstance() {
		if (cacheInstance == null) {
			cacheInstance = new Cache();
		}
		return cacheInstance;
	}

	public int getDatabaseOption() {
		return databaseOption;
	}

	public void setDatabaseOption(int databaseOption) {
		this.databaseOption = databaseOption;
	}

	public String getSQLStatement() {
		return SQLStatement;
	}

	public void setSQLStatement(String sQLStatement) {
		SQLStatement = sQLStatement;
	}

}
