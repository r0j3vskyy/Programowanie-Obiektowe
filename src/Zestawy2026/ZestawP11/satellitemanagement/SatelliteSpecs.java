package Zestawy2026.ZestawP11.satellitemanagement;

import java.util.Objects;

public class SatelliteSpecs{
    private String modelName;
    private int launchYear;
    private int orbitAltitude;

    public SatelliteSpecs(String modelName, int launchYear, int orbitAltitude){
        if (modelName != null){
            this.modelName = modelName;
        } else this.modelName = "";
        if (launchYear > 0){
            this.launchYear = launchYear;
        } else this.launchYear = 0;
        if (orbitAltitude > 0){
            this.orbitAltitude = orbitAltitude;
        } else this.orbitAltitude = 0;
    }
    public String getModelName() {return modelName;}
    public void setModelName(String modelName) {
        if (modelName != null){
            this.modelName = modelName;
        } else this.modelName = "";
    }
    public int getLaunchYear() {return launchYear;}
    public void setLaunchYear(int launchYear) {
        if (launchYear > 0){
            this.launchYear = launchYear;
        } else this.launchYear = 0;
    }
    public int getOrbitAltitude() {return orbitAltitude;}
    public void setOrbitAltitude(int orbitAltitude) {
        if (orbitAltitude > 0){
            this.orbitAltitude = orbitAltitude;
        } else this.orbitAltitude = 0;
    }

    @Override
    public String toString(){
        return "Satellite={modelName=" +modelName+ ", launchYear=" +launchYear+
        ", orbitAltitude=" +orbitAltitude+ "}";  
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SatelliteSpecs satellite = (SatelliteSpecs) o;
        return modelName.equals(satellite.modelName) && launchYear == satellite.launchYear
        && orbitAltitude == satellite.orbitAltitude;
    }
    @Override
    public int hashCode(){
        return Objects.hash(modelName, launchYear, orbitAltitude);
    }
}