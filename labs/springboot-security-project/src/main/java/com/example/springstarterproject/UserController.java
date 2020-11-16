package com.example.springstarterproject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	 @Autowired
	 UserService userservice;

	 @RequestMapping(value="/login",method=RequestMethod.GET)
	 public ModelAndView loginpage() {
		 ModelAndView obj=new ModelAndView("LoginPage");
		 return obj; 
	 }
	 
	 @RequestMapping(value="/login1",method=RequestMethod.POST)
	 public ModelAndView logincheck(HttpServletRequest req) {
		
		 String userid = req.getParameter("uid");     
		 String pass = req.getParameter("pass");
		 
	
		 boolean b=userservice.loginCheck(userid, pass);
		 
		 if(b) {
			 ModelAndView  s=new ModelAndView("loginsuccess");
			 return s;
		 }else {
			 ModelAndView  s=new ModelAndView("loginfailure");
			 return s;
		 }
		 
	 }
	 
}
