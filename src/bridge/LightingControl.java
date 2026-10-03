package bridge;

public class LightingControl extends SmartHomeControl {

    public LightingControl(ConnectionProtocol protocol) {
        super(protocol);
    }

    @Override
    public void control() {
        protocol.connect();
        System.out.println("Lighting is controlled");
    }
}