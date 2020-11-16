package com.example.springstarterproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springstarterproject.Employee;

@Repository
public interface EmpDAO extends CrudRepository<Employee,Integer> {

}
