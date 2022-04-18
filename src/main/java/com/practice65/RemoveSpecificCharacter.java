package com.practice65;

public class RemoveSpecificCharacter {
	
	public static void main(String[] args) {
		
		String str = "Alive is awesome";
		String tobeRemove = "alwsr";
		
		System.out.println(removeSpecificChars(str,tobeRemove + tobeRemove.toUpperCase()));
		
	}

	private static String removeSpecificChars(String str, String tobeRemove) 
	{
		char[] orignalChar = str.toCharArray();
		char[] removeChar = tobeRemove.toCharArray();
		char[] result = new char[orignalChar.length];
		int count =0;
		
		boolean [] tempboolean = new boolean[128];
		
		for (int i = 0; i < removeChar.length; i++) 
		{
			tempboolean[removeChar[i]] = true;
		}
		
		for (int i = 0; i < orignalChar.length; i++) 
		{
			if (!tempboolean[orignalChar[i]]) 
			{
				result[count] = orignalChar[i];
				count++;
			}
			
			
		}
		
		return new String(result);
	}

}
