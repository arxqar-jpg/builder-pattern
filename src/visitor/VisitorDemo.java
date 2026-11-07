package visitor;

import java.util.Arrays;
import java.util.List;

public class VisitorDemo {
    public static void main(String[] args) {

        List<Device> devices = Arrays.asList(
                new AirPurifier(15),
                new WaterLeakSensor(true)
        );

        HomeVisitor status = new DeviceStatusVisitor();
        HomeVisitor safety = new SafetyAlertVisitor();

        System.out.println("Device Status");
        for (Device device : devices) {
            device.accept(status);
        }

        System.out.println("Safety Alerts");
        for (Device device : devices) {
            device.accept(safety);
        }
    }
}