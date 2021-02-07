package interfacedemo2;

interface Manager1
{
	void display();
}
interface Employee1
{
	void display();
}
class X
{
	void Salary()
	{
		System.out.println("salary amount is Rs.30000");
	}
}
class Demo extends X implements Manager1,Employee1
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("manager");
		System.out.println("employee");
	}
	
}

public class InterfaceDemo4 {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.display();
		d.Salary();

	}

}
