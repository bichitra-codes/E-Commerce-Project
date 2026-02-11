package com.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		
		return new WebMvcConfigurer() {
			
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")       // Allow all URL in backend / All REST API Allow
				.allowedOrigins("http://localhost:4200")  // Allow only Angular app to acess backend
				.allowedMethods("GET" , "POST","PUT","DELETE","OPTIONS")
			    .allowedHeaders("*")        // browser can send any request headers.
		         .allowCredentials(true);   // Allow cookies/ tokens to travel
			}
		};
	}

}
