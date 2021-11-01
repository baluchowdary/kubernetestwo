package com.kollu.kubernetestwo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KubernetestwoApplication {

	private static Logger logger = LoggerFactory.getLogger(KubernetestwoApplication.class);
	public static void main(String[] args) {
		System.out.println("Console:: i am from 2KubernetesoneApplication main");
		logger.info("i am from 2KubernetesoneApplication main");
		SpringApplication.run(KubernetestwoApplication.class, args);
	}

}
