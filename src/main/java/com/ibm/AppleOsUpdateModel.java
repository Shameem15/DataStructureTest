package com.ibm;

import java.io.Serializable;

/**
 * Created by shameeem on 13/7/21.
 */
public class AppleOsUpdateModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long organizationId;
	private Long deviceId;
	private String osProductKey;
	private String availableUpdateDetails;
	private String acceptedInstallAction;
	private String availableUpdateInfo;
	private String updateStatus;
	private boolean supervised;
	
	public String getAcceptedInstallAction() {
		return acceptedInstallAction;
	}
	
	public void setAcceptedInstallAction(String acceptedInstallAction) {
		this.acceptedInstallAction = acceptedInstallAction;
	}
	
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	
	public Long getOrganizationId() {
		return organizationId;
	}
	
	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}
	
	public Long getDeviceId() {
		return deviceId;
	}
	
	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}
	
	public String getOsProductKey() {
		return osProductKey;
	}
	
	public void setOsProductKey(String osProductKey) {
		this.osProductKey = osProductKey;
	}
	
	public String getAvailableUpdateDetails() {
		return availableUpdateDetails;
	}
	
	public void setAvailableUpdateDetails(String availableUpdateDetails) {
		this.availableUpdateDetails = availableUpdateDetails;
	}
	
	public String getAvailableUpdateInfo() {
		return availableUpdateInfo;
	}
	
	public void setAvailableUpdateInfo(String availableUpdateInfo) {
		this.availableUpdateInfo = availableUpdateInfo;
	}
	
	public String getUpdateStatus() {
		return updateStatus;
	}
	
	public void setUpdateStatus(String updateStatus) {
		this.updateStatus = updateStatus;
	}
	
	public boolean isSupervised() {
		return supervised;
	}
	
	public void setSupervised(boolean supervised) {
		this.supervised = supervised;
	}
	
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("AppleOsUpdateModel{");
		sb.append("organizationId=").append(organizationId);
		sb.append(", deviceId=").append(deviceId);
		sb.append(", osProductKey='").append(osProductKey).append('\'');
		sb.append(", availableUpdateDetails='").append(availableUpdateDetails).append('\'');
		sb.append(", acceptedInstallAction='").append(acceptedInstallAction).append('\'');
		sb.append(", availableUpdateInfo='").append(availableUpdateInfo).append('\'');
		sb.append(", updateStatus='").append(updateStatus).append('\'');
		sb.append(", supervised=").append(supervised);
		sb.append('}');
		return sb.toString();
	}
}
