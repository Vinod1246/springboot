package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.DeleteProductService;
import com.example.demo.service.ViewProductService;

@Controller
public class DeleteProductController {
	
	    @Autowired
	    DeleteProductService  dps;
	    
		@Autowired
		ViewProductService ls;
	
	    @GetMapping("/delete")
	    public String deleteProduct(@RequestParam int id,Model model) {
	        
	        dps.deleteProductById(id);
	        
	        model.addAttribute("list",ls.getAllProducts());
		    return "ProductPage";
	    }

}
