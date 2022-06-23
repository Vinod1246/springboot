package com.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView loginPageView(){
		ModelAndView obj=new ModelAndView("LoginPage");
		return obj;	
	}
	
	
	@RequestMapping(value="/Login1", method=RequestMethod.POST)
	public String loginCheck(HttpServletRequest request){
		String userId=request.getParameter("userId");
		String userName=request.getParameter("userName");
		if(userId.equals("ABC")){
			return "success";
		}
		return "failure";
	}
}


