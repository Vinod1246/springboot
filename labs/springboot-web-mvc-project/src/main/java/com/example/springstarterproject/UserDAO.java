package com.example.springstarterproject;

public class UserDAO {
	
	
	public boolean loginCheck(String uid, String pass) {

//		Statement st;
//		try {
//			st = getCon().createStatement();
//
//			String sql = "select * from user1 where userid='" + uid + "' and password='" + pass + "'";
//			ResultSet rs = st.executeQuery(sql);
//			while (rs.next()) {
//				return true;
//			}
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		if (uid.equals("abc"))
			return true;
		else
		    return false;
	}

}
