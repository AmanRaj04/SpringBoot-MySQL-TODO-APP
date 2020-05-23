package io.amanproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class TodoApplication implements WebMvcConfigurer{

	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
		//registry.addViewController("/addReview").setViewName("review");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	
}
