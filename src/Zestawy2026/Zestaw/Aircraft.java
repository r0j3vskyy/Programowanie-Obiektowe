package Zestawy2026.Zestaw;
//package aviation;

import java.util.ArrayList;
import java.util.Objects;

public class Aircraft {
    private String model;
    private String airline;
    private ArrayList<Double> flightAltitudes;
    public Aircraft(String model, String airline, ArrayList<Double> flightAltitudes) {
        this.model = (model == null) ? "" : model;
        this.airline = (airline == null) ? "" : airline;
        
        if (flightAltitudes == null) {
            this.flightAltitudes = new ArrayList<>();
        } else {
            this.flightAltitudes = new ArrayList<>(flightAltitudes);
        }
    }
    public String getModel() {return model;}
    public void setModel(String model) {
        if (model != null) {
            this.model = model;
        }
    }
    public String getAirline() {return airline;}
    public void setAirline(String airline) {
        if (airline != null) {
            this.airline = airline;
        }
    }
    public ArrayList<Double> getFlightAltitudes() {return new ArrayList<>(flightAltitudes);}
    public void setFlightAltitudes(ArrayList<Double> flightAltitudes) {
        if (flightAltitudes != null) {
            this.flightAltitudes = new ArrayList<>(flightAltitudes);
        }
    }
    public void addFlightAltitude(double altitude) {
        this.flightAltitudes.add(altitude);
    }
    public void removeFlightAltitude(double altitude) {
        this.flightAltitudes.remove(altitude);
    }
    @Override
    public String toString() {
        return String.format("[Aircraft]: [%s], [%s], Flight Altitudes: [%s].", 
                model, airline, flightAltitudes);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return Objects.equals(flightAltitudes, aircraft.flightAltitudes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(flightAltitudes);
    }
}
