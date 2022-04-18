package com.practice65;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] array = {90,81,6,7,5,4,1,2,24,89};
		
		int[] result = bubbleSort(array);
		
		for (int i : result)
		{
			System.out.print(i + " ");
		}
		
	}

	private static int[] bubbleSort(int[] array) 
	{
		int temp = 0;
		for (int i = array.length -1; i >= 0 ; i--) 
		{
			for (int j = 1; j <= i; j++) 
			{
				if (array[j-1] > array[j]) 
				{
					temp = array[j-1];
					array[j-1] = array[j];
					
					array[j] = temp;
					
				}
				
			}
			
			
		}
		
		
		return array;
	}

}
