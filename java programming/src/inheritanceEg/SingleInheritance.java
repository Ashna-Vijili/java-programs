package inheritanceEg;

class Vehicle2
{
	public void vehicle2_details()
	{
		System.out.println("Vehicle details....");
	}
}
class Car2 extends Vehicle2
{
	public void car2_details()
	{
	System.out.println("Audi is my fav...");
}
}
public class SingleInheritance {

	public static void main(String[] args) {
Car2 c=new Car2();
c.vehicle2_details();
c.car2_details();
	}

}
