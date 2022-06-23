package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Product;

@Repository
public interface EditProductDAO extends  CrudRepository<Product,Integer>  {

}
