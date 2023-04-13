package com.example.flipkart.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableWebMvc
public class SwaggerConfiguration implements WebMvcConfigurer {
	public static final Contact DEFAULT_CONTACT = new Contact(
			"API POTHI", 
			"https://www.youtube.com/apipothi",
			"infoapipothi@gmail.com"
			);

	

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2);
	}
}
