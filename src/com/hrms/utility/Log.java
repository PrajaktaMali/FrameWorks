package com.hrms.utility;

import org.apache.log4j.Logger;

public class Log {
	//INITIALIZE LOG4J LOGS
	 private static Logger Log = Logger.getLogger(Log.class.getName());
	 //need to create these methods, so that they can be called
	 public static void info(String message) {
		Log.info(message);
	 }

}
