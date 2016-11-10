package dev.starlai.archi.data.local;

/**
 * Created by izayoi on 11/9/2016.
 */

public class Settings {
    private String ipAddress;
    private String portNumber;
    private String passwordSetting;


    public Settings(String ipAddress, String portNumber, String passwordSetting) {
        this.ipAddress = ipAddress;
        this.portNumber = portNumber;
        this.passwordSetting = passwordSetting;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(String portNumber) {
        this.portNumber = portNumber;
    }

    public String getPasswordSetting() {
        return passwordSetting;
    }

    public void setPasswordSetting(String passwordSetting) {
        this.passwordSetting = passwordSetting;
    }
}
