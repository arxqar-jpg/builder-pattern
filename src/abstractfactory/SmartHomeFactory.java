package abstractfactory;

public interface SmartHomeFactory {

    Lighting createLighting();

    SecuritySystem createSecuritySystem();
}