package com.ibm;

public class InstallAgentPPPCInfo {
    private String osVersion;
    private String payload;

    public InstallAgentPPPCInfo(String osVersion, String payload) {
        this.osVersion = osVersion;
        this.payload = payload;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}
