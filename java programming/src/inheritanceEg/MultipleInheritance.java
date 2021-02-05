package inheritanceEg;
class Vehicle1
{
	public void vehicle1_details()
	{
		System.out.println("Vehicle details....");
	}
}
class Car1 extends Vehicle1
{
	public void car1_details()
	{
	System.out.println("Audi is my fav...");
}
}
	class Bike1 extends Car1
	{
		public void bike1_details()
		{
			System.out.println("RE is my fav...");
		}
	}

public class MultipleInheritance {

	public static void main(String[] args) {
Bike1 b=new Bike1();
b.vehicle1_details();
b.car1_details();
b.bike1_details();
}

}
