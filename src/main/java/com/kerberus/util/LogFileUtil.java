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
	public static final String logFilePath = "T:\\Kerberus\\";
	public static final String errorLogFilePath = "T:\\Kerberus\\Error\\error_";

	protected LogFileUtil() {

	}

	public void CreateLogFile() throws Exception {
		String fileName = this.getFileName(logFilePath);
		this.file = new File(fileName);
		writer = new BufferedWriter(new FileWriter(file, true));
	}

	public void CreateLogErrorFile() throws Exception {
		String fileName = this.getFileName(errorLogFilePath);
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
	
	public String getFileName(String path) throws Exception {
		String hostname = this.getHostName();

		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		String dateText = date.format(formatter);
		
		return path + hostname + "-" + dateText + ".txt";
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
