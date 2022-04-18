package com.practice65;

import java.util.HashSet;

public class VowelsCount {
	
	public static void main(String[] args) 
	{
		String str ="Alive is awesome";
		
		System.out.println(vowelsCount(str.toLowerCase()));
	}

	private static int vowelsCount(String str) {
		
		int count = 0;
		char[] vowels = {'a','e' ,'i' ,'o' ,'u' };
		
		char[] charArray = str.toCharArray();
		HashSet<Character> vowelsSet = new HashSet<Character>(); 
		vowelsSet.add('a');
		vowelsSet.add('e');
		vowelsSet.add('i');
		vowelsSet.add('o');
		vowelsSet.add('u');
		
		for (char ch : charArray) 
		{
			if (vowelsSet.contains(ch)) 
			{
				count++;
			}
			
		}
		
		
		return count;
	}

}
