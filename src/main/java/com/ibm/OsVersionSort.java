package com.ibm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OsVersionSort {
	
	private static final String OS_VERSION_SPLIT = "\\.";
	
	private int indexOflatestList = 0;
	private boolean isGreaterOsVersion = false;
	private String latestOsVersion = "0";
	
	private List<Map<String, Object>> getMaps() {
		Map<String, Object> map1 = new HashMap<>();
		map1.put("ProductKey", "MSU_UPDATE_20G80_patch_11.5.1");
		map1.put("HumanReadableName", "macOS Big Sur 11.5.1");
		map1.put("Version", "11.5.1");
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("ProductKey", "MSU_UPDATE_20G71_patch_11.5");
		map2.put("HumanReadableName", "macOS Big Sur 11.5");
		map2.put("Version", "11.5");
		
		Map<String, Object> map3 = new HashMap<>();
		map3.put("ProductKey", "MSU_UPDATE_20F71_patch_11.4");
		map3.put("HumanReadableName", "macOS Big Sur 11.4");
		map3.put("Version", "11.6");
		
		Map<String, Object> map4 = new HashMap<>();
		map4.put("ProductKey", "MSU_UPDATE_20E241_patch_11.3.1");
		map4.put("HumanReadableName", "macOS Big Sur 11.3.1");
		map4.put("Version", "11.6.1");
		
		Map<String, Object> map5 = new HashMap<>();
		map5.put("ProductKey", "071-57332");
		map5.put("HumanReadableName", "XProtectPlistConfigData");
		map5.put("Version", "2149");
		
		Map<String, Object> map6 = new HashMap<>();
		map6.put("ProductKey", "071-57333");
		map6.put("HumanReadableName", "XProtectPlistConfigData");
		map6.put("Version", "1.81");
		
		
		List<Map<String, Object>> updates = new ArrayList<>();
		updates.add(map1);
		updates.add(map2);
		updates.add(map3);
		updates.add(map4);
		updates.add(map5);
		updates.add(map6);
		return updates;
	}
	
	public void process() throws Exception {
		List<Map<String, Object>> updates = getMaps();
		try {
			for (int i = 0; i < updates.size(); i++) {
				System.out.println("Updates available for product key : " + updates.get(i).get("ProductKey").toString()
						+ ", human readable name :" + updates.get(i).get("HumanReadableName").toString()
						+ " and Version: " + updates.get(i).get("Version").toString());
				if (updates.get(i).get("HumanReadableName").toString().startsWith("macOS")) {
					updateIndexOfList(updates, i);
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("latestOsVersion: " + latestOsVersion + " indexOfLatestOSupdate: " + indexOflatestList);
		System.out.println("Latest map: " + updates.get(indexOflatestList));
	}
	
	private void updateIndexOfList(List<Map<String, Object>> updates, int i) {
		isGreaterOsVersion = isOsVersionGreater(updates.get(i).get("Version").toString(), latestOsVersion);
		
		if (isGreaterOsVersion) {
			latestOsVersion = updates.get(i).get("Version").toString();
			indexOflatestList = i;
		}
	}
	
	private static boolean isOsVersionGreater(String actualOsVersion, String desiredOsVersion) {
		if (actualOsVersion == null || desiredOsVersion == null) {
			return false;
		}
		String[] actualVersionNums = actualOsVersion.split(OS_VERSION_SPLIT);
		String[] desiredVersionNums = desiredOsVersion.split(OS_VERSION_SPLIT);
		
		int sizeToCompare = actualVersionNums.length > desiredVersionNums.length ? desiredVersionNums.length : actualVersionNums.length;
		for (int i = 0; i < sizeToCompare; i++) {
			
			int actual = getOsVersionIndex(actualVersionNums, i);
			int osVersion = getOsVersionIndex(desiredVersionNums, i);
			if (actual < osVersion) {
				return false;
			} else if (actual == osVersion) {
				continue;
			}
			return true;
		}
		if (actualVersionNums.length < desiredVersionNums.length) {
			return false;
		}
		return true;
	}
	
	private static int getOsVersionIndex(String[] osVersion, int index) {
		return Integer.parseInt(osVersion[index]);
	}
	
	private String getAvailableUpdateDetails(String availableUpdateDetails, String version) {
		boolean hasVersion = availableUpdateDetails.contains(version);
		System.out.println("hasVersion: " + hasVersion);
		if (hasVersion) {
			return availableUpdateDetails;
		} else {
			return availableUpdateDetails + " " + version;
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		OsVersionSort ins = new OsVersionSort();
		//ins.process();
		
		AppleOsUpdateModel appleOsUpdateResponseModel = new AppleOsUpdateModel();
		appleOsUpdateResponseModel.setDeviceId(123L);
		appleOsUpdateResponseModel.setOrganizationId(456L);
		appleOsUpdateResponseModel.setAvailableUpdateDetails("macOS Big Sur 11.4");
		appleOsUpdateResponseModel.setOsProductKey("MSU_UPDATE_20F71_patch_11.4");
		int index = ins.getUpdateIndex(123,234, ins.getMaps(), appleOsUpdateResponseModel, 0);
		//String availableUpdateDetails = ins.getAvailableUpdateDetails("macOS Big Sur 11.4", "11.4");
		//System.out.println("availableUpdateDetails: " + availableUpdateDetails);
		System.out.println("index: " + index);
	}
	
	private int getUpdateIndex(long deviceId, long orgId, List<Map<String, Object>> statusList, AppleOsUpdateModel appleOsUpdateModel, int index) {
		try {
			System.out.println("Size: " + statusList.size());
			for (int i = 0; i < statusList.size(); i++) {
				System.out.println("OS Updates status for deviceId/orgId : with product key :  and Status : " + deviceId + orgId +
						statusList.get(i).get("ProductKey").toString());
				if (statusList.get(i).get("ProductKey").toString().equals(appleOsUpdateModel.getOsProductKey())) {
					index = i;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("While getting index for os update status for deviceId/orgId, :{}/{}" + deviceId + orgId + e);
		}
		return index;
	}
}
