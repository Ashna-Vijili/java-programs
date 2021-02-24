

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationForm
 */
@WebServlet("/RegistrationForm")
public class RegistrationForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          
		String Name=request.getParameter("username");  
		String Password=request.getParameter("password");  
		String Age=request.getParameter("age");  
		String Gender=request.getParameter("gender");  
		String hobbies[]=request.getParameterValues("hobby"); 
		
		out.print("Name : "+Name);
		out.print("<br>");
		out.print("Password : " +Password);
		out.print("<br>");
		out.print("Age : " +Age);
		out.print("<br>");
		out.print("Gender : " +Gender);
		out.print("<br>");
		
		out.print("hobbies you have selected ");
		out.print("<br>");
		for(int i=0;i<hobbies.length;i++)
		{
			
			out.print(hobbies[i] + "<br>");
		}
		
	}

}
