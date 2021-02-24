

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Parameters
 */
@WebServlet("/Parameters")
public class Parameters extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("username");
		String gender=request.getParameter("gender");
		
		String courses[]=request.getParameterValues("course");
		
		
		
		/*
		 * for(String values:courses) { out.print(values + "<br>"); }
		 */
		for(int i=0;i<courses.length;i++)
		{
			out.print("courses you have selected ");
			out.print(courses[i] + "<br>");
		}
	}

}
