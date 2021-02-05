package classexercises;
class Bank
{
	void rateOfInterest()
	{
		System.out.println("2%");
	}
	void minimumBalance()
	{
		System.out.println("1000 Rs");
	}
}
class Axis extends Bank
{
	void rateOfInterest()
	{
		System.out.println("4%");
	}
	
}
class Icici extends Bank
{
	void rateOfInterest()
	{
		//super.rateOfInterest();
		System.out.println("6%");
	}
	
}

public class BankDemo {

	public static void main(String[] args) {
		Bank b=new Axis();
		b.rateOfInterest();
		b.minimumBalance();
		
		Bank s=new Icici();
		s.rateOfInterest();
		s.minimumBalance();
		
	}

}
