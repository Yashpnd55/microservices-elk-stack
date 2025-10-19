package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@Slf4j
public class Proj6ConsumerMsFeignClientApplication {

	public static void main(String[] args) {
		log.debug("start of main(-) method");
		SpringApplication.run(Proj6ConsumerMsFeignClientApplication.class, args);
		log.debug("end of main(-) method");
	}

}
