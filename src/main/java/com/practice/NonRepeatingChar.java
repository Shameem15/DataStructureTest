package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatingChar {
	static Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	
	public static void main(String arg[]) {
		
		String str= "ShameemAkhtarS";
		
		nonRepeatingCharInString(str.toLowerCase());
		
		for (Entry<Character, Integer> entry : map.entrySet()) 
		{
			//System.out.println(entry.getKey() + " " + entry.getValue());
			
			if(((Integer) entry.getValue()) == 1)
			{
				System.out.println(entry.getKey() + " " + entry.getValue());
				break;
			}
				
			
		}

	}

	private static void nonRepeatingCharInString(String str) {

		char [] ch = str.toCharArray();

		for (char c : ch) 
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
		
	}

}
