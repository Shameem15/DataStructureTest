package com.ibm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfList {
	
		public static void main(String[] args)
		{
			// creating an Empty Integer List
			List<String> arr = new ArrayList<String>();
			arr.add("com.maas360.mdm.ios.policies");
			arr.add("com.maas360.mdm.ios.policies.applicationaccess");
			arr.add("com.maas360.mdm.ios.provision");
			arr.add("com.maas360.mdm.mac.policies.energysaver");
			arr.add("com.maas360.mdm.mac.policies.filevault2");
			
			
			List<String> arr1 = new ArrayList<String>();
			arr1.add("79178932");
			arr1.add("MaaS360 MDM Profile");
			arr1.add("com.maas360.mdm.ios.policies");
			
			List<String> arr2 = new ArrayList<String>();
			arr2.add("79178932");
			arr2.add("MaaS360 MDM Profile");
			arr2.add("com.maas360.mdm.mac.policies.energysaver");
			
			List<String> arr3 = new ArrayList<String>();
			arr3.add("79178932");
			arr3.add("MaaS360 MDM Profile");
			arr3.add("com.maas360.mdm.mac.policies.filevault2");
			
			
			List<List<String>> result = new ArrayList<>();
			result.add(arr1);
			result.add(arr2);
			result.add(arr3);
			
			boolean ans = result.contains("com.maas360.mdm.mac.policies.filevault2");
			System.out.println("ans: " + ans);
			
			for (List<String> profile:  result){
				ans = profile.contains("com.maas360.mdm.mac.policies.filevault2");
			}
			System.out.println("ans: " + ans);
			
			String str = "true, FileVault, Encryption, Apple Inc., , , , Macintosh HD, Preboot, Update, Macintosh HD - Data, , Encryption Complete, 11.2.3";
			List<String> list1 = Arrays.asList(str.split(","));
			List<String> list = Arrays.asList(new String[]{"true", "FileVault", "Encryption", "Apple Inc.", "", "", "", "Macintosh HD", "Preboot", "Update", "Macintosh HD - Data", "", "Encryption Complete", "11.2.3"});
			
			System.out.println(list1.get(12) + list1.size());
			System.out.println(list.get(12) + list.size());
	}
}
