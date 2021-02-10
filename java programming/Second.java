package practiceexercise;

class Employee
{
	String firstName;
	String lastName;

   public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

    @Override
	public String toString() {
		return  firstName +" "+lastName ;
	}
    }
   public class Second {

	public static void main(String[] args) {
		Employee e1=new Employee("Ashok","Kumar");
		Employee e2=new Employee("Akshai","Kumar");
		Employee e3=new Employee("Akash","Kumar");

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
}}
