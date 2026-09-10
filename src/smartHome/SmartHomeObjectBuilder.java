package smartHome;

public class SmartHomeObjectBuilder implements SmartHomeBuilder {
    private String homeName;
    private boolean smartLighting;
    private int securityCameraCount;
    private boolean smartLock;
    private double targetTemperature;
    private boolean alarmSystem;
    private String voiceAssistant;
    private boolean energyMonitoring;

    @Override
    public SmartHomeObjectBuilder setHomeName(String homeName) {
        this.homeName = homeName;
        return this;
    }

    @Override
    public SmartHomeObjectBuilder setSmartLighting(boolean smartLighting) {
        this.smartLighting = smartLighting;
        return this;
    }

    @Override
    public SmartHomeObjectBuilder setSecurityCameraCount(int securityCameraCount) {
        this.securityCameraCount = securityCameraCount;
        return this;
    }

    @Override
    public SmartHomeObjectBuilder setSmartLock(boolean smartLock) {
        this.smartLock = smartLock;
        return this;
    }

    @Override
    public SmartHomeObjectBuilder setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
        return this;
    }

    @Override
    public SmartHomeObjectBuilder setAlarmSystem(boolean alarmSystem) {
        this.alarmSystem = alarmSystem;
        return this;
    }

    @Override
    public SmartHomeObjectBuilder setVoiceAssistant(String voiceAssistant) {
        this.voiceAssistant = voiceAssistant;
        return this;
    }

    @Override
    public SmartHomeObjectBuilder setEnergyMonitoring(boolean energyMonitoring) {
        this.energyMonitoring = energyMonitoring;
        return this;
    }
    public SmartHome getResult() {
        if (homeName == null || homeName.isBlank()) {
            throw new IllegalStateException("Home name is required");
        }

        if (securityCameraCount < 0) {
            throw new IllegalStateException("Security camera count cannot be negative");
        }

        if (targetTemperature < 5 || targetTemperature > 35) {
            throw new IllegalStateException("Target temperature must be between 5 and 35");
        }

        return new SmartHome(
                energyMonitoring,
                voiceAssistant,
                alarmSystem,
                targetTemperature,
                smartLock,
                securityCameraCount,
                smartLighting,
                homeName
        );
    }
}