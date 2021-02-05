package classexercises;
class A
{
	void property()
	{
		System.out.println("20 lakhs");
	}
	void marry()
	{
		System.out.println("you should marry");
	}
}
class C extends A
{
	void marry()
	{
		System.out.println("not willing");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * C a=new C(); a.property(); a.marry();
		 */
		A s=new C();
		s.property();
		s.marry();
	}

}
