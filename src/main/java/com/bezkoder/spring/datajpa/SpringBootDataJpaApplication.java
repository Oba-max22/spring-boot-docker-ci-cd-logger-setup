package com.bezkoder.spring.datajpa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	private static final Logger LOGGER = LogManager.getLogger(SpringBootDataJpaApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaApplication.class, args);

		LOGGER.getName();
		LOGGER.info("Simple log message");
	}

}
