package strategy;

public class EcoMode implements TemperatureStrategy {
    public void setTemperature() {
        System.out.println("Eco Mode: 18°C");
    }
}
