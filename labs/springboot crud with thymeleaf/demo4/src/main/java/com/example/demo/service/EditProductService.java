package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EditProductDAO;

@Service
public class EditProductService {
	
	@Autowired
	EditProductDAO   epd;
	
	

}
