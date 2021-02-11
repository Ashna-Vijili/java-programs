package day13;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList o=new ArrayList();
		o.add(1);
		o.add(2);
		o.add(3);
		o.add(4);
		o.add(5);
		o.add(6);
		
		System.out.println(o);
		
		Collections.sort(o);
		System.out.println(o);
		
		//Collections.reverse(o);
		//System.out.println(o);
		
		System.out.println("maximum value : " +Collections.max(o));
		System.out.println("minimum value : " +Collections.min(o));
		
		int index=Collections.binarySearch(o,6);
		System.out.println("index is: "+index);
		int index2=Collections.binarySearch(o,5);
		System.out.println("index is: "+index2);
		
		
		int index1=Collections.binarySearch(o,30);
		System.out.println("index is: "+index1);//- next -1;
		
	}

}
