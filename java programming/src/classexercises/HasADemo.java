package classexercises;
class Employee7
{
	int id;
	String name;
	Address address;
	public Employee7(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void displayEmployeeInfo()
	{
		System.out.println("id" + id);
		System.out.println("name"  + name);
		System.out.println("doorno" + address.doorNo);
		System.out.println("street name" + address.streetName);
		System.out.println("city" + address.city);
	}
}
class Address
{
	int doorNo;
	String streetName;
	String city;
	public Address(int doorNo, String streetName, String city) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
	}
	
}

public class HasADemo {

	public static void main(String[] args) {
	Address address=new Address( 1," fgh"," banglore");
	Employee7 e=new Employee7(1," sam",address);
	e.displayEmployeeInfo();

	}

}
