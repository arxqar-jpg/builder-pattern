package bridge;

public class SecurityControl extends SmartHomeControl {

    public SecurityControl(ConnectionProtocol protocol) {
        super(protocol);
    }

    @Override
    public void control() {
        protocol.connect();
        System.out.println("Security system is controlled");
    }
}