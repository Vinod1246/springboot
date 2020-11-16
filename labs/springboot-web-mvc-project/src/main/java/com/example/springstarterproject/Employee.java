package com.example.springstarterproject;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private String empId;
	private String empName;
	private String empEmail;
	
	
	public Employee(String empId, String empName, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		System.out.println("This is emp setter");
		this.empId = empId;
	}

	public Employee() {
		System.out.println("This is emp default constructor");
	}
	
	public void display() {
		System.out.print("This is employee method");
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + "]";
	}



}
