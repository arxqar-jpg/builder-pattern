package strategy;

public class StrategyMain {
    public static void main(String[] args) {

        TemperatureController controller =
                new TemperatureController(new EcoMode());

        controller.control();

        controller.changeStrategy(new ComfortMode());
        controller.control();

        controller.changeStrategy(new TurboMode());
        controller.control();
    }
}
