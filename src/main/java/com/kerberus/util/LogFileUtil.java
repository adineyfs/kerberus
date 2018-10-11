package com.kerberus.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogFileUtil {

	private static LogFileUtil logFileInstance = null;
	private BufferedWriter writer;
	private File file;
	public static final String logFilePath = "J:\\support\\Kerberus\\";
	public static final String errorLogFilePath = "J:\\support\\Kerberus\\error_";
	public static final String logFileSuccessfullSQLPath = "J:\\support\\Kerberus\\Validated SQL Scripts\\";
	
	private static final int SCRIPT_FILE = 1;
	private static final int LOG_FILE = 2;
	private static final int ERROR_FILE = 3;

	protected LogFileUtil() {

	}

	public void CreateLogFile() throws Exception {
		String fileName = this.getFileName(logFilePath, 2);
		this.file = new File(fileName);
		writer = new BufferedWriter(new FileWriter(file, true));
	}

	public void CreateLogErrorFile() throws Exception {
		String fileName = this.getFileName(errorLogFilePath, 3);
		this.file = new File(fileName);
		writer = new BufferedWriter(new FileWriter(file, true));
	}
	
	public void CreateSuccessfullSQLFile() throws Exception {
		String fileName = this.getFileName(logFileSuccessfullSQLPath, 1);
		this.file = new File(fileName);
		writer = new BufferedWriter(new FileWriter(file, true));
	}

	public String getHostName() throws Exception {
		String hostname;
		InetAddress addr;
		addr = InetAddress.getLocalHost();
		hostname = addr.getHostName();
		return hostname;
	}
	
	public String getFileName(String path, int fileType) throws Exception {
		String hostname = this.getHostName();

		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		String dateText = date.format(formatter);
		
		if (fileType == SCRIPT_FILE) {
			return path + hostname + "_" + "script_" + dateText + ".txt";
		} else if (fileType == LOG_FILE) {
			return path + hostname + "_" + "log_" + dateText + ".txt";
		} else {
			return path + hostname + "_" + "error_" + dateText + ".txt";	
		}
		
	}

	public void writeLine(String line) throws Exception {
		try {
			this.writer.write(line);
			this.writer.newLine();
			this.writer.flush();
		} catch (IOException IOE) {
			throw new IOException("Error writing to the file");
		}
	}
	
	public void writeSuccessfullSQLLog(String sqlStatement) throws Exception {
		Cache cache = Cache.getInstance();
		try {
			if(cache.getDatabaseOption() == cache.ORACLE_DATABASE) {
				this.writeOracleTransactionFile(sqlStatement);
			} else if(cache.getDatabaseOption() == cache.SQL_SERVER_DATABASE) {
				this.writeSQLServerTransactionFile(sqlStatement);
			}
		} catch (IOException IOE) {
			throw new IOException("Error writing to the file");
		}
	}
	
	public void writeSQLServerTransactionFile(String sqlStatement) throws IOException {
		this.writer.write("BEGIN TRANSACTION;");
		this.writer.newLine();
		this.writer.write(sqlStatement);
		this.writer.newLine();
		this.writer.flush();
	}
	
	public void writeOracleTransactionFile(String sqlStatement) throws IOException {
		this.writer.write("BEGIN");
		this.writer.newLine();
		this.writer.write(sqlStatement);
		this.writer.newLine();
		this.writer.write("END;");
		this.writer.flush();
	}

	public void close() throws IOException {
		try {
			this.writer.close();
		} catch (IOException IOE) {
			throw new IOException("Error closing to the file");
		}
	}

	public static LogFileUtil getInstance() {
		if (logFileInstance == null) {
			logFileInstance = new LogFileUtil();
		}
		return logFileInstance;
	}
}
