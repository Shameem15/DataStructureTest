package com;

public
class XmlTest {
	
	public static final String KEY_MESSAGE_KEY_STRING = "<key>Message</key>\n<string />\n";
	public static final String KEY_PHONE_NUMBER_KEY_STRING = "<key>PhoneNumber</key>\n<string />\n";
	

	
	public static void main(String[] args) {
		String phoneNo = "";
		String message = "";
		String xml =
				"<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n" +
						"<plist version=\"1.0\">\n" +
						"<dict>\n" +
						"<key>CommandUUID</key>\n" +
						"<string>UDID</string>\n" +
						"<key>Command</key>\n" +
						"<dict>\n" +
						"<key>RequestType</key>\n" +
						"<string>DeviceLock</string>\n" +
						"<key>Message</key>\n" +
						"<string />\n" +
						"<key>PhoneNumber</key>\n" +
						"<string />\n" +
						"</dict>\n" +
						"</dict>\n" +
						"</plist>";
		
		
		
		if(message.trim() == null)
		{
			xml = xml.replaceAll(KEY_MESSAGE_KEY_STRING, "");
		}
		if(phoneNo.trim() == null)
		{
			xml = xml.replaceAll(KEY_PHONE_NUMBER_KEY_STRING, "");
		}
		
		if (message.trim() == null && phoneNo.trim() == null)
		{
			xml = xml.replaceAll(KEY_MESSAGE_KEY_STRING, "");
			xml = xml.replaceAll(KEY_PHONE_NUMBER_KEY_STRING, "");
		}
		

		
		System.out.println(xml);
		
	}
}
