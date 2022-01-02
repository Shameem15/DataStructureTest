package com.practice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NoOfStringRepeated {
	
	static Map<String, Integer> map = new LinkedHashMap<String, Integer>();
	
	public static void process(String[] word) {
		
		// Map<String, Integer> map = new HashMap<>();
		
		for (String string : word) {
			if (map.containsKey(string)) {
				map.put(string, map.get(string) + 1);
			} else
				map.put(string, 1);
		}
	}
	
	public static void main(String[] args) {
		
		String[] word = { "ram", "mohan", "sita", "ram", "sham", "sumit", "sita" };
		
		process(word);
		
		List<String> list = new ArrayList<String>();
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			
			if (entry.getValue() > 1) {
				list.add(entry.getKey());
			}
		}
		
		System.out.println(list);
	}
}
