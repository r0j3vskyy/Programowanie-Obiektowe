package PrzykladoweZadania.Nr2.Interfejsy;

public class Car implements Vehicle{
    @Override
    public void startEngine(String fuelType) {
        if ("benzyna".equals(fuelType) || "diesel".equals(fuelType)){
            System.out.println("Silnik uruchomiony z użyciem " +fuelType);
        } 
        else
            System.out.println("Nieznany typ paliwa.");
    }
    @Override
    public boolean canDrive(int fuelLevel) {
        if (fuelLevel > 5) 
            return true;
        return false;
    }
}
