package com.practice65;

public class IntersectionOfTwoArrays {

	static int index = 0;
	public static void main(String[] args) {

		int[] array1 = { 0, 1, 2, 3, 4, 5 };
		int[] array2 = { 4, 7, 8, 9, 10, 1 };

		int[] intersection = getIntersectionOfArrays(array1, array2);
		//System.out.println(index + " index");
		for (int i=0 ; i<index; i++ ) 
		{
			System.out.println(intersection[i]);
			
		}
	}

	private static int[] getIntersectionOfArrays(int[] array1, int[] array2) {

		int[] intersection = new int[array1.length];

		for (int i : array1) {
			for (int j : array2) {
				if (i == j) {
					intersection[index] = i;
					index++;
				}

			}
		}
		return intersection;
	}

}
