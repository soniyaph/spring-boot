package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@RequestMapping("/message")
	public String getMessage(){
		return "Hello from Docker";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
