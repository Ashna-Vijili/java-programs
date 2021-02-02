package arrayprograms;

import java.util.Arrays;  

	public class MergeEg 
	{  
	public static void main(String[] args)   
	{  
	int[] firstArray = {22,12,35,43,76,55,1};        
	int[] secondArray = {41,32,66,99,1,5,7};  
	int f = firstArray.length;        
	int s = secondArray.length;
	int[] merge = new int[f + s];   
	System.arraycopy(firstArray, 0, merge, 0, f);  
	System.arraycopy(secondArray, 0, merge, f, s);  
	System.out.println(Arrays.toString(merge));     
	}  
	}  




