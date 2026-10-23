package strategy;

public class TemperatureController {
    private TemperatureStrategy strategy;

    public TemperatureController(TemperatureStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(TemperatureStrategy strategy) {
        this.strategy = strategy;
    }

    public void control() {
        strategy.setTemperature();
    }
}
