package com.reportes.reportes_api_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.reportes")
public class ReportesApiSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReportesApiSpringBootApplication.class, args);
	}

}
