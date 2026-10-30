package PrzykladoweZadania.Nr3.K14;

public class Fruit implements Comparable<Fruit>{
    private String name;
    private double sweetness;
    public Fruit(String name, double sweetness){
        this.name = name;
        this.sweetness = sweetness;
    }

    public String getName() {
        return name;
    }
    public double getSweetness() {
        return sweetness;
    }
    @Override
    public int compareTo(Fruit o) {
        return Double.compare(this.sweetness, o.sweetness);
    }
    @Override
    public String toString() {
        return "Fruit: [" +name+ ", " +sweetness+ "].";
    }
}
