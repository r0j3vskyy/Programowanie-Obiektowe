package Zestawy2026.ZestawP11.satellitemanagement;

public class SatelliteMission {
    private String missionName;
    private SatelliteSpecs specs;
    private int operatingHours;

    public SatelliteMission(String missionName, SatelliteSpecs specs, int operatingHours){
        if (missionName != null){
            this.missionName = missionName;
        } else this.missionName = "";
        if (specs != null){
            this.specs = specs;
        } else this.specs = new SatelliteSpecs("", 0, 0);
        if (operatingHours > 0){
            this.operatingHours = operatingHours;
        } else this.operatingHours = 0;
    }
    public String getMissionName() {return missionName;}
    public SatelliteSpecs getSpecs() {return specs;}
    public int getOperatingHours() {return operatingHours;}
}
