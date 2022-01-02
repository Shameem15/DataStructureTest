package com.practice;

public class PrimeNumber {
	
	public static void main(String[] args) 
	{
		for (int i = 2; i <= 100; i++) 
		{
			printPrimenumber(i);
		}
		
	}

	private static void printPrimenumber(int n) 
	{
		int i ;
		for (i = 1; i < n; i++) 
		{
			if (i*i > n) 
			{
				break;
			}
		}
		
		for (int j = 2; j < i; j++) 
		{
			if (n%j == 0) 
			{
				//break;
				return;
				// not prime number
			}
		}
		
		System.out.print(n + " ");
		
	}

}
