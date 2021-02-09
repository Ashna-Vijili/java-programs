package inheritanceandabstraction;
import java.util.Random;
public class TestMedicine {

	public static void main(String[] args) {
	double d=Math.random()*4;
	int a=(int)d;
	System.out.println(a);
	
	switch(a)
	{
	case 1:
		Medicine m=new Ointment(100,"12-2-21");
		m.displayLabel();
		break;
	case 2:
		Medicine m1=new Syrup(200,"13-2-21");
		m1.displayLabel();
		break;
	case 3:
		Medicine m3=new Tablet(67,"19-5-21");
		m3.displayLabel();
		break;
			
		
	}
	}

}
