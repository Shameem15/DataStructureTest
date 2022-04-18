package aa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s1 = "cdee";
		String s2 = "dcff";

		checkByASCII(s1, s2);
	}
	
	
	private static void checkByASCII(String s1, String s2) {
		int size_of_array = 256;
		int count = 0;
		
		char str1[] = s1.toCharArray();
		char str2[] = s2.toCharArray();
		
		int count1[] = new int[size_of_array];
		Arrays.fill(count1, 0);
		int count2[] = new int[size_of_array];
		Arrays.fill(count2, 0);
		
		for (int i = 0; i < str1.length; i++) {
			count1[str1[i]]++;
		}
		
		for (int i = 0; i < str2.length; i++) {
			count2[str2[i]]++;
		}
		
		for (int i = 0; i < size_of_array; i++) {
			if (count1[i] == count2[i]) {
				count++;
			}
		}
		
		int totalCount = size_of_array - count;
		System.out.println("totalCount :" + totalCount);
	}
}




