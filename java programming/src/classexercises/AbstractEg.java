package classexercises;

abstract class Operation
{
	abstract void numbers(int a,int b);
	
}
class Sachin extends Operation
{

	@Override
	void numbers(int a, int b) {
		System.out.println(a+b);
		
	}
	
}
class Rahul extends Operation
{

	@Override
	void numbers(int a, int b) {
		System.out.println(a-b);
		
	}
	
}

public class AbstractEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sachin a=new Sachin();
a.numbers(4, 5);

Rahul s=new Rahul();
s.numbers(9, 3);
	}

}
