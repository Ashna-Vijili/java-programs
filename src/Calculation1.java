

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculation1
 */
@WebServlet("/Calculation1")
public class Calculation1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int number1=Integer.parseInt(request.getParameter("num1"));
		int number2=Integer.parseInt(request.getParameter("num2"));
		
		String calculation1=request.getParameter("calc");
		System.out.println("you have clicked "  +calculation1 + " button");
		
		int result=0;
		
		if(calculation1.equalsIgnoreCase("add"))
		{
			result=number1+number2;
			out.println("result of add = " +result);
		}
		else if(calculation1.equalsIgnoreCase("sub"))
		{
			result=number1-number2;
			out.println("result of sub = " +result);
		}
	}
	
	}


