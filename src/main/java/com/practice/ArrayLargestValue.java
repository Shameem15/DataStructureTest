package com.practice;

public class ArrayLargestValue {
	
	public static void main(String[] args) {
		
		int[] array = {1,7,91,12,57};
		
		int result = maxValue(array);
		
		System.out.println("Max value of array is: " + result);
	}

	private static int maxValue(int[] array) {
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i]>max) 
			{
				max = array[i];
			}
			
		}
		
		return max;
	}

}
