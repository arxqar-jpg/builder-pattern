package facade;

public class SmartFacade {
    Light work = new Light();
    Lock close = new Lock();
    Security defense = new Security(close);
    Thermostat climat = new Thermostat();

    public void createSmartHome() {
        work.turnOff();
        climat.setTemperature(18);
        close.lock();
        defense.arm();
    }

}