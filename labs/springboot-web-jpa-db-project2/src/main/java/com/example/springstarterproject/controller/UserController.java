package com.example.springstarterproject.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.springstarterproject.Employee;
import com.example.springstarterproject.dao.EmpDAO;
import com.example.springstarterproject.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userservice;

	/*
	 * @RequestMapping(value = "/login", method = RequestMethod.GET) public
	 * ModelAndView loginpage() { ModelAndView obj = new ModelAndView("LoginPage");
	 * return obj; }
	 * 
	 * @RequestMapping(value = "/login1", method = RequestMethod.POST) public String
	 * logincheck(HttpServletRequest request) {
	 * 
	 * String uid = request.getParameter("userId"); String pass =
	 * request.getParameter("pass");
	 * 
	 * UserService ls = new UserService(); boolean b = ls.loginCheck(uid, pass);
	 * 
	 * if (b) { return "loginsuccess"; } return "failure"; }
	 */

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView signuppage() {
		ModelAndView obj = new ModelAndView("SignupPage");
		return obj;
	}

	@RequestMapping(value = "/signup1", method = RequestMethod.POST)
	public ModelAndView reg(Employee emp) {
		ModelAndView obj = new ModelAndView("signupsuccess");
		obj.addObject("obj", emp);
		System.out.println(emp);
		userservice.createEmployee(emp);
		return obj;
	}

	@RequestMapping(value = "/selectEmp", method = RequestMethod.GET)
	public ModelAndView select(@RequestParam int empId) {

		ModelAndView obj = new ModelAndView("viewemp");
		Employee emp = userservice.getEmpById(empId);
		System.out.println("select:" + emp);
		obj.addObject("obj", emp);
		return obj;

	}
	
	@RequestMapping(value = "/selectAllEmp")
	@ResponseBody
	public String selectAll() {
		return userservice.getAllEmployees().toString();
	}

}

