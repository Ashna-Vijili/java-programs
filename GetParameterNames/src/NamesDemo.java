

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NamesDemo
 */
@WebServlet("/NamesDemo")
public class NamesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		Enumeration em=request.getParameterNames();
		
		while(em.hasMoreElements())
		{
			String name=(String)em.nextElement();
			String value=request.getParameter(name);
			out.print("name is " +name + "value is " +value+"<br><br>"); 
		}
		
	}

}
