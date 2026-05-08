package com.Thrisha;

public class Program1
{
	public static void main(String[] args)
	{
		int arr[] = {34, 8, 78, 9, 88};
		int temp = 0;
		
		int len = arr.length;
		System.out.println("Length of the Array: " + len);
		System.out.println("---------------------");
		
		System.out.println("\nOriginal Array");
		for (int i = 0; i <= len-1; i++) 
		{
			System.out.println(arr[i] + " ");
		}
		
		System.out.println("---------------------");
		
		System.out.println("Ascending order: ");
		
		for (int i = 0; i <=len-1; i++)
		{
			for (int j =i+1; j <len; j++)
			{
				if(arr[i]> arr[j])
				{
					temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
			
		}
		System.out.println("Sorted Array");
		
		for (int i = 0; i <=len-1; i++)
		{
			System.out.println(arr[i] + " ");
			
		}
	}

}
