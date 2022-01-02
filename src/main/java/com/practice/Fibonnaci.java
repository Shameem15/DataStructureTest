package com.practice;

public class Fibonnaci {
	
	public static void main(String[] args) 
	{
		int t1=1,t2=1, t3;
		
		System.out.print(t1 + " " + t2 + " ");
		
		for (int i = 3; i <= 15; i++) 
		{
			t3 = t1 + t2 ;
			
			System.out.print(t3 + " ");
			
			t1 = t2;
			t2 = t3;
		}
		
	}

}
