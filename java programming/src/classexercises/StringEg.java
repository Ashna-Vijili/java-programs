package classexercises;

class Employe
{
	int id;
	String name;
	Employe(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class StringEg {

	public static void main(String[] args) {
		
		Employe emp=new Employe (1,"sachin");
		System.out.println(emp);
	}

}
