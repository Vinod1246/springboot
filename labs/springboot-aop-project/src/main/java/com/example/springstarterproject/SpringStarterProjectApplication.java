package com.example.springstarterproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringStarterProjectApplication {
	public static void main(String[] args) {
		//SpringApplication.run(SpringStarterProjectApplication.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringStarterProjectApplication.class, args);
		
		
	}
}
