package com.example.springstarterproject;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public Employee createEmployee(String name, String empId) {

		Employee emp = new Employee();
		emp.setName(name);
		emp.setEmpId(empId);
		return emp;
	}

	public void deleteEmployee(String empId) {
		
	}
	  public boolean loginCheck(String uid,String pass) {
		  UserDAO  obj=new UserDAO();
		  return obj.loginCheck(uid, pass);
	  }
	 
}
