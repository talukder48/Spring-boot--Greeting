package com.Neptune;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
@ComponentScan({ "com.Neptune.Controller"})
public class NeptuneApplication {
	private static final Logger LOGGER = LogManager.getLogger(NeptuneApplication.class);
	public static void main(String[] args) {
		
		SpringApplication.run(NeptuneApplication.class, args);
		System.out.println("NeptuneApplication");
		LOGGER.debug("Info level log message");
	}
	
	
}
