package visitor;

public class SafetyAlertVisitor implements HomeVisitor {

    @Override
    public void visitAirPurifier(AirPurifier purifier) {
        if (purifier.getFilterLife() < 20) {
            System.out.println("Warning: Replace air filter!");
        }
    }

    @Override
    public void visitWaterLeakSensor(WaterLeakSensor sensor) {
        if (sensor.isLeakDetected()) {
            System.out.println("Warning: Water leak detected!");
        }
    }
}