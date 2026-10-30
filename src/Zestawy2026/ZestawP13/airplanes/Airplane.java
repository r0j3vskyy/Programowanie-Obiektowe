package Zestawy2026.ZestawP13.airplanes;

import java.util.ArrayList;
import java.util.Objects;

public class Airplane {
    private double maxSpeed;
    private int capacity;
    private ArrayList<String> features;

    public Airplane(double maxSpeed, int capacity, ArrayList<String> features){
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
        this.features = new ArrayList<>(features);
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public ArrayList<String> getFeatures() {
        return new ArrayList<>(this.features);
    }
    public void setFeatures(ArrayList<String> features) {
        this.features = new ArrayList<>(features);
    }

    public void addFeature(String feature){
        if (feature == null)
            return;
        ArrayList<String> newFeatures = new ArrayList<>(this.features);
        newFeatures.add(feature);
        this.features = newFeatures;
    }

    public void addLastFeature(String feature){
        if (feature != null){
            this.features.add(feature);
        }
    }

    public void removeFeature(String feature){
        if (feature == null)
            return;
        ArrayList<String> newFeatures = new ArrayList<>(this.features);
        newFeatures.remove(feature);
        this.features = newFeatures;
    }

    public void removeLastFeature(){
        if (this.features == null || this.features.isEmpty())
            return;
        this.features.remove(this.features.size() - 1);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ ":\n"
        +"Max Speed: " +maxSpeed+ ",\n"
        +"Capacity: " +capacity+ ",\n"
        +"Features: " +features+ ".";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Airplane plane = (Airplane) obj;
        return Objects.equals(this.features, plane.features);
    }

    @Override
    public int hashCode() {
        return Objects.hash(features);
    }
}
