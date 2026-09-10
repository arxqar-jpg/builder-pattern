package smartHome;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        SmartHomeObjectBuilder objectBuilder = new SmartHomeObjectBuilder();
        director.makeSecureHome(objectBuilder);

        SmartHome secureHome = objectBuilder.getResult();

        System.out.println("OBJECT REPRESENTATION");
        System.out.println(secureHome);


        SmartHomeDescriptionBuilder descriptionBuilder =
                new SmartHomeDescriptionBuilder();

        director.makeSecureHome(descriptionBuilder);

        String description = descriptionBuilder.getResult();

        System.out.println();
        System.out.println("TEXT REPRESENTATION");
        System.out.println(description);


        SmartHomeObjectBuilder basicBuilder = new SmartHomeObjectBuilder();
        director.makeBasicHome(basicBuilder);

        SmartHome basicHome = basicBuilder.getResult();

        System.out.println();
        System.out.println("BASIC HOME");
        System.out.println(basicHome);
    }
}