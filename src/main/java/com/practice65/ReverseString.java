package com.practice65;

public class ReverseString {
	
	
	public static void main(String[] args) {
		
		String str = "Shameem";
		
	String reverse = reverseString(str);
	
	System.out.println(reverse);
		
	}

	private static String reverseString(String str) {
		
		String rev = new String(); 
		//char[] ch = str.toCharArray();
		
		for (int i = str.length() -1; i >= 0; i--)
		{
			//rev = rev + ch[i];
			rev = rev + str.charAt(i);
		}
		
		return rev;
	}

}
