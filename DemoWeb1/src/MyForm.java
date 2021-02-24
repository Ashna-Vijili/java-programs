

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyForm
 */
@WebServlet("/MyForm")
public class MyForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("hello you hav called the server from the client " +"<br>");
		
		String firstName=request.getParameter("fname");
		String lastName=request.getParameter("lname");
		
		out.print("Your first name is " +firstName + "<br>");
		out.print("Your last name is " +lastName );
		
		System.out.println("Hello ");
		
				
	}
MyForm()
{
	System.out.println("Constructor is called");
}
public void init(ServletConfig config)throws ServletException
{
	System.out.println("init is called");
}
public void destroy()
{
	System.out.println("destroy is called ");
}
}
