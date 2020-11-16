package com.example.springstarterproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringStarterProjectApplication {
	public static void main(String[] args) {
		// SpringApplication.run(SpringStarterProjectApplication.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(SpringStarterProjectApplication.class, args);
		// Employee obj=context.getBean(Employee.class);//Client Request
		// System.out.println(obj);
		// Employee obj1=context.getBean(Employee.class);//Client Request
		// obj.display();

	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
