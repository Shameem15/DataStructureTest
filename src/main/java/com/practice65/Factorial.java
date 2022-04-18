package com.practice65;

public class Factorial {
	
	/*public static int fact(int n) 
	{
		int f=n;
		while(n>1)
		{
			f=f*(n-1) ;
			
			n--;
		}
	return f;
	}*/
	
	public static int fact(int n) 
	{
		if (n == 1)
			return 1;
		else
			return n*fact(n-1);
	}
	
	public static void main(String a[]) 
	{
		int number = 4;
		
		System.out.println(fact(number));
	}

}
