package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class Dept {
	
	public Dept() {
		System.out.println("Dept default constructor called");
	}
	
	public void deptShow() {
		System.out.println("DeptShow...");
	}
	
}
