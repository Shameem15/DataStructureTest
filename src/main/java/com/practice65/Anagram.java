package com.practice65;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s1 = "nowas";
		String s2 = "ownsa";
		
		if (checkAnagram(s1,s2))
		{
			System.out.println("Its Anagram ");
		}
		else {
			System.out.println("Its not Anagram ");
		}

		//2nd method

		String result = areAnagram(s1.toCharArray(), s2.toCharArray())? "Its Anagram" : "Its not Anagram";
		System.out.println(result);
	}

	private static boolean checkAnagram(String s1, String s2) {
		boolean ind = false;
		boolean matched = false;
		
		if(s1.length() == s2.length())
		{
			for (int i = 0; i < s1.length(); i++) 
			{
				for (int j = 0; j < s2.length(); j++) 
				{
					if(s1.charAt(i) == s2.charAt(j))
					{
						matched = true;
					}
				}
				
				if(matched == false)
				{
					return false;
				}
				else
					matched = false;
			}
			
			ind = true;
		}
		
		return ind;
	}

	
	 static int NO_OF_CHARS = 256; 
	  /* function to check whether two strings 
    are anagram of each other */
    static boolean areAnagram(char str1[], char str2[]) 
    { 
        // Create 2 count arrays and initialize 
        // all values as 0 
        int count1[] = new int[NO_OF_CHARS]; 
        Arrays.fill(count1, 0); 
        int count2[] = new int[NO_OF_CHARS]; 
        Arrays.fill(count2, 0); 
        int i; 
  
        // For each character in input strings, 
        // increment count in the corresponding 
        // count array 
        for (i = 0; i < str1.length && i < str2.length; 
             i++) { 
            count1[str1[i]]++; 
            count2[str2[i]]++; 
        } 
  
        // If both strings are of different length. 
        // Removing this condition will make the program 
        // fail for strings like "aaca" and "aca" 
        if (str1.length != str2.length) 
            return false; 
  
        // Compare count arrays 
        for (i = 0; i < NO_OF_CHARS; i++) 
            if (count1[i] != count2[i]) 
                return false; 
  
        return true; 
    } 
	
}
