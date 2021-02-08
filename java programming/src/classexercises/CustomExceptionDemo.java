package day9;
class LateException extends RuntimeException
{
	public LateException(String msg)
	{
		super(msg);
		System.out.println("this a late exception class constructor");
	}
}
class StudentLogin
{
	void loginTime(int time)
	{
		if(time>9)
		{
		throw new LateException("you are absent");
		}
		else
		{
		System.out.println("you are present");
		}
	}
}
public class CustomExceptionDemo {

	public static void main(String[] args) {
		StudentLogin g=new StudentLogin();
		g.loginTime(10);

		}

}
