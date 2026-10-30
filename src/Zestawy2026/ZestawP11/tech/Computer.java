package Zestawy2026.ZestawP11.tech;

public class Computer implements Comparable<Computer> {
    private double processorSpeed;
    private String brand;

    public Computer(double processorSpeed, String brand){
        this.processorSpeed = processorSpeed;
        this.brand = brand;
    }

    @Override
    public int compareTo(Computer other){
        int speedCompare = Double.compare(this.processorSpeed, other.processorSpeed);
        if (speedCompare != 0){
            return speedCompare;
        }
        return this.brand.compareTo(other.brand);
    }
}
