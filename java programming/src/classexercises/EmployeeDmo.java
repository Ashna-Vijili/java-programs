package classexercises;


class Employee
{
	int employeeId;
	String name;
	String dept;
	double salary;
	
	void displayEmployeeDetails() {
		System.out.println("id is " + employeeId);
		System.out.println("name is " + name);
		System.out.println("dept is " + dept);
		System.out.println("salary is "+ salary);
	}
	
}
public class EmployeeDmo {

	public static void main(String[] args) {
		System.out.println("employeedemo app:");
		Employee suji=new Employee();
		suji.employeeId=123;
		suji.name="suji";
		suji.dept="hr";
		suji.salary=45000;
		
		suji.displayEmployeeDetails();
		//String message=suji.checkForLoanOption();
		System.out.println();
		

	}

}
