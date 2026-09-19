package abstractfactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        SmartHomeFactory basicFactory = new BasicSmartHomeFactory();
        SmartHomeClient basicHome = new SmartHomeClient(basicFactory);

        System.out.println("BASIC SMART HOME");
        basicHome.startHome();

        System.out.println();

        SmartHomeFactory premiumFactory = new PremiumSmartHomeFactory();
        SmartHomeClient premiumHome = new SmartHomeClient(premiumFactory);

        System.out.println("PREMIUM SMART HOME");
        premiumHome.startHome();
    }
}