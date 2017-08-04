package com.AlphaTrooperY.AdvEngBio.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.AlphaTrooperY.AdvEngBio.Refrence;

public class Utils {

	private static Logger logger;
	public static Logger getLogger() {
		if(logger == null) {
			logger = LogManager.getFormatterLogger(Refrence.MOD_ID);
		}
		return logger;
	}
}
