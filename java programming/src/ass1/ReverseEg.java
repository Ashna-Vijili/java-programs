package ass1;

public class ReverseEg {
	
	public static void main(String[] args)   
	{  
	int n = 51263;
	int reverse = 0;  
	while(n != 0)   
	{  
	int remainder = n % 10;  
	reverse = reverse * 10 + remainder;  
	n = n/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  
	}  


