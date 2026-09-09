package smartHome;

public class SmartHome {
    private String homeName;
    private boolean smartLighting;
    private int securityCameraCount;
    private boolean smartLock;
    private double targetTemperature;
    private boolean alarmSystem;
    private String voiceAssistant;
    private boolean energyMonitoring;

    public SmartHome(Boolean energyMonitoring, String voiceAssistant, Boolean alarmSystem, Double targetTemperature, Boolean smartLock, int securityCameraCount, Boolean smartLighting, String homeName) {
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
