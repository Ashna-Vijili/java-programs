package day13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList l=new LinkedList();
l.add(1);
l.add(2);
l.add(3);
l.addFirst(19);
l.addLast(7);
l.add(6);
System.out.println(l);

l.removeFirst();
System.out.println(l);

l.removeLast();
System.out.println(l);

	}

}
