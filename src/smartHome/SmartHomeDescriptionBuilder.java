package smartHome;

public class SmartHomeDescriptionBuilder implements SmartHomeBuilder {

    private String homeName;
    private boolean smartLighting;
    private int securityCameraCount;
    private boolean smartLock;
    private double targetTemperature;
    private boolean alarmSystem;
    private String voiceAssistant;
    private boolean energyMonitoring;

    @Override
    public SmartHomeDescriptionBuilder setHomeName(String homeName) {
        this.homeName = homeName;
        return this;
    }

    @Override
    public SmartHomeDescriptionBuilder setSmartLighting(boolean smartLighting) {
        this.smartLighting = smartLighting;
        return this;
    }

    @Override
    public SmartHomeDescriptionBuilder setSecurityCameraCount(int securityCameraCount) {
        this.securityCameraCount = securityCameraCount;
        return this;
    }

    @Override
    public SmartHomeDescriptionBuilder setSmartLock(boolean smartLock) {
        this.smartLock = smartLock;
        return this;
    }

    @Override
    public SmartHomeDescriptionBuilder setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
        return this;
    }

    @Override
    public SmartHomeDescriptionBuilder setAlarmSystem(boolean alarmSystem) {
        this.alarmSystem = alarmSystem;
        return this;
    }

    @Override
    public SmartHomeDescriptionBuilder setVoiceAssistant(String voiceAssistant) {
        this.voiceAssistant = voiceAssistant;
        return this;
    }

    @Override
    public SmartHomeDescriptionBuilder setEnergyMonitoring(boolean energyMonitoring) {
        this.energyMonitoring = energyMonitoring;
        return this;
    }

    public String getResult() {
        if (homeName == null || homeName.isBlank()) {
            throw new IllegalStateException("Home name is required");
        }

        if (securityCameraCount < 0) {
            throw new IllegalStateException("Security camera count cannot be negative");
        }

        if (targetTemperature < 5 || targetTemperature > 35) {
            throw new IllegalStateException("Target temperature must be between 5 and 35");
        }

        return "Smart Home Description \n" +
                "Home name: " + homeName + "\n" +
                "Smart lighting: " + smartLighting + "\n" +
                "Security cameras: " + securityCameraCount + "\n" +
                "Smart lock: " + smartLock + "\n" +
                "Target temperature: " + targetTemperature + "\n" +
                "Alarm system: " + alarmSystem + "\n" +
                "Voice assistant: " + voiceAssistant + "\n" +
                "Energy monitoring: " + energyMonitoring;
    }
}