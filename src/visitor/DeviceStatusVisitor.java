package visitor;

public class DeviceStatusVisitor implements HomeVisitor {

    @Override
    public void visitAirPurifier(AirPurifier purifier) {
        System.out.println("Filter life: "
                + purifier.getFilterLife() + "%");
    }
    @Override
    public void visitWaterLeakSensor(WaterLeakSensor sensor) {
        System.out.println("Water leak: "
                + sensor.isLeakDetected());
    }
}