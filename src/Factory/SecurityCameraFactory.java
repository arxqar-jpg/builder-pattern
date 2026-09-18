package Factory;

public class SecurityCameraFactory extends SmartDeviceFactory {

    @Override
    public SmartDevice createDevice() {
        return new SecurityCamera();
    }
}