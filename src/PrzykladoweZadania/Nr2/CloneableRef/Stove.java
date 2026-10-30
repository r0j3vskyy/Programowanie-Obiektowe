package PrzykladoweZadania.Nr2.CloneableRef;

public class Stove implements Cloneable{
    private int burners;
    private String brand;
    private int serialNumber;

    public Stove(int burners, String brand, int serialNumber){
        this.burners = burners;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }
    public int getBurners() {
        return burners;
    }
    public String getBrand() {
        return brand;
    }
    public int getSerialNumber() {
        return serialNumber;
    }
    @Override
    public Stove clone() throws CloneNotSupportedException {
        return (Stove) super.clone();
    }
    @Override
    public String toString() {
        return "Stove: [" +burners+ ", " +brand+ ", " +serialNumber+ "].";
    }
}
