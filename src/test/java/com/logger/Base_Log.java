package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Base_Log {
	
	static Logger log=Logger.getLogger(Base_Log.class);
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		log.debug("Debug");
		log.info("Information");
		log.warn("Warning");
		log.error("Error");
		log.fatal("Fatal");
	}
	

}
