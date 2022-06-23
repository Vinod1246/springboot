package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.Product;
import com.example.demo.service.RegisterProductService;
import com.example.demo.service.ViewProductService;

@Controller
public class RegisterProductController {
	
	
	@Autowired
	RegisterProductService    rps;
	
	@Autowired
	ViewProductService ls;
	
	
	
	@GetMapping("/register")
	public String reg() {
	       return "RegisterProductPage";
	}
	
	
	@PostMapping("/save")
    public String saveProduct(@ModelAttribute Product product,Model model) {
		
        rps.saveProduct(product);
        System.out.println(product);
        
      //  int id = rps.saveProduct(product).getProdId();
      //  String message = "Product with id : '"+id+"' is saved successfully !";
      //  model.addAttribute("message", message);
        
        model.addAttribute("list",ls.getAllProducts());
	    return "ProductPage";
    }

}
