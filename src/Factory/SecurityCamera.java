package Factory;

public class SecurityCamera implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("SECURITY CAMERA IS ON");
    }
}