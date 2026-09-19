package abstractfactory;

public class BasicLighting implements Lighting {

    @Override
    public void turnOn() {
        System.out.println("BASIC LIGHTING IS ON");
    }
}