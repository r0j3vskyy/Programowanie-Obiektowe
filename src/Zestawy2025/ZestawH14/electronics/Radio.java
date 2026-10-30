package Zestawy2025.ZestawH14.electronics;

import java.util.ArrayList;
import java.util.Objects;

public class Radio {
    private String model;
    private String manufacturer;
    private ArrayList<Double> stations;

    public Radio(String model, String manufacturer, ArrayList<Double> stations){
        this.model = model;
        this.manufacturer = manufacturer;
        this.stations = new ArrayList<>(stations);
    }
    public void addStation(double station){
        this.stations.add(station);
    }
    public void removeStation(double station){
        this.stations.remove(station);
    }
    @Override
    public boolean equals(Object obj) {
        Radio radio = (Radio) obj;
        return Objects.equals(this.model, radio.model) && Objects.equals(this.manufacturer, radio.manufacturer);
    }
    @Override
    public int hashCode() {
        return Objects.hash(model, manufacturer);
    }
}
