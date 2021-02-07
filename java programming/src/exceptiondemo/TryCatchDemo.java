package exceptiondemo;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		 
		int a=10; 
		int b=0;
		int arr[]=new int[5];
		arr[4]=7;
		 System.out.println("journey started from banglore to chennai"); 
		 System.out.println("50 kms completed");
		  System.out.println("100 kms completed");  
		  
		  
		  try 
		  {
		  System.out.println(a/b); 
		  System.out.println(arr[7]);
		  } 
		  catch(ArrayIndexOutOfBoundsException obj) 
		  {
			  System.out.println("Array index out of bound");
		  }
		  catch(ArithmeticException d)
		  {
		  System.out.println("do not use zero");
		  } 
			
		 finally
		 {
			 System.out.println("closing statement");
		 }
		  System.out.println("150 kms completed");
		  System.out.println("200 kms completed");
	}
		

}
