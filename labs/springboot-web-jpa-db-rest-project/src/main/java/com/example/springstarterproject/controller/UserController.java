package com.example.springstarterproject.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.springstarterproject.Employee;
import com.example.springstarterproject.dao.EmpDAO;
import com.example.springstarterproject.service.UserService;

@RestController
@RequestMapping("/employees")
public class UserController {

	@Autowired
	UserService userservice;

	
	@GetMapping(value = "/signup")
	public ModelAndView signuppage() {
		ModelAndView obj = new ModelAndView("SignupPage");
		return obj;
	}
	
	@GetMapping(value = "/login")
	public ModelAndView loginpage() {
		ModelAndView obj = new ModelAndView("LoginPage");
		return obj;
	}


	@PostMapping(value = "/signup1")
	public ModelAndView reg(Employee emp) {
		ModelAndView obj = new ModelAndView("signupsuccess");
		obj.addObject("obj", emp);
		System.out.println(emp);
		userservice.createEmployee(emp);
		return obj;
	}

	//@GetMapping(value = "/selectEmp")
	@GetMapping(value = "/selectEmp/{empId}")
	public ModelAndView select(@PathVariable("empId") int empId) {
	//public ModelAndView select(@RequestParam int empId) {

		ModelAndView obj = new ModelAndView("viewemp");
		Employee emp = userservice.getEmpById(empId);
		System.out.println("select:" + emp);
		obj.addObject("obj", emp);
		return obj;
	}

}

