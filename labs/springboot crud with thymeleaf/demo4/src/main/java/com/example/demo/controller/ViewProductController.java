package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.Product;
import com.example.demo.service.ViewProductService;

@Controller
public class ViewProductController {

	@Autowired
	ViewProductService ls;

	
	/*@RequestMapping(value = "/select", method = RequestMethod.GET)
	public ModelAndView selectProd() {
			
		List<Product>  pd=ls.getAllProducts();
		System.out.println(pd);
		
		return new ModelAndView("success");
	}*/
	
	
	@GetMapping("/select")
	public String showProductList(Model model) {
		System.out.println(ls.getAllProducts());
	    model.addAttribute("list",ls.getAllProducts());
	    return "ProductPage";
	}
	
}
