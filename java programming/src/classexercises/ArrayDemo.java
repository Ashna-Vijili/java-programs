package classexercises;

public class ArrayDemo {

	public static void main(String[] args) {
		
int marks[]=new int[5];
System.out.println("size of array"+marks.length);

marks[1]=76;
marks[2]=23;
System.out.println(marks[0]);
System.out.println(marks[1]);
System.out.println(marks[2]);
System.out.println(marks[3]);

for(int i=0;i<marks.length;i++)
{
	System.out.println(marks[i]);
}
	}

}
