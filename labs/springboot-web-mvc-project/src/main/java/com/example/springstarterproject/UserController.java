package com.example.springstarterproject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	 @RequestMapping(value="/login",method=RequestMethod.GET)
	 public ModelAndView loginpage() {
		 ModelAndView obj=new ModelAndView("LoginPage");
		 return obj; 
	 }
	 
	 @RequestMapping(value="/signup",method=RequestMethod.GET)
	 public ModelAndView signuppage() {
		 ModelAndView obj=new ModelAndView("SignupPage");
		 return obj; 
	 }
	 
	 @RequestMapping(value="/signup1",method=RequestMethod.POST)
	 public ModelAndView reg(@ModelAttribute("command") Employee emp,BindingResult result) {
		  
		ModelAndView obj=new ModelAndView("success");
		System.out.println(emp);
		
		if (result.hasErrors()) {
			 ModelAndView obj1=new ModelAndView("SignupPage");
			 return obj1; 
		}
		return obj;
	 }
	 
	 
	 
	 @RequestMapping(value="/login1",method=RequestMethod.POST)
	 public String logincheck(HttpServletRequest request) {
		 
		 String uid=request.getParameter("userId");
		 String pass=request.getParameter("pass");
		 
		 UserService ls=new UserService();
		 boolean b=ls.loginCheck(uid, pass);
		 
		 if(b) {
			 return "success";
		 }
		 return "failure";
	 }
}
