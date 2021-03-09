package com.fujitsu.loginandlogout.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fujitsu.loginandlogout.DAO.LoginDao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		LoginDao dao=new LoginDao();
		try {
			boolean result=dao.verifyUserCredentials(username, password);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if(dao.verifyUserCredentials(username, password))
			{
				 HttpSession session=request.getSession(); 
				 session.setAttribute("username", username);
				  response.sendRedirect("welcome.jsp");
			}
			else
			{
			response.sendRedirect("login.jsp");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		/*
		 * if(username.equals("anit") && password.equals("password")) { HttpSession
		 * session=request.getSession(); session.setAttribute("username", username);
		 * response.sendRedirect("welcome.jsp");
		 * 
		 * } else { response.sendRedirect("login.jsp"); }
		 */
		
	}

}
