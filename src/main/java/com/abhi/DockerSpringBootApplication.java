package com.abhi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringBootApplication {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/v1/test",method = RequestMethod.GET)
	public String dockerTesting() {
		logger.info("Testing logger in spring boot docker application.");
		return "Hello world";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootApplication.class, args);
	}

}
