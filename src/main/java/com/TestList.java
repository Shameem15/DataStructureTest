package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestList {
	private static final String PENDING_STATUS = "1";
	private static final String INCORRECT_PASSWORD = "2";
	private static final String NOT_ENTER_PASSWORD = "3";
	private static final String COMPLETED = "4";
	private static final Map<String, String> STATUS_MESSAGE = new HashMap<String, String>();
	
	private static final Logger logger = LoggerFactory.getLogger(TestList.class);
	private static final String REGEX = "\\%(.*?)\\%";
	
	static {
		STATUS_MESSAGE.put(PENDING_STATUS, "get(UiConstants.MACOS_REGENERATE_FILEVAULT_WAITING_USER_APPROVAL");
		STATUS_MESSAGE.put(INCORRECT_PASSWORD, "get(UiConstants.MACOS_REGENERATE_FILEVAULT_INCORRECT_PASSWORD");
		STATUS_MESSAGE.put(NOT_ENTER_PASSWORD, "get(UiConstants.MACOS_REGENERATE_FILEVAULT_NOT_ENTER_PASSWORD");
		STATUS_MESSAGE.put(COMPLETED, "");
	}
	public static void main(String[] args)
	{
		logger.warn("shdahskjdkhjs fafasfasf");
		// creating an Empty Integer List
		List<String> arr = new ArrayList<String>();
		
		// using add() to initialize values
		// [1, 2, 3, 4]
		arr.add("com.maas360.mdm.ios.policies");
		arr.add("com.maas360.mdm.ios.policies.applicationaccess");
		arr.add("com.maas360.mdm.ios.provision");
		arr.add("com.maas360.mdm.mac.policies.energysaver");
		arr.add("com.maas360.mdm.mac.policies.filevault2");
		

		boolean ans = arr.contains("com.maas360.mdm.mac.policies.filevault2");
		/*System.out.println("ans: " + ans);
		for (String vaule:arr) {
			System.out.println(vaule.contains("com.maas360.mdm.mac.policies.filevault2"));
		}*/
		
		String descriptionText = "%MACOS_REGENERATE_FILEVAULT_NOT_ENTER_PASSWORD%";
		String out = descriptionText.replaceFirst("\\%(.*?)\\%", "Localized error text");
		System.out.println("Replace First string: " + out);
		
		String localizedKey = getLocalizedKey(descriptionText, REGEX);
		System.out.println(descriptionText.replaceFirst(REGEX, "Localized error text").trim());
		
		String supportedOsversions="12.0,11.0,10.15,10.14,10.13,10.12,10.11,10.10,10.9,10.8,10.7";
		List<String> listOsVersion = Arrays.asList(supportedOsversions.split(","));
		
		System.out.println("listOsVersion: " + listOsVersion);
		
	}
	
	private static String getLocalizedKey(String actionDesc, String regex) {
		String localizedKey ="";
		Matcher matcher = Pattern.compile(regex).matcher(actionDesc);
		if(matcher.find()) {
			System.out.println(matcher.group(1));
			localizedKey = matcher.group(1);
		}
		return localizedKey;
	}
	
}
