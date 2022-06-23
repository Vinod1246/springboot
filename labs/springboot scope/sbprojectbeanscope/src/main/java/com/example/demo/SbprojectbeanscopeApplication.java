package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.bean.Employee;

@SpringBootApplication
public class SbprojectbeanscopeApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=SpringApplication.run(SbprojectbeanscopeApplication.class, args); //server started
		
		Employee   obj = ctx.getBean(Employee.class);//client request
		System.out.println(obj);
		
	    Employee   obj1 = ctx.getBean(Employee.class);//client request
		System.out.println(obj1);
		
	    Employee   obj2 = ctx.getBean(Employee.class);//client request
		System.out.println(obj2);
		
	/*	System.out.println("All"+"/"+obj.hashCode()+"/"+obj1.hashCode()+"/"+obj2.hashCode());
		System.out.println("All"+"/"+obj.getEmpId()+"/"+obj1.getEmpId()+"/"+obj2.getEmpId());*/
	
	}

}
