package com.Arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateFirstWord 
{

	static void countWords(String a[], String s) 
	{
		System.out.println("First duplicate word is: ");
		String wordUpdated = s;
		for (int i = 0; i < a.length; i++) 
		{
			wordUpdated = wordUpdated.substring(a[i].length()).trim();

			// System.out.println("Word:" + " " + a[i]);
			// System.out.println("SubString:" + " " + wordUpdated);

			String regex = "\\s" + a[i] + "\\s";

			Matcher matcher = Pattern.compile(regex).matcher(wordUpdated);
			boolean ind = matcher.find();

			if (ind) 
			{
				System.out.println("repeated First Word:" + " " + a[i]);
				break;
			}

		}

	}

	public static void main(String args[]) 
	{
		String s = "Sid ashish been saying that there that ashish there";
		String[] a = s.split("\\s");

		countWords(a, s);
	}

}
