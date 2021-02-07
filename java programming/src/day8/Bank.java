package day8;

interface Bank1
{
	int rateOfInterset(int percent);
	double minBalance(double amount);
	
}
class Sbi implements Bank1
{

	@Override
	public int rateOfInterset(int percent) {
		System.out.println("rate of interest is " + percent);
		return percent;
	}

	@Override
	public double minBalance(double amount) {
		System.out.println("min balance " + amount);
		return amount;
	}
	
}
class Kotak implements Bank1
{

	@Override
	public int rateOfInterset(int percent) {
		System.out.println("rate of interest is " + percent);
		return percent;
	}

	@Override
	public double minBalance(double amount) {
		System.out.println("min balance " + amount);
		return amount;
	}
	
}


public class Bank {

	public static void main(String[] args) {
		
Bank1 b=new Sbi();
b.rateOfInterset(5);
b.minBalance(1000);


Bank1 c=new Kotak();
b.rateOfInterset(6);
b.minBalance(1500);


	}

}
