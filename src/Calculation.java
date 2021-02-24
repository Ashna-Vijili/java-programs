

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculation
 */
@WebServlet("/Calculation")
public class Calculation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		String number1=request.getParameter("num1");
		String number2=request.getParameter("num2");
		
		//int num=Integer.parseInt(request.getParameter("num1"));
		
		int n1=Integer.parseInt(number1);
		int n2=Integer.parseInt(number2);
		
		int add=n1+n2;
		out.print("Add =" +add);
		
		
	}

}
