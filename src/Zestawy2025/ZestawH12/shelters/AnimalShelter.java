package Zestawy2025.ZestawH12.shelters;

import java.util.ArrayList;
import java.util.Objects;

public class AnimalShelter {
    private String name;
    private String location;
    private ArrayList<Double> ratings;

    public AnimalShelter(String name, String location, ArrayList<Double> ratings){
        this.name = name;
        this.location = location;
        this.ratings = new ArrayList<>(ratings);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public ArrayList<Double> getRatings() {
        return new ArrayList<>(ratings);
    }
    public void setRatings(ArrayList<Double> ratings) {
        this.ratings = new ArrayList<>(ratings);
    }
    public void addRating(double rating){
        this.ratings.add(rating);
    }
    public void removeRating(double rating){
        this.ratings.remove(rating);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        AnimalShelter shelter = (AnimalShelter) obj;
        return Objects.equals(this.location, shelter.location);
    }
    @Override
    public int hashCode() {
        return Objects.hash(location);
    }
}
