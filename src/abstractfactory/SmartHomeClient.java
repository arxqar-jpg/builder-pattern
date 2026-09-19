package abstractfactory;

public class SmartHomeClient {

    private final Lighting lighting;
    private final SecuritySystem securitySystem;

    public SmartHomeClient(SmartHomeFactory factory) {
        lighting = factory.createLighting();
        securitySystem = factory.createSecuritySystem();
    }

    public void startHome() {
        lighting.turnOn();
        securitySystem.activate();
    }
}