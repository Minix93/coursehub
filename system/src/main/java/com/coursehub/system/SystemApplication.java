package com.coursehub.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class SystemApplication {

	private static final Logger LOG = LoggerFactory.getLogger(SystemApplication.class);

	public static void main(String[] args) {

		//SpringApplication.run(EurekaApplication.class, args);

		SpringApplication app = new SpringApplication(SystemApplication.class);
		ConfigurableEnvironment env = app.run(args).getEnvironment();
		LOG.info("Successfully started!!");
		LOG.info("system address: \thttp://127.0.0.1:{}", env.getProperty("server.port"));

	}

}
