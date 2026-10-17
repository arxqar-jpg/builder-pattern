package facade;

public class Thermostat {
    int temperature = 22;

    public void setTemperature(int t) {
        temperature = t;
        System.out.println("Temperature: " + temperature);
    }
}