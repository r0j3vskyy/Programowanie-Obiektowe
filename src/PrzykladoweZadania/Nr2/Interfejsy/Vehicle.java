package PrzykladoweZadania.Nr2.Interfejsy;

public interface Vehicle {
    public abstract void startEngine(String fuelType);
    public abstract boolean canDrive(int fuelLevel);

    public default void stop(){
        System.out.println("Vehicle stops.");
    }
    public default void honk(){
        System.out.println("HONK!");
    }
    public static String info(){
        return "Vehicle ";
    }
}
