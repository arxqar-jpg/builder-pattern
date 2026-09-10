package smartHome;

public class SmartHome {
    private final String homeName;
    private final boolean smartLighting;
    private final int securityCameraCount;
    private final boolean smartLock;
    private final double targetTemperature;
    private final boolean alarmSystem;
    private final String voiceAssistant;
    private final boolean energyMonitoring;

    SmartHome(boolean energyMonitoring, String voiceAssistant, boolean alarmSystem, double targetTemperature, boolean smartLock, int securityCameraCount, boolean smartLighting, String homeName) {
        this.energyMonitoring = energyMonitoring;
        this.voiceAssistant = voiceAssistant;
        this.alarmSystem = alarmSystem;
        this.targetTemperature = targetTemperature;
        this.smartLock = smartLock;
        this.securityCameraCount = securityCameraCount;
        this.smartLighting = smartLighting;
        this.homeName = homeName;
    }

    public String getHomeName() {
        return homeName;
    }

    public boolean isSmartLighting() {
        return smartLighting;
    }

    public int getSecurityCameraCount() {
        return securityCameraCount;
    }

    public boolean isSmartLock() {
        return smartLock;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public boolean isAlarmSystem() {
        return alarmSystem;
    }

    public String getVoiceAssistant() {
        return voiceAssistant;
    }

    public boolean isEnergyMonitoring() {
        return energyMonitoring;
    }

    @Override
    public String toString() {
        return "SmartHome{" +
                "homeName='" + homeName + '\'' +
                ", smartLighting=" + smartLighting +
                ", securityCameraCount=" + securityCameraCount +
                ", smartLock=" + smartLock +
                ", targetTemperature=" + targetTemperature +
                ", alarmSystem=" + alarmSystem +
                ", voiceAssistant='" + voiceAssistant + '\'' +
                ", energyMonitoring=" + energyMonitoring +
                '}';
    }

}
