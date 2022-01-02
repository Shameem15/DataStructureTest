package com;

import java.util.HashMap;
import java.util.Map;

public class MainTest {
	
	String Value = "value";
	public static void main(String[] args)
	{
		Map<String, Object> mapInstances = new HashMap<>();
		mapInstances.put("value", null);
		
		Map<String, Object> restrictedBoolMap = new HashMap<>();
		restrictedBoolMap.put("va", mapInstances);
		
		MainTest instance = new MainTest();
		try {
			//instance.getRestrictedBool(restrictedBoolMap, "va");
			Boolean res = instance.getRestrictedBoolUpdated(restrictedBoolMap, "va");
			
			System.out.println(res);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	private Boolean getRestrictedBool(Map<String, Object> restrictedBoolMap, String key)
	{
		Map<String, Object> restrictionMap = (Map<String, Object>)restrictedBoolMap.get(key);
		Boolean notRestricted = true;
			if (restrictionMap != null)
				notRestricted = (Boolean)restrictionMap.get(Value);
		return notRestricted;
	}
	
	
	private Boolean getRestrictedBoolUpdated(Map<String, Object> restrictedBoolMap, String key)
	{
		Boolean notRestricted = true;
		if (restrictedBoolMap != null){
			Map<String, Object> restrictionMap = (Map<String, Object>)restrictedBoolMap.get(key);
			if (restrictionMap != null)
				notRestricted = (Boolean)restrictionMap.get(Value);
		}
		return notRestricted;
	}
}
