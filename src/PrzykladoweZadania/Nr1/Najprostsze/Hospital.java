package PrzykladoweZadania.Nr1.Najprostsze;

import java.util.Objects;

// package healthcare
// class Hospital
public class Hospital {
    private String name;
    private double capacity;

    public Hospital(String name, double capacity){
        this.name = (name != null) ? name : "";
        this.capacity = (capacity > 0) ? capacity : 50.0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = (name != null) ? name : "";
    }
    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = (capacity > 0) ? capacity : 50.0;
    }
    @Override
    public String toString() {
        if (name.isEmpty())
            return getClass().getSimpleName() + ": Capacity: " +capacity;
        return getClass().getSimpleName() + ": Name:" +name+ ". Capacity: " +capacity+ ".";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Hospital najp = (Hospital) obj;
        return Double.compare(capacity, najp.capacity) == 0 && Objects.equals(name, najp.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }
}
