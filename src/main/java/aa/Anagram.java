package aa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s1 = "cde";
		String s2 = "dcf";
		
		check(s1, s2);
		checkByASCII(s1, s2);
		StringBuffer eligibleDevices = new StringBuffer();
		eligibleDevices.append("1234");
		eligibleDevices.append(",");
		eligibleDevices.append("12345");
		eligibleDevices.append(",");
		eligibleDevices.append("12346");
		eligibleDevices.append(",");
		eligibleDevices.append("12347");
		eligibleDevices.append(",");
		
		
		String listOfDevice = "1234,32323,43434,43434,43434,4434,";
		List<String> devices = Arrays.asList(eligibleDevices.toString().split(","));
		
		System.out.println(devices.size());
		System.out.println(devices);
		for (String device: devices) {
			Long deviceLong = Long.parseLong(device);
			
			System.out.println("deviceLong: " + deviceLong);
		}
	}
	
	private static void check(String s1, String s2) {
		int count = 0;
		int lengthS1 = s1.length();
		int lengthS2 = s2.length();
		Set<Character> common = new HashSet<>();
		
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					count++;
					common.add(s1.charAt(i));
					break;
				}
			}
		}
		
		int setSize = common.size();
		int totalCount = (lengthS1 - setSize) + (lengthS2 - setSize);
		System.out.println("totalCount :" + totalCount);
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




