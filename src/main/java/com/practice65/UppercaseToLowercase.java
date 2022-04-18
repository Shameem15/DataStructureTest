package com.practice65;

public class UppercaseToLowercase {
	
	public static void main(String[] args) {
		
		String str = "SHAMEEM";
		
		convertUppercaseToLowercase(str);
		
		//System.out.println("\n" + (int) Math.sqrt(11));
		
	}

	private static void convertUppercaseToLowercase(String str) 
	{
		char[] ch = str.toCharArray();
		
		for (int c : ch) 
		{
			if (c > 64 && c < 91) 
			{
				c = c+32;
			  	System.out.print((char)c);
			}
			
		}
		
	}

}
