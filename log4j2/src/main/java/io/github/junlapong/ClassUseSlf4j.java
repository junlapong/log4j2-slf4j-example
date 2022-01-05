package io.github.junlapong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassUseSlf4j {
	private static Logger logger = LoggerFactory.getLogger(ClassUseSlf4j.class);

	public static void printLog() {
		logger.trace("trace message");
		logger.debug("debug message");
		logger.info("Hello from SLF4J");
		logger.warn("warn message");
		logger.error("error message");
	}
}
