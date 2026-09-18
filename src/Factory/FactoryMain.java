package Factory;

public class FactoryMain {

    public static void main(String[] args) {

        SmartDeviceFactory lightFactory = new SmartLightFactory();
        SmartDevice light = lightFactory.createDevice();
        light.turnOn();

        SmartDeviceFactory cameraFactory = new SecurityCameraFactory();
        SmartDevice camera = cameraFactory.createDevice();
        camera.turnOn();
    }
}
