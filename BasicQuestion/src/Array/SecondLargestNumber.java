package Array;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args)   
	{  
	//creating an instance of an array  
	int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65}; 
	
//	for (int i = 0; i < arr.length; i++)   
//	{  
//	for (int j = i + 1; j < arr.length; j++)   
//	{  
//	int tmp = 0;  
//	if (arr[i] > arr[j])   
//	{  
//	tmp = arr[i];  
//	arr[i] = arr[j];  
//	arr[j] = tmp;  
//	}  
//	}  
//	//prints the sorted element of the array  
////	System.out.println(arr[i]);  
//	}
	//System.out.print(arr[arr.length-2]);
	
	//2.Way with Arrays class
	Arrays.sort(arr);
	for(int i:arr)
	System.out.print(i+" ");
	System.out.print(arr[arr.length-2]);
	} 
	}  