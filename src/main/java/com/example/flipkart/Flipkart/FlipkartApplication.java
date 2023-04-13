package com.example.flipkart.Flipkart;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableFeignClients("com.example.flipkart")
@EnableDiscoveryClient
@ComponentScan("com.example.flipkart")
@EntityScan("com.example.flipkart")
@EnableJpaRepositories("com.example.flipkart")
public class FlipkartApplication {
	
	private final static Logger logger=LoggerFactory.getLogger(FlipkartApplication.class);

	public static void main(String[] args) {
		logger.info("***FlipkartApplication-START");
		SpringApplication.run(FlipkartApplication.class, args);
		logger.info("***FlipkartApplication-END");
	}

}
