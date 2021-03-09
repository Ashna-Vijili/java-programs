package com.fujitsu.loginandlogout.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fujitsu.loginandlogout.DAO.UserRegistrationdao;
import com.fujitsu.loginandlogout.model.User;

/**
 * Servlet implementation class UserRegistration
 */
@WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserRegistrationdao dao;
		  
			response.setContentType("text/html");  
			PrintWriter out = response.getWriter();  
			          
			String username=request.getParameter("userName");  
			String password=request.getParameter("userPass");
			int phone=Integer.parseInt(request.getParameter("phone"));  
			String address=request.getParameter("address");  
			
			Random random=new Random();
            int userId=random.nextInt(999);
           User newUser=new User(userId,username,password,phone,address);
			
           dao=new UserRegistrationdao();
         boolean result = false;
		try {
			result = dao.registerUser(newUser);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           if(result)
           {
			//System.out.println(username+" "+password+" "+phone+" "+address);
			System.out.println("User Registered Succesfully....");
           response.sendRedirect("welcome.jsp");
	}
           else
        	   System.err.println("Internal server error");
		
		
		
		
		
	}

}
