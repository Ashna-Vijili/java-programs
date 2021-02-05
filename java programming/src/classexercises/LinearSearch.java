package classexercises;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {2,8,6,4,1,19,21};
		int f=1;
		int flag=0;
		int location=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==f)
			{
				location=i+1;
				flag=1;
				break;
				
			}
			else {
				flag=0;
			}
			
		}
		if(flag==1)
		{
			System.out.println("value is found at location " +location);
		}
	}
	{
		
	}

}
