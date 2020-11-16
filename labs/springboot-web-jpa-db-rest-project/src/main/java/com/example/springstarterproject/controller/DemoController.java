package com.example.springstarterproject.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.springstarterproject.Employee;
import com.example.springstarterproject.dao.EmpDAO;
import com.example.springstarterproject.service.UserService;

@RestController
@RequestMapping("/employees11")
public class DemoController {

	@Autowired
	UserService userservice;
	
	
	@GetMapping(path="/allemp")
    public List<Employee> getEmployees() 
    {
        return userservice.getAllEmployees();
    }

	
	@PostMapping(value = "/signup22")
	public Employee reg(@RequestBody Employee emp) {
		userservice.createEmployee(emp);
		return emp;
	}


	@GetMapping(value = "/selectEmp11/{empId}")
	@ResponseBody
	public Employee select(@PathVariable("empId") int empId) {
		Employee emp = userservice.getEmpById(empId);
		System.out.println("select:" + emp);
		return emp;	
	}
	
}

