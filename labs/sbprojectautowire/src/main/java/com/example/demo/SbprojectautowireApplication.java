package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.bean.Employee;

@SpringBootApplication
public class SbprojectautowireApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(SbprojectautowireApplication.class, args);
		
		Employee   obj = ctx.getBean(Employee.class);
		
		obj.display();
	}

}
