package PrzykladoweZadania.Nr2.Interfejsy;

public class VehicleTest {
    public static void main(String[] args) {
        System.out.println(Vehicle.info());
        Car s1 = new Car();
        s1.startEngine("benzyna");
        s1.startEngine("diesel");
        s1.startEngine("lpg");


        System.out.println(s1.canDrive(10));
        System.out.println(s1.canDrive(4));
        s1.honk();
        s1.stop();
    }
}
