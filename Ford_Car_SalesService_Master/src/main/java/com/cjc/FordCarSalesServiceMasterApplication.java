package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FordCarSalesServiceMasterApplication {

	public static void main(String[] args) {
		
		System.out.println(" client master");
		SpringApplication.run(FordCarSalesServiceMasterApplication.class, args);
	}

}
