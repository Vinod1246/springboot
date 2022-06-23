package com.example.demo.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Scope("singleton")
@Scope("prototype")
@Component
public class Employee {
	
	private String empId="1001";

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		System.out.println("setter called");
		this.empId = empId;
	}

	public Employee(String empId) {
		System.out.println("para const called");
	
		this.empId = empId;
	}

	public Employee() {
		System.out.println("default const called");
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + "]";
	}
	
	
	

}
