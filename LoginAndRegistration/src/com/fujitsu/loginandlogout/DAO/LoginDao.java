package com.fujitsu.loginandlogout.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao 
{
	public boolean verifyUserCredentials(String username,String password) throws ClassNotFoundException, SQLException
{
	
		String url="jdbc:mysql://localhost:3306/register";
		String dbusername="root";
	    String dbpassword="root";
	    
        Connection con;
		PreparedStatement ps;
        String sql="select * from user where username=? and password=?";

	    Class.forName("com.mysql.cj.jdbc.Driver");  
	    con=DriverManager.getConnection(url, dbusername, dbpassword); 
	    
	    ps=con.prepareStatement(sql);
		 ps.setString(1,username);
		 ps.setString(2,password);
		
		 ResultSet rs=ps.executeQuery();
		 
if(rs.next())
	return true;

	return false;
}
}
