package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Product;
import com.example.demo.dao.UpdateProductDAO;

@Service
public class UpdateProductService {
	
	@Autowired
	UpdateProductDAO  upd;
	
	public void updateProduct(Product product) {
	       upd.save(product);
	}
	

}
