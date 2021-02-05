package classexercises;

class Employeee
{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Employeee em=new Employeee();
		
em.setId(5);
em.setName("sam");
System.out.println(em.getId());
System.out.println(em.getName());

	}

}
