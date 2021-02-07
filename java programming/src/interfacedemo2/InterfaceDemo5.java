package interfacedemo2;

interface loan
{
	void loanslab();
}
interface Employee11 extends loan
{
	void workinghours();
	int h=9;
	
	}
class Company implements Employee11
{

	@Override
	public void loanslab() {
		System.out.println("ABC");
	}

	@Override
	public void workinghours() {
		System.out.println("working hours is "+h);
		
		
	}
	
}

public class InterfaceDemo5 {

	public static void main(String[] args) {
		Company c=new Company();
		c.workinghours();
		c.loanslab();
	}

}
