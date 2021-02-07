package interfacedemo2;

interface Employee
{
	double salary(double amount);
	int workingHours(int hours);
}

class FullTimeEmployee implements Employee
{

	@Override
	public double salary(double amount) {
		
		
		System.out.println("salary " +amount);
		return 0;
	}

	@Override
	public int workingHours(int hours) {
	System.out.println("working hours " +hours);
		return 0;
	}
	
}
class PartTimeEmployee implements Employee
{

	@Override
	public double salary(double amount) {
	System.out.println("salary is " +amount);
		return 0;
	}

	@Override
	public int workingHours(int hours) {
	System.out.println("working hours " +hours);
		return 0;
		
	}
	
}
class ContractEmployee implements Employee
{

	@Override
	public double salary(double amount) {
	System.out.println("salary is " +amount);
		return 0;
	}

	@Override
	public int workingHours(int hours) {
		System.out.println("working hours " +hours);
		return 0;
	}
	
}


	public class InterfaceEmployeeDemo {

	public static void main(String[] args) {
	Employee e=new FullTimeEmployee();
	e.salary(45000);
	e.workingHours(12);
	
	Employee g=new PartTimeEmployee();
	g.salary(30000);
	g.workingHours(7);
	
	Employee s=new ContractEmployee();
	s.salary(35000);
	s.workingHours(9);
	
	}


}
