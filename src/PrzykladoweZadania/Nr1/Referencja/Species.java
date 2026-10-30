package PrzykladoweZadania.Nr1.Referencja;

import java.util.Objects;

public class Species {
    private String name;
    private String habitat;
    private int wateringFrequency;
    private int sunlightRequirement;

    public Species(String name, String habitat, int wateringFrequency, int sunlightRequirement){
        this.name = (name != null) ? name : "";
        this.habitat = (habitat != null) ? habitat : "";
        this.wateringFrequency = (wateringFrequency >= 0) ? wateringFrequency : 0;
        this.sunlightRequirement = (sunlightRequirement >= 0) ? sunlightRequirement : 0; 
    }

    public Species(Species other){
        this(other.getName(), other.getHabitat(), other.getWateringFrequency(), other.getSunlightRequirement());
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = (name != null) ? name : "";
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = (habitat != null) ? habitat : "";
    }
    public int getWateringFrequency() {
        return wateringFrequency;
    }
    public void setWateringFrequency(int wateringFrequency) {
        this.wateringFrequency = (wateringFrequency >= 0) ? wateringFrequency : 0;
    }
    public int getSunlightRequirement() {
        return sunlightRequirement;
    }
    public void setSunlightRequirement(int sunlightRequirement) {
        this.sunlightRequirement = (sunlightRequirement >= 0) ? sunlightRequirement : 0; 
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +getName() +getHabitat() +getWateringFrequency() +getSunlightRequirement();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Species spec = (Species) obj;
        return wateringFrequency == spec.wateringFrequency &&
            sunlightRequirement == spec.sunlightRequirement &&
            Objects.equals(name, spec.name) &&
            Objects.equals(habitat, spec.habitat);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
