package facade;

public class Light {
    Boolean isOn=false;

    public void turbOn(){
        System.out.println("Turn ON");
    }
    public  void  turnOff (){
        System.out.println("Turn Off");
    }
    public void turnOn() {
        isOn = true;
        System.out.println("Light ON");
    }
}
