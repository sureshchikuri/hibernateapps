package com.vcs.struts.util;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogHelper {

	private static Logger logger;
	
	static{
		
		DOMConfigurator.configure(LogHelper.class.getClassLoader().getResource("log4j.xml"));
	}
	
	public static Logger getLogger(Class clazz){
		
		Logger logger=Logger.getLogger(clazz);
		return logger;
	}
	
}
