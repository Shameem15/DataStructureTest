package com.practice;

public class CountNumberOfChar {
	
	public static void main(String[] args) {
		
		String str = "Alive is awesome";
		
		System.out.println(countChar(str));
		
	}

	private static int countChar(String str) 
	{
		int count =0;
		
		for (int i = 0; i < str.length(); i++) 
		{
			if (!(str.charAt(i) == ' ')) 
			{
				count++;
			}
		}
		
		return count;
	}

}
