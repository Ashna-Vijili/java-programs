package day13;

import java.util.ArrayList;

public class UserDefinedDemo {

	public static void main(String[] args) {
		class Employee
		{
			int id;
			String name;
			public Employee(int id, String name) {
				super();
				this.id = id;
				this.name = name;
				
			}
			@Override
			public String toString() {
				return "Employee [id=" + id + ", name=" + name + "]";
			}
			
		}
		
		
		ArrayList<Employee> e=new ArrayList<Employee>();
		e.add(new Employee(1,"ash"));
		e.add(new Employee(2,"viji"));
		e.add(new Employee(3,"sam"));
		
		System.out.println(e);
		for(Employee e1:e)
		{
			System.out.println(e1.id +" "+e1.name);
		}
		
		
	}
	}


