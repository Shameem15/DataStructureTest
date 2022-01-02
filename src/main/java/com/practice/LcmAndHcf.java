package com.practice;

public class LcmAndHcf {
	
	static int a=10, b=21, c=30, lcm=0, hcf=0;
	
	public static void printLcm()
	{
		lcm = getMax();
		while(true)
		{
			if(lcm%a == 0 && lcm%b == 0 && lcm%c == 0)
			{
				System.out.println("LCM of " + a + ", " + b + " and " + c + " is " + lcm );
				break;
			}
			lcm++;
		}
	}
	
	public static void printHcf()
	{
		int lastindex = getMin();
		
		for (int i = lastindex; i >= 1; i--) 
		{
			if (a%i == 0 && b%i == 0 && c%i == 0) 
			{
				hcf = i;
				break;
			}
			else
				hcf = 1;
		}
		
		System.out.println("HCF of " + a + ", " + b + " and " + c + " is " + hcf );
		
	}
	
	public static int getMin() 
	{
		int minvalue;
		if(a>b)
		{
			if(c>b)
			{
				minvalue = b;
			}
			else
			{
				minvalue = c;
			}
		}
		else
		{
			if(c>a)
			{
				minvalue = a;
			}
			else
			{
				minvalue = c;
			}
		}
		
		return minvalue;
	}
	
	public static int getMax() 
	{
		int maxvalue;
		if(a>b)
		{
			if(c>a)
			{
				maxvalue = c;
			}
			else
			{
				maxvalue = a;
			}
		}
		else
		{
			if(c>b)
			{
				maxvalue = c;
			}
			else
			{
				maxvalue = b;
			}
		}
		
		return maxvalue;
	}
	
	public static void main(String[] args) 
	{
		//System.out.println(getMin());
		printLcm();
		printHcf();
		
	}

}
