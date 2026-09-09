package smartHome;

public class Builder {
    private String homeName;
    private boolean smartLighting;
    private int securityCameraCount;
    private boolean smartLock;
    private double targetTemperature;
    private boolean alarmSystem;
    private String voiceAssistant;
    private boolean energyMonitoring;

    public Builder setHomeName(String homeName) {
        this.homeName = homeName;
        return this;
    }

    public Builder setSmartLighting(boolean smartLighting) {
        this.smartLighting = smartLighting;
        return this;
    }

    public Builder setSecurityCameraCount(int securityCameraCount) {
        this.securityCameraCount = securityCameraCount;
        return this;
    }

    public Builder setSmartLock(boolean smartLock) {
        this.smartLock = smartLock;
        return this;
    }

    public Builder setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
        return this;
    }

    public Builder setAlarmSystem(boolean alarmSystem) {
        this.alarmSystem = alarmSystem;
        return this;
    }

    public Builder setVoiceAssistant(String voiceAssistant) {
        this.voiceAssistant = voiceAssistant;
        return this;
    }

    public Builder setEnergyMonitoring(boolean energyMonitoring) {
        this.energyMonitoring = energyMonitoring;
        return this;
    }


}
