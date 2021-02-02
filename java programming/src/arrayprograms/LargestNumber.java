package arrayprograms;

public class LargestNumber {

	public static void main(String[] args) {
	int a[]= {34,67,31,1,3,2,88,7,5};
	int large=a[0];
	int seclarge=0;
	int small=a[0];
	int secsmall=0;
	for(int i=0;i<a.length;i++)
	{
		if(large<a[i])
		{
			seclarge=large;
			large=a[i];
		}
		if(seclarge<a[i]&&a[i]!=large)
		{
			seclarge=a[i];
		}
	}
	for(int i=0;i<a.length;i++)
	{
		 if(small>a[i])
		{
			secsmall=small;
			small=a[i];
		}
		 if(secsmall>a[i]&&a[i]!=small)
		 {
			 secsmall=a[i];
		 }
	}
	
     System.out.println("Largest number is:" +large);
     System.out.println("Second Largest number is:" +seclarge);
     System.out.println("Smallest number is:" +small);
     System.out.println("Second Smallest number is:" +secsmall);
     
}
}
