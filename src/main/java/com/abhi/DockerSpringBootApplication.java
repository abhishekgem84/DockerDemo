package com.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringBootApplication {
	
	@RequestMapping(value="/v1/test",method = RequestMethod.GET)
	public String dockerTesting() {
		return "Hello world";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootApplication.class, args);
	}

}
