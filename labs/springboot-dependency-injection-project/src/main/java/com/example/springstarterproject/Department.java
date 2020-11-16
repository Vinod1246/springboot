package com.example.springstarterproject;

import org.springframework.stereotype.Component;

@Component
public class Department {
	
	public Department() {
		System.out.println("This is emp constructor");
	}
	
	public void deptShow() {
		System.out.println("Dept Show");
	}
	
}
