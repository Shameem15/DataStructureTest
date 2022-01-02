package com.practice;

public class Armstrong {
	
	public static void main(String[] args) {
		
		int number = 153;
		boolean ind = checkArmstrong(number);
		
		System.out.println(ind);
	}

	private static boolean checkArmstrong(int number) 
	{
		boolean ind = false;
		
		int temp = number;
		int r = 0, sum=0;
		
		while (temp>0) {
			r = temp % 10;
			temp = temp / 10;
			sum = sum + r * r * r;
		}
		
		if (sum == number)
		{
			ind = true;
		}
		return ind ;
	}

}
