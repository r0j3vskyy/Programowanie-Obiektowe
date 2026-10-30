package Zestawy2026.ZestawP12.plprogramowanieGeneryczne;

public class Computer implements Comparable<Computer> {
    private double performance;
    private int ram;

    public Computer(double performance, int ram){
        this.performance = performance;
        this.ram = ram;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public double getPerformance() {
        return performance;
    }
    public void setPerformance(double performance) {
        this.performance = performance;
    }
    @Override
    public int compareTo(Computer o) {
        int performanceCompare = Double.compare(this.performance, o.performance);
        if (performanceCompare != 0){
            return performanceCompare;
        }
        return Integer.compare(this.ram, o.ram);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " +
            performance + ", " + ram + ".";
    }
}
