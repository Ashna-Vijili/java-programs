package day13;

import java.util.ArrayList;
import java.util.Collections;

public class ListInterface {

	public static void main(String[] args) {
		ArrayList o=new ArrayList();
		o.add(1);
		o.add(2);
		o.add(3);
		o.add(4);
		o.add(5);
		o.add(6);
		
		System.out.println(o);
		 
		
		  o.add(1,'a');
		  o.add(3, "ash");
		  o.add(4, 7);
		  System.out.println(o);
		  
		  o.set(2, 10);
		  o.set(5,'b');
		  
		  System.out.println(o);
		 
		

	}

}
