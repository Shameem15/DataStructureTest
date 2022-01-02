package com.practice;

public class PalindromeString {
	
	
	public static void main(String[] args) 
	{
		
		String str = "level";
		
		if(isPalindromeString(str))
		{
			 System.out.println( str + " is a palindrome");
		}
		else
		{
			 System.out.println(str + " not a palindrome");
		}
		
	}

	private static boolean isPalindromeString(String str)
	{
		int strLength = str.length();
		
		for (int i = 0; i <= (strLength-1)/2; i++) 
		{
			if (str.charAt(i)!=str.charAt(strLength-1-i)) 
			{
				return false;
			}
		}
		
		return true;
	}

}
