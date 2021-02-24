

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserNameDemo
 */
@WebServlet("/UserNameDemo")
public class UserNameDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String a=request.getParameter("username");
		String b=request.getParameter("password");
		
		
		if(a.equals("admin")&& b.equals("admin"))
		{
			out.println("you are logged in ");
		}
		else
		{
			out.println("you are not logged in ");
		}
		
	}

}
