package bridge;

public class MainBridge {
    public static void main(String[] args) {
        ConnectionProtocol wifi = new WiFiProtocol();
        ConnectionProtocol zigbee = new ZigbeeProtocol();

        SmartHomeControl lighting = new LightingControl(wifi);
        lighting.control();
        System.out.println();

        lighting.setProtocol(zigbee);
        lighting.control();
        System.out.println();

        SmartHomeControl security = new SecurityControl(wifi);
        security.control();
    }
}