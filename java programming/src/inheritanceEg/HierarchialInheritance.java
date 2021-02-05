package inheritanceEg;

class Vehicle
{
	public void vehicle_details()
	{
		System.out.println("Vehicle details....");
	}
}
class Car extends Vehicle
{
	public void car_details()
	{
	System.out.println("Audi is my fav...");
}
}
	class Bike extends Vehicle
	{
		public void bike_details()
		{
			System.out.println("RE is my fav...");
		}
	}

public class HierarchialInheritance {

	public static void main(String[] args)
	{
Car a=new Car();
a.vehicle_details();
a.car_details();
Bike b=new Bike();
b.vehicle_details();
b.bike_details();
}

}
