package exceptiondemo;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo2 {

	public static void main(String[] args) {
		
		int result=0;
		
		int a,b;
		
		try
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter the value of a and b");
			a=s.nextInt();
			b=s.nextInt();
			result=a/b;
			
			System.out.println(a/b);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("divide by zero " +ex.getMessage());
		}
		catch(InputMismatchException n)
		{
			System.out.println("input mismatch "+n.getMessage());
			//n.printStackTrace();
		}
		finally
		{
			System.out.println("closing statement");
		}
		System.out.println(+result);
	}

}
