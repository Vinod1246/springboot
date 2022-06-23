package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DeleteProductDAO;

@Service
public class DeleteProductService {
	
	@Autowired
	DeleteProductDAO   dpd;
	
	  
	public void deleteProductById(int id) {
	       dpd.deleteById(id);
	}
}
