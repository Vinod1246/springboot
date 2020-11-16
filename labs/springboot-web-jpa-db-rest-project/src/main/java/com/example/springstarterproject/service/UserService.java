package com.example.springstarterproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springstarterproject.Employee;
import com.example.springstarterproject.dao.EmpDAO;

@Service
public class UserService {
	
	@Autowired
	EmpDAO empdao;
	
	
	public List<Employee> getAllEmployees()
    {
        List<Employee> empList = (List<Employee>) empdao.findAll(); 
        return empList;
    }
	
     
    public Employee getEmpById(int id)
    {
        Optional<Employee> employee = empdao.findById(id);
        return employee.get();
       
    }
     
    public Employee createEmployee(Employee emp)
    {
        emp = empdao.save(emp);
        return emp;
        
    } 
     
    public void deleteEmployeeById(int id)
    {
        Optional<Employee> emp = empdao.findById(id);
         
        if(emp.isPresent()) 
        {
            empdao.deleteById(id);
        } 
    } 

}
