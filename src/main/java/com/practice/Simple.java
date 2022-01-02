package com.practice;

import java.util.Map;
import java.util.TreeMap;

public class Simple {

	public static void main(String args[]) {
		System.out.println("Hello Java");
		
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		
		
		
		
		 Map<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,null);    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
		
	}

}
