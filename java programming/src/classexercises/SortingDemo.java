package classexercises;

public class SortingDemo {

	public static void main(String[] args) {
		int a[]= {7,3,8,1,23,15,6,2,5};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] +" ");
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
				System.out.println();
				System.out.println("Sorted elements are:");
				
				for(int i=0;i<a.length;i++) {
					System.out.print(a[i] +" ");
				}
			}
			
		}
	



