package exceptionassignment;

class AgeException extends Exception
{
	public AgeException(String s)
	{
		super(s);
		System.out.println("this is AgeException class constructor");
	}
}
class CheckEligibility 
{
	void checkAge(int age) throws AgeException
	{
		System.out.println("your age is " + age);
		if(age<18)
		{
		throw new AgeException("you are not eligible to vote");
	}
		else
		{
			System.out.println("you are eligible to vote");
		}
}
}

public class AgeApp {

	public static void main(String[] args) throws AgeException 
	{
		CheckEligibility c=new CheckEligibility();
		c.checkAge(17);
	}

}
