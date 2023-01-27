package com.estudio.demomarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class DemoMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMarketApplication.class, args);
	}

}
