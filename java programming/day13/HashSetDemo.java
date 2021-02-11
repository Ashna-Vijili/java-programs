package day13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet h=new HashSet();
h.add(1);
h.add(2);
h.add("java");
h.add(360);
h.add(900);
h.add("Hello");
h.add("Hello");
System.out.println("Hashset " +h);

LinkedHashSet h1=new LinkedHashSet();
h1.add(1);
h1.add(2);
h1.add("java");
h1.add("Hello");
h1.add("Hello");
h1.add(800);
h1.add("ash");
System.out.println("LinkedHashset : " +h1);

TreeSet t=new TreeSet();
t.add(10);
t.add(11);
t.add(43);
t.add(3);
t.add(7);

System.out.println("TreeSet =" +t);

TreeSet t1=new TreeSet();
t1.add("hello");
t1.add("hi");
t1.add("india");
t1.add("apple");
t1.add("apple");

System.out.println("TreeSet : "+t1);

	}

}
