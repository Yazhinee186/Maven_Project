package com.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Log {
	
	static Logger log=Logger.getLogger(Property_Log.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.debug("Debug");
		log.info("Information");
		log.warn("Warning");
		log.error("Error");
		log.fatal("Fatal");
	}

}
