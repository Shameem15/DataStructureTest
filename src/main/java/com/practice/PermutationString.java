
/*for explaination given in below link
https://www.javatpoint.com/program-to-find-all-permutations-of-a-string
*/
package com.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class PermutationString {
	
 static	Set<String> output = new LinkedHashSet<String>();
	
	public static void main(String[] args) 
	{
		
		String str = "ABCC"; 
        int n = str.length(); 
        PermutationString permutation = new PermutationString(); 
        permutation.permute(str, 0, n - 1); 
        System.out.println(output);
		
	}
	
	
	 private void permute(String str, int l, int r) 
	    { 
	        if (l == r) 
	        {
	            System.out.println(str); 
	            output.add(str);
	        }
	        else { 
	            for (int i = l; i <= r; i++) { 
	                str = swap(str, l, i); 
	                permute(str, l + 1, r); 
	                str = swap(str, l, i); 
	            } 
	        } 
	    }

	  public String swap(String a, int i, int j) 
	    { 
	        char temp; 
	        char[] charArray = a.toCharArray(); 
	        temp = charArray[i]; 
	        charArray[i] = charArray[j]; 
	        charArray[j] = temp; 
	        return String.valueOf(charArray); 
	    }

}
