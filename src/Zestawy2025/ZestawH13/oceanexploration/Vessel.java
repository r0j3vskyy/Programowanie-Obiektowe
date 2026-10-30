package Zestawy2025.ZestawH13.oceanexploration;

public class Vessel {
    private String name;
    private String type;
    private int capatity;
    private int length;

    public Vessel(String name, String type, int capacity, int length){
        this.name = (name != null) ? name : "";
        this.type = (type != null) ? type : "";
        this.capatity = (capacity < 0) ? 0 : capacity;
        this.length = (length < 0) ? 0 : length;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = (name != null) ? name : "";
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = (type != null) ? type : "";
    }
    public int getCapatity() {
        return capatity;
    }
    public void setCapatity(int capacity) {
        this.capatity = (capacity < 0) ? 0 : capacity;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = (length < 0) ? 0 : length;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " +name+ ", " +type+ ", " +capatity+ ", " +length+ ".";
    } 
    
}
