package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class Proj6ProducerMsFeignClientApplication {

	public static void main(String[] args) {
		log.debug("start of main(-) method");
		SpringApplication.run(Proj6ProducerMsFeignClientApplication.class, args);
		log.debug("end of main(-) method");
	}

}
