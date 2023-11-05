package com.vikas.recipefoodorderwebservices.recipemangement.Controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig  implements WebMvcConfigurer{
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// TODO Auto-generated method stub
		registry.addMapping("/**")
        .allowedOrigins("http://localhost:3000") // Replace with your React app's URL
        .allowedMethods("GET", "POST", "PUT", "DELETE");
	}

}
