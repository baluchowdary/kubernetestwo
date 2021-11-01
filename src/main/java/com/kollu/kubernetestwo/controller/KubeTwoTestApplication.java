package com.kollu.kubernetestwo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubeTwoTestApplication {

	@Autowired
	private Environment env;
	
	private Logger logger = LoggerFactory.getLogger(KubeTwoTestApplication.class);
	
	@GetMapping("/kollutwoid")
	public String getTwoIdValues() throws UnknownHostException { 
		logger.info("KubeTwoTestApplication -----getTwoIdValues method");
		String port = env.getProperty("local.server.port");
		String kubeHost = env.getProperty("HOSTNAME");
		
		String host = InetAddress.getLocalHost().getHostAddress();
		
		String testName = "I am from KubeTwoTestApplication Module2 "+port +"===HOSTNAME:::"+host+"========kubeHost :::"+kubeHost;
		System.out.println("Console::: I am from KubeTwoTestApplication2 :: PORT::"+port +"HOSTNAME:::"+host+"======kubeHost:::"+kubeHost);
		logger.info("I am from KubeTwoTestApplication2 :: PORT::"+port +"===HOSTNAME:::"+host+"========kubeHost::::"+kubeHost); 
		return testName;
	}
	
	
	
}
