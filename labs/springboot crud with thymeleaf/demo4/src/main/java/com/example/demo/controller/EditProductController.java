package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.bean.Product;
import com.example.demo.service.EditProductService;
import com.example.demo.service.ViewProductService;

@Controller
public class EditProductController {
	
	@Autowired
	EditProductService eps;
	
	@Autowired
	ViewProductService ls;
	
	
	 @GetMapping("/edit")
	 public String getEditPage(Model model,@RequestParam int id) {
		 
		   System.out.println("product id is"+ id);
		 
	       String page = null; 
	       Product product = ls.getProductById(id);
	         
	       model.addAttribute("proddd", product);
	       return "EditProductPage";      
	    }
}
