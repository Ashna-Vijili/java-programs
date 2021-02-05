package classexercises;

class D{
	void display (int radius)
	{
		System.out.println("circle");
	}
	void display(int l,int b)
	{
		System.out.println("rectangle");
	}
}
public class OverloadingDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
D d=new D();
d.display(2);
d.display(2,3);
	}

}
