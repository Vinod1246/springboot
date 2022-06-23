package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.bean.Product;

@Controller
public class HelloController {
	
	List ls= Arrays.asList(new Product("p001","ipod","rs300"),
            new Product("p002","ipod","rs400"),
            new Product("p003","ipod","rs500"));
	
	@GetMapping("/hello")
	public String  display(Model model) {
		model.addAttribute("myvar","This is springboot demo");
		model.addAttribute("prodlist", ls);
	    return  "product";	
	}

}
