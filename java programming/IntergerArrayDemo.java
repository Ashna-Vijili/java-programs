package practiceexercise;

import java.util.Scanner;

public class IntergerArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements");
		int a=sc.nextInt();
		int age[]=new int[a];
		int b=0,c=0,d=0;

		System.out.println("enter the age");
		for(int i=0;i<a;i++){
			age[i]=sc.nextInt();
		}

		for(int j=0;j<age.length;j++)
		{
			if(age[j] <= 18 )
				
			{
              b++;
			}
			else if(age[j]>18 && age[j]<=54)
			{
				c++;
			}
			else 
			{
				d++;
			}

		}
		System.out.println("Children : " +b);
		System.out.println("Adults : " +c);
		System.out.println("Senior Citizens : " +d);
	}


}


