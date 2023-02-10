package com.quest.Price;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class PriceManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriceManagementApplication.class, args);
		System.out.println("Connection successful!");
	}

}
