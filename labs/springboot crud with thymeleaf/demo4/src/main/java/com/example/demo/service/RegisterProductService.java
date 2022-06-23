package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Product;
import com.example.demo.dao.RegisterProductDAO;

@Service
public class RegisterProductService {
	
	@Autowired
	RegisterProductDAO  rpd;
	
	
    public Product saveProduct(Product p) {
       return rpd.save(p);
    }

	
	
	
	

}
