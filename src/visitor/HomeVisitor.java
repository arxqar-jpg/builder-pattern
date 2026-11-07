package visitor;

public interface HomeVisitor {
    void visitAirPurifier(AirPurifier purifier);
    void visitWaterLeakSensor(WaterLeakSensor sensor);
}