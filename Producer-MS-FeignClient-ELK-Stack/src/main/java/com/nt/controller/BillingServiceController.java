package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/billing/api")
@Slf4j
public class BillingServiceController {
	
	@Value("${server.port}")
	private int port;
	
	@Value("${eureka.instance.instance-id}")
	private String instanceId;
	
	@GetMapping("/info")
	public String getBillingInfo() {
		log.debug("from billing info");
		return "We Accept Card Payments, UPI Payments, Cash Payments:: port:: "+port+" and instanceId:: "+instanceId;
	}

}
