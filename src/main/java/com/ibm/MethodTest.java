package com.ibm;

public class MethodTest {
	
	private static final String OS_VERSION_SPLIT = "\\.";
	
	
	public static void main(String[] args) {
		
		boolean result = isOsVersionGreaterOrEqual("11", "10.15");
		System.out.println("result: " +result);
	}
	
	
	private static boolean isOsVersionGreaterOrEqual(String actualOsVersion, String desiredOsVersion) {
		if(actualOsVersion == null || desiredOsVersion == null) {
			return false;
		}
		String[] actualVersionNums = actualOsVersion.split(OS_VERSION_SPLIT);
		String[] desiredVersionNums = desiredOsVersion.split(OS_VERSION_SPLIT);
		int sizeToCompare = actualVersionNums.length > desiredVersionNums.length ? desiredVersionNums.length: actualVersionNums.length;
		for(int i = 0 ; i < sizeToCompare; i++)
		{
				int actual = getOsVersionIndex(actualVersionNums, i);
				int osVersion = getOsVersionIndex(desiredVersionNums, i);
				if (actual < osVersion) {
					return false;
				} else if (actual == osVersion) {
					continue;
				}
				return true;
		}
		if(actualVersionNums.length < desiredVersionNums.length)
		{
			return false;
		}
		return true;
	}
	
	private static int getOsVersionIndex(String[] osVersion, int  index)
	{
		return Integer.parseInt(osVersion[index]);
	}
	
}
