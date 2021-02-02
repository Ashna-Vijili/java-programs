package arrayprograms;

public class ArrayEg 
{

	public static void main(String[] args) {
		int a[]= {2,8,6,4,1,19,21};
		int find=6;
		int flag=0;
		int location=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==find)
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
			System.out.println("The element is found at " + location);
			
		}
		else
		{
			System.out.println(+ -1);	
	}
	{
		
	}

}
}
	
	

