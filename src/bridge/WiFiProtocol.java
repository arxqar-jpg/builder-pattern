package bridge;

public class WiFiProtocol implements ConnectionProtocol {

    @Override
    public void connect() {
        System.out.println("Connected using WiFi");
    }
}