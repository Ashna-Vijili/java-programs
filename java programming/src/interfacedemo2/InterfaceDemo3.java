package interfacedemo2;

interface Employees2
{
	int loginhours=8;
	void designation();
}
class Manager implements Employees2
{

	@Override
	public void designation() {
		System.out.println("i am the manager");
		System.out.println("i work for " +loginhours + " hours");
		
	}
	
}
class Developer implements Employees2
{

	@Override
	public void designation() {
		System.out.println("i am the Developer");
		System.out.println("i work for " +loginhours + " hours");
		
		
	}
	
}

public class InterfaceDemo3 {

	public static void main(String[] args) {
		Manager m=new Manager();
		m.designation();
		
		Developer d=new Developer();
		d.designation();
	}

}
