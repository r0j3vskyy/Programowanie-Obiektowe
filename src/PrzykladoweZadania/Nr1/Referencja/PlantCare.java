package PrzykladoweZadania.Nr1.Referencja;

import java.util.Objects;

public class PlantCare {
    private String plantName;
    private String careDate;
    private Species species;
    private int waterAmount;

    public PlantCare(String plantName, String careDate, Species species, int waterAmount){
        this.plantName = (plantName != null) ? plantName : "";
        this.careDate = (careDate != null) ? careDate : "";
        this.waterAmount = (waterAmount >= 0) ? waterAmount : 0;
        //this.species = (species != null) ? new Species(species.getName(), 
        //  species.getHabitat(), species.getWateringFrequency(), species.getSunlightRequirement()) : null;
        this.species = (species != null) ? new Species(species) : null;
    }
    public String getPlantName() {
        return plantName;
    }
    public void setPlantName(String plantName) {
        this.plantName = (plantName != null) ? plantName : "";
    }
    public String getCareDate() {
        return careDate;
    }
    public void setCareDate(String careDate) {
        this.careDate = (careDate != null) ? careDate : "";
    }
    public Species getSpecies() {
        if (this.species == null)
            return null;
        // return new Species(species.getName(), species.getHabitat(),
        //         species.getWateringFrequency(), species.getSunlightRequirement());
        return (species != null) ? new Species(species) : null;
    }
    public void setSpecies(Species species) {
        // this.species = (species != null) ? new Species(species.getName(), species.getHabitat(), 
        //     species.getWateringFrequency(), species.getSunlightRequirement()) : null;
        this.species = (species != null) ? new Species(species) : null;
    }
    public int getWaterAmount() {
        return waterAmount;
    }
    public void setWaterAmount(int waterAmount) {
        this.waterAmount = (waterAmount >= 0) ? waterAmount : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PlantCare other = (PlantCare) obj;
        return waterAmount == other.waterAmount &&
            Objects.equals(plantName, other.plantName) &&
            Objects.equals(careDate, other.careDate) &&
            Objects.equals(species, other.species);
    }
}
