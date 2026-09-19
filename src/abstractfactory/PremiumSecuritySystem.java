package abstractfactory;

public class PremiumSecuritySystem implements SecuritySystem {

    @Override
    public void activate() {
        System.out.println("PREMIUM SECURITY SYSTEM IS ACTIVE");
    }
}