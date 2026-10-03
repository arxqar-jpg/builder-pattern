package bridge;

public class ZigbeeProtocol implements ConnectionProtocol {

    @Override
    public void connect() {
        System.out.println("Connected using Zigbee");
    }
}