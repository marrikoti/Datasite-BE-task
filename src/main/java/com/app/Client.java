package com.app;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client {

	private static final Logger l = LogManager.getLogger(Client.class);
	private static final String className = "Client.java";
 
  public static void main(String[] args) {          
      
      
      l.debug("This is debug message");
      l.info("This is info message");
      l.warn("This is warn message");
      l.fatal("This is fatal message");
      l.error("This is error message");
      
      System.out.println("Your logic executed successfully....");
      
  }
}

