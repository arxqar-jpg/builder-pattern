package bridge;

public abstract class SmartHomeControl {
    protected ConnectionProtocol protocol;


public SmartHomeControl(ConnectionProtocol protocol) {
    this.protocol = protocol;
}
public void setProtocol(ConnectionProtocol protocol) {
    this.protocol = protocol;
}
public abstract void control();
        }





















































