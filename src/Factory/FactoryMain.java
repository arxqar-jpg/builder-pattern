package Factory;

public class FactoryMain {

    public static void main(String[] args) {

        SmartDeviceFactory factory = new SmartLightFactory();

        SmartDevice device = factory.createDevice();

        device.turnOn();
    }
}