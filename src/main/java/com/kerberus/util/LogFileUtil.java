package com.kerberus.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogFileUtil {
	
	  private BufferedWriter writer;
	  private File file;
	  public static final String logFilePath = "T:\\Kerberus\\";

	  public LogFileUtil() throws Exception {
		  String hostname = getHostName();
		  
		  LocalDateTime date = LocalDateTime.now();
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		  String dateText = date.format(formatter);
		  
		  String fileName = logFilePath + hostname + "-" + dateText + ".txt";
		  this.file = new File(fileName);
		  if (writer == null) {
			  writer = new BufferedWriter(new FileWriter(file, true));
		  }
	  }

	  
	  public static String getHostName() throws Exception {
		  String hostname;
	      InetAddress addr;
	      addr = InetAddress.getLocalHost();
	      hostname = addr.getHostName();
	      return hostname;
	  }

	  public void writeLine(String line) throws Exception {
		  try {
		      this.writer.write(line);
		      this.writer.newLine();
		      this.writer.flush();
		  } catch(IOException IOE){
		      throw new IOException("Error writing to the file");
		  }
	  }

	  public void close() throws IOException {
		  try {
			  this.writer.close();
		  } catch(IOException IOE){
			  throw new IOException("Error closing to the file");
		  }
	  }
}
