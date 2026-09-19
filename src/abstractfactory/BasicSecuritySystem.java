package abstractfactory;

public class BasicSecuritySystem implements SecuritySystem {

    @Override
    public void activate() {
        System.out.println("BASIC SECURITY SYSTEM IS ACTIVE");
    }
}