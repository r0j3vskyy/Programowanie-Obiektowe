package PrzykladoweZadania.Nr1.Arraylista;

import java.util.ArrayList;
import java.util.Objects;

public class CoffeeBlend {
    private String name;
    private String origin;
    private ArrayList<String> flavorNotes;

    public CoffeeBlend(String name, String origin, ArrayList<String> flavorNotes){
        this.name = name;
        this.origin = origin;
        this.flavorNotes = (flavorNotes != null) ? new ArrayList<>(flavorNotes) : new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public ArrayList<String> getFlavorNotes() {
        return new ArrayList<String>(flavorNotes);
    }
    public void setFlavorNotes(ArrayList<String> flavorNotes) {
        this.flavorNotes = new ArrayList<String>(flavorNotes);
    }

    public void addFlavorNotes(String note){
        this.flavorNotes.add(note);
    }
    public void removeFlavorNotes(String note){
        this.flavorNotes.remove(note);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        CoffeeBlend blend = (CoffeeBlend) obj;
        return Objects.equals(this.name, blend.name) && 
            Objects.equals(this.origin, blend.origin) &&
            Objects.equals(this.flavorNotes, blend.flavorNotes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, origin, flavorNotes);
    }
}
