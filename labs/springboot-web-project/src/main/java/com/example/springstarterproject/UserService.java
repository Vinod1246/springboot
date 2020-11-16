package com.example.springstarterproject;


public class UserService {

	  public boolean loginCheck(String uid,String pass) {
		  UserDAO  obj=new UserDAO();
		  return obj.loginCheck(uid, pass);
	  }
	 
}
