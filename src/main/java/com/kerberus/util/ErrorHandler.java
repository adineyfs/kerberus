package com.kerberus.util;

public class ErrorHandler {
	
	private LogFileUtil logFile = LogFileUtil.getInstance();
	
	private static ErrorHandler errorHandlerInstance = null;
	
	protected ErrorHandler() {
		
	}
	
	public void throwError(String error) {
		try {
			logFile.CreateLogErrorFile();
			logFile.writeLine(error);
			logFile.close();
		} catch (Exception e) {
			System.out.println("Error creating error log file, verify the path on the system.");
		}
	}
	
	public static ErrorHandler getInstance() {
	    if(errorHandlerInstance == null) {
	    	errorHandlerInstance = new ErrorHandler();
	    }
	    return errorHandlerInstance;
	}
}
