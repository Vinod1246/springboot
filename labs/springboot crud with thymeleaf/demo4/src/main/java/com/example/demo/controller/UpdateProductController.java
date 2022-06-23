package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.Product;
import com.example.demo.service.UpdateProductService;
import com.example.demo.service.ViewProductService;

@Controller
public class UpdateProductController {
	
	@Autowired
	UpdateProductService  ups;
	
	@Autowired
	ViewProductService ls;
	
	
	@PostMapping("/update")
    public String updateInvoice(@ModelAttribute Product product,Model model) {
		
       ups.updateProduct(product);
       
       model.addAttribute("list",ls.getAllProducts());
	   return "ProductPage";
    }

}
