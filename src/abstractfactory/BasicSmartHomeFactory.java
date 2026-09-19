package abstractfactory;

public class BasicSmartHomeFactory implements SmartHomeFactory {

    @Override
    public Lighting createLighting() {
        return new BasicLighting();
    }

    @Override
    public SecuritySystem createSecuritySystem() {
        return new BasicSecuritySystem();
    }
}