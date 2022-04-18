package com.practice65;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SquareRoot {
	
	private static DecimalFormat df2 = new DecimalFormat("#.#");
	public static void main(String[] args) {
		
		int num = 17 ;
		
		//double squareRoot = SquareRoot(num);
		
		System.out.println("squreRoot is : " + df2.format(squareRoot(num)));
		System.out.println("___________________________________");
		System.out.println("squreRoot is : " + df2.format(squareRootRegex(num)));
	}

	private static double squareRoot(int num) {
		
		double i ;
		
		for (i = 0.01; i < num;) 
		{
			  //System.out.println((double)(i*i));
			
			if( (float)(i*i)/num == 0.9 || (float)(i*i)/num == 1.0 )
			{
				//System.out.println((float)(i*i)/num );
				break;
			}
			//System.out.println( df2.format((float)(i*i)/num ));
			
			i=i+0.01;
		}
		
		
		return i;
	}
	
	
private static double squareRootRegex(int num) {
		
		double i ;
		
		String regex = "^1.00|^0.99";
		Pattern pattern = Pattern.compile(regex);
		
		
		for (i = 0.01; i < num; i=i+0.01) 
		{
			String input = (float)(i*i)/num + "";
			
			Matcher matcher = pattern.matcher(input);
			
			//System.out.println( input );
			
			if(matcher.find() )
			{
				System.out.println((float)(i*i)/num );
				break;
			}
			
			
		}
		
		return i;
	}

}
