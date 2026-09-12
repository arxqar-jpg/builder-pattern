package smartHome;

public interface SmartHomeBuilder {
    SmartHomeBuilder setHomeName (String homeName);
    SmartHomeBuilder setSmartLighting(boolean smartLighting);
    SmartHomeBuilder setSecurityCameraCount(int securityCameraCount);
    SmartHomeBuilder setSmartLock(boolean smartLock);
    SmartHomeBuilder setTargetTemperature(double targetTemperature);
    SmartHomeBuilder setAlarmSystem(boolean alarmSystem);
    SmartHomeBuilder setVoiceAssistant(String voiceAssistant);
    SmartHomeBuilder setEnergyMonitoring(boolean energyMonitoring);
}