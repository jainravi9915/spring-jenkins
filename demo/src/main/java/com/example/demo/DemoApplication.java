package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class DemoApplication {


//	public static Logger logger= LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		System.out.println("App Started !!");
		SpringApplication.run(DemoApplication.class, args);
	}

}
