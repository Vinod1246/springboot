package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Product;
import com.example.demo.dao.ViewProductDAO;

@Service
public class ViewProductService {
	
	@Autowired
	ViewProductDAO  vp;
	
	public List<Product> getAllProducts()   
	{  
		List<Product> prods = new ArrayList<Product>();  
	    vp.findAll().forEach(prod -> prods.add(prod));  
	    return prods;  
	}  
	
	public Product getProductById(int id) {
		
		return vp.findById(id).get();

	}
	

}
