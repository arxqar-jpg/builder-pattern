package smartHome;

public class Director {

    public void makeSecureHome(SmartHomeBuilder builder) {
        builder
                .setHomeName("Secure Home")
                .setSmartLighting(true)
                .setSecurityCameraCount(6)
                .setSmartLock(true)
                .setTargetTemperature(22.0)
                .setAlarmSystem(true)
                .setVoiceAssistant("Alexa")
                .setEnergyMonitoring(true);
    }

    public void makeBasicHome(SmartHomeBuilder builder) {
        builder
                .setHomeName("Basic Home")
                .setSmartLighting(true)
                .setSecurityCameraCount(2)
                .setSmartLock(false)
                .setTargetTemperature(23.0)
                .setAlarmSystem(false)
                .setVoiceAssistant("Google Assistant")
                .setEnergyMonitoring(false);
    }
}