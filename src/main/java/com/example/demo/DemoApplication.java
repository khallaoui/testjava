package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Computer pc=ComputerFactory.getComputer(new PCFactory("2gb", "500gb", "2.4GHZ"));
		Computer server=ComputerFactory.getComputer(new ServerFactory("16gb", "2tb", "2.9ghz"));
		System.out.println("Factory pc config :"+pc);
		System.out.println("Factory Server Config :"+server);
		SpringApplication.run(DemoApplication.class, args);
	}

}
