package abstractfactory;

public class PremiumSmartHomeFactory implements SmartHomeFactory {

    @Override
    public Lighting createLighting() {
        return new PremiumLighting();
    }

    @Override
    public SecuritySystem createSecuritySystem() {
        return new PremiumSecuritySystem();
    }
}