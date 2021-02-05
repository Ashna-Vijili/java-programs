package classexercises;
import java.util.Arrays;
public class Sorting1 {

	public static void main(String[] args) {
		int a[]= {12,14,7,8,9,15,13};
		for(int i=0;i<a.length;i++)
		{
			 System.out.print(a[i] +" ");
			 
		}
		System.out.println();
		Arrays.sort(a);
		
		 System.out.println("After sorting");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i] +" ");
			 
		 }
		

	}

}
