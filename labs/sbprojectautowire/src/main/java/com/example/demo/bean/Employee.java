package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	
	@Autowired
	Dept  dept;
	
	Employee(){
		System.out.println("This is emp default const");
	}
	
	public void display() {
		dept.deptShow();
	}
       
}
