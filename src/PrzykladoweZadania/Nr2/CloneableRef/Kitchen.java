package PrzykladoweZadania.Nr2.CloneableRef;

public class Kitchen implements Cloneable{
    private String name;
    private Stove stove;

    public Kitchen(String name, Stove stove){
        this.name = name;
        this.stove = stove;
    }
    public String getName() {
        return name;
    }
    public Stove getStove() {
        return stove;
    }
    @Override
    public Kitchen clone() throws CloneNotSupportedException {
        Kitchen cloned = (Kitchen) super.clone();
        if (this.stove != null)
            cloned.stove = this.stove.clone();
        return cloned;
    }
    @Override
    public String toString() {
        return "Kitchen: [" +name+ ", " +stove+ "].";
    }
}
