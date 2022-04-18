package com.ibm;

import java.util.HashMap;
import java.util.Map;

public class OSXResponseUtils {
	
	private static final String ERR_NOT_ENTER_PWD = "10001";
	private static final String ERR_INCORRECT_PWD = "10002";
	
	private static final Map<String, String> MAP_OF_ERROR_CODE_TO_ERROR_MESSAGE;
	
	static {
		MAP_OF_ERROR_CODE_TO_ERROR_MESSAGE = new HashMap<String, String>();
		//MAP_OF_ERROR_CODE_TO_ERROR_MESSAGE.put(ERR_NOT_ENTER_PWD, DeviceUIUtils.getLocalizedValueByKey("MACOS_REGENERATE_FILEVAULT_NOT_ENTER_PASSWORD", null));
		//MAP_OF_ERROR_CODE_TO_ERROR_MESSAGE.put(ERR_INCORRECT_PWD, DeviceUIUtils.getLocalizedValueByKey("MACOS_REGENERATE_FILEVAULT_INCORRECT_PASSWORD", null));
		
		MAP_OF_ERROR_CODE_TO_ERROR_MESSAGE.put(ERR_NOT_ENTER_PWD, "Not enter");
		MAP_OF_ERROR_CODE_TO_ERROR_MESSAGE.put(ERR_INCORRECT_PWD, "Incorrect pwd");
	}
	
	public String getStatusMessage(String statusCode) {
		return MAP_OF_ERROR_CODE_TO_ERROR_MESSAGE.get(statusCode);
	}
	
	
	public static void main(String[] args) {
		OSXResponseUtils ins = new OSXResponseUtils();
		
		System.out.println("# checking " + ins.getStatusMessage(""));
		
		
		boolean isFileVaultEscrew = false;
		boolean isFileVaultEnabled = false;
		boolean isRecoveryKeyAvailable = false;
		if (isFileVaultEscrew) {
			isFileVaultEnabled = true;
			if (isFileVaultEnabled){
				isRecoveryKeyAvailable = true;
			}
		}
		
		System.out.println(isFileVaultEscrew + " "+ isFileVaultEnabled+ " " + isRecoveryKeyAvailable);
	}
	
}
