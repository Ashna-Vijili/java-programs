package classexercises;
 class Employ
 {
	 int id;
	 String name;
	 
	public Employ(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + "]";
	}
	 
	 
 }
public class ToStringDemo {

	public static void main(String[] args) {
		
Employ e1=new Employ(1,"sam");

Employ e2=new Employ(11,"samuel");

System.out.println(e1);
System.out.println(e2);
System.out.println(e1.hashCode());
System.out.println(e2.hashCode());

	}

}
