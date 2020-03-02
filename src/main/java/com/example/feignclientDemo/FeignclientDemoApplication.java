package com.example.feignclientDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignclientDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(FeignclientDemoApplication.class, args);
	}

}
