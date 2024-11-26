package com.civilink.civilink_eureka_server_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CivilinkEurekaServerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CivilinkEurekaServerApiApplication.class, args);
	}

}
