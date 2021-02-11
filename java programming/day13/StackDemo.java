package day13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack s=new Stack();
s.push(1);
s.add(2);
s.push(3);
s.add(4);

System.out.println("stack is : "+s);

System.out.println("it returns top element "+s.peek());
System.out.println("it returns and removes top element "+s.pop());
System.out.println("after poping "+s);

System.out.println("it returns top element "+s.peek());
System.out.println("it returns and removes top element "+s.pop());
System.out.println("after poping "+s);

System.out.println("it returns top element "+s.peek());
System.out.println("it returns and removes top element "+s.pop());
System.out.println("after poping "+s);

System.out.println("it returns top element "+s.peek());
System.out.println("it returns and removes top element "+s.pop());
System.out.println("after poping "+s);



	}

}
