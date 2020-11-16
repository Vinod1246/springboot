package com.example.springstarterproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Autowired
	private Department dept;
	
	public Employee() {
		System.out.println("This is emp constructor");
	}
	
	public void display() {
		dept.deptShow();
	}

}
