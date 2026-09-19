package abstractfactory;

public class PremiumLighting implements Lighting {

    @Override
    public void turnOn() {
        System.out.println("PREMIUM LIGHTING IS ON");
    }
}