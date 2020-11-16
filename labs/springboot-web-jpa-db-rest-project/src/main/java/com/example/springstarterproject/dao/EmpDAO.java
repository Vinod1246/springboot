package com.example.springstarterproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springstarterproject.Employee;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@Repository

@RepositoryRestResource(collectionResourceRel="employees",path="employees")
public interface EmpDAO extends CrudRepository<Employee,Integer> {

}
