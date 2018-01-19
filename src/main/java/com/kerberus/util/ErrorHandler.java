package com.kerberus.util;

import java.io.IOException;

public class ErrorHandler {
	
	private static ErrorHandler errorHandlerInstance = null;
	
	protected ErrorHandler() {
		
	}
	
	public static ErrorHandler getInstance() {
	    if(errorHandlerInstance == null) {
	    	errorHandlerInstance = new ErrorHandler();
	    }
	    return errorHandlerInstance;
	}
}
