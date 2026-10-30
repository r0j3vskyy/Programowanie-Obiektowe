package Zestawy2026.Zestaw;
//package railway;

import java.util.Arrays;

public class Train implements Cloneable {
    private String name;
    private int[] departureTimes;
    public Train(String name, int[] departureTimes) {
        this.name = name;
        this.departureTimes = (departureTimes != null) ? departureTimes.clone() : new int[5];
    }
    public void setDepartureTime(int index, int time) {
        if (index >= 0 && index < departureTimes.length) {
            this.departureTimes[index] = time;
        }
    }
    public int[] getDepartureTimes() {return departureTimes;}
    public String getName() {return name;}
    @Override
    public Train clone() {
        try {
            Train cloned = (Train) super.clone();
            cloned.departureTimes = this.departureTimes.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {throw new AssertionError();}
    }
    @Override
    public String toString() {
        return "Pociąg: " + name + ", Odjazdy: " + Arrays.toString(departureTimes);
    }
}
