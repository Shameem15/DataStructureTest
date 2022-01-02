package com.practice;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int num = 122 ;
		
		checkPalindrome(num);
		
	}

	private static void checkPalindrome(int num)
	{
		int digit = num, total = 0, r=0;
		
		while (digit> 0) 
		{
			r = digit % 10;
			digit = digit / 10;
			total = total * 10 + r;
		}
		if(total == num)
		{
			System.out.println("Its palindrome");
		}
		else
			System.out.println("Tts not palindrome");
	}

}
