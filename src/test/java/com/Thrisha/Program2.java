package com.Thrisha;

public class Program2 
{
	public static void main(String[] args)
	{
		String arr[] = {"Chennai", "Bangalore", "Mysore", "Chennai"};
		boolean temp = false;
		
		int len = arr.length;
		System.out.println("Length if the array: "+ len);
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("Duplicate element has been found: " +arr[i]);
					temp = true;
					
				}
			}
			
		}
		if(temp == false)
		{
			System.out.println("Duplicate element not found");
		}
		
	}

}
