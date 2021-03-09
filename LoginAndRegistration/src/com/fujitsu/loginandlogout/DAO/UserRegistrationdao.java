package com.fujitsu.loginandlogout.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.fujitsu.loginandlogout.model.User;

public class UserRegistrationdao {
public boolean registerUser(User user) throws SQLException, ClassNotFoundException
{
	System.out.println("Start of UserRegistrationDao : : registerUser");
	
	String url="jdbc:mysql://localhost:3306/register";
	String dbusername="root";
    String dbpassword="root";

Connection con;
PreparedStatement ps;

	
String sql="insert into user values(?,?,?,?,?)";
Class.forName("com.mysql.cj.jdbc.Driver");  
con=DriverManager.getConnection(url, dbusername, dbpassword); 

	 ps=con.prepareStatement(sql);
	
	 ps.setInt(1, user.getId());
	 ps.setString(2,user.getUsername());
	 ps.setString(3,user.getPassword());
	 ps.setInt(4, user.getPhone());
	 ps.setString(5, user.getAddress());
	 int result=ps.executeUpdate();
	 
	 if(result > 0)
	 return true;
	
	 
    System.out.println("Start of UserRegistrationDao : : registerUser");
   
		
    con.close();
    ps.close();
    return false;
}
}
