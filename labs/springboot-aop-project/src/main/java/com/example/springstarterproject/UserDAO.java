package com.example.springstarterproject;

public class UserDAO {
	
	
	 public  boolean  loginCheck(String uid , String pass) {
		 
		 if(uid.equals("abc")) {
			 return true;
		 }else {
			 return false;
		 }
	 }

}
