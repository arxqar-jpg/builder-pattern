package visitor;

public class WaterLeakSensor implements Device {
    private final boolean leakDetected;

    public WaterLeakSensor(boolean leakDetected) {
        this.leakDetected = leakDetected;
    }

    public boolean isLeakDetected() {
        return leakDetected;
    }

    @Override
    public void accept(HomeVisitor visitor) {
        visitor.visitWaterLeakSensor(this);
    }
}