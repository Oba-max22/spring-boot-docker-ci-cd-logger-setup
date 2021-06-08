package com.bezkoder.spring.datajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootDataJpaApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaApplication.class, args);

		LOGGER.getName();
		LOGGER.info("Simple log message");
	}

}
