package assignment;

class Car
{
	int yearModel;
	String make;
	int speed;
	public Car(int yearModel, String make) {
		super();
		this.yearModel = yearModel;
		this.make = make;
		speed=0;
	}
	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
		
	}
	public void acclerate()
	{
		speed+=5;
	}
	public void brake()
	{
		speed-=5;
		if(speed<0)
		{
			speed=0;
		}
	}
}

public class CarDemo {

	public static void main(String[] args) {
		Car c=new Car(1965,"Bat Mobile");
		c.acclerate();
		System.out.println(c.getSpeed());
		c.acclerate();
		System.out.println(c.getSpeed());
		c.acclerate();
		System.out.println(c.getSpeed());
		c.acclerate();
		System.out.println(c.getSpeed());
		c.acclerate();
		System.out.println(c.getSpeed());

		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
	}

}
