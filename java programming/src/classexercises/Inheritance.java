package classexercises;

class Parent
{
	int a=10;
}
class Child extends Parent
{
	int a=20;
	void addition()
	{
		int result=a+a;
		System.out.println("result=" + result);
		
		int result1=super.a + a;
		System.out.println("result1=" + result1);
		
		int result2=super.a + super.a;
		System.out.println("result2=" + result2);
	}
}
public class Inheritance {

	public static void main(String[] args) {

		Child c=new Child();
		c.addition();
	}

}
