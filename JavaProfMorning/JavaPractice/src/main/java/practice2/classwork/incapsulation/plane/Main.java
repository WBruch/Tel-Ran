package practice2.classwork.incapsulation.plane;

public class Main {
    public static void main(String[] args) {
        Plane airBus330 = new Plane("airBus");
        Plane cessna = new Plane("cessna", "white", 100, 10000);

        System.out.println(airBus330.name);
        System.out.println(cessna.name);

        System.out.println(airBus330.getName());

        System.out.println(cessna.getName());
        System.out.println(cessna.getColor());
        System.out.println(cessna.getPassengerCount());
        System.out.println(cessna.getMaxDistance());
    }
}
