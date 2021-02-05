package classexercises;

class Constructor
{

	int id;
	String name;
	String address;
	
	Constructor(int id,String name,String address)
	{
		System.out.println("constructor called");
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	void display()
	{
		System.out.println("id " + id);
		System.out.println("name " + name);
		System.out.println("address " + address);
	}}
	
	public class Customer 
	{
	public static void main(String[] args) 
		
	
	{
		Constructor con=new Constructor(1,"ash","abcdf");
		con.display();
	}
		

	}

