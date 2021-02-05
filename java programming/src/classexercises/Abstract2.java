package classexercises;

abstract class Timing
{
	abstract void login();
	void display()
	{
		System.out.println("office name is ZZZ");
	}
}
 class MorningShift extends Timing
 {

	@Override
	void login() {
	
		
		System.out.println("Morning shift - 9 to 1");
	}
	 
 }
 class AfternoonShift extends Timing
 {

	@Override
	void login() {
		
		System.out.println("Afternoon shift - 2 to 10");
	}
	 
 }
class NightShift extends Timing
{

	@Override
	void login() {
		
		System.out.println("Night shift - 10 to 7");
	}
	
}
 
 
 
 
 public class Abstract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MorningShift m=new MorningShift();
m.display();
m.login();
AfternoonShift f=new AfternoonShift();
f.login();
NightShift n=new NightShift();
n.login();

	}

}
