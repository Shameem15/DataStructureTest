package com.ibm;


public class testBooleanValueOf {
	
	public static void main(String[] args) {
		
		// create 2 Boolean objects b1, b2
		Boolean b1, b2;
		
		// create 2 String's and assign values
		String s1 = null;
		String s2 = "false";
		
		/**
		 *  static method is called using class name 
		 *  assign result of valueOf method on s1, s2 to b1, b2
		 */
		b1 = Boolean.valueOf(s1);
		b2 = Boolean.valueOf(s2);
		
		String str1 = "Boolean instance of string " + s1 + " is "  + b1;
		String str2 = "Boolean instance of string " + s2 + " is "  + b2;
		
		// print b1, b2 values
		System.out.println( str1 );
		System.out.println( str2 );
		
		String name = null;
		
		System.out.println(name.isEmpty());
		
		
	}
}
