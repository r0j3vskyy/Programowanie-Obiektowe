package Zestawy2026.ZestawP12.sports;

import java.util.Arrays;

public class Sport {
    private int numberOfAthletes;
    private double performanceRating;
    private String[] sportTypes;

    public Sport(int numberOfAthletes, double performanceRating, String[] sportTypes){
        this.numberOfAthletes = numberOfAthletes;
        this.performanceRating = performanceRating;
        if (sportTypes != null){
            this.sportTypes = sportTypes.clone();
        } else {
            this.sportTypes = new String[0];
        }
    }

    public int getNumberOfAthletes() {
        return numberOfAthletes;
    }
    public void setNumberOfAthletes(int numberOfAthletes) {
        this.numberOfAthletes = numberOfAthletes;
    }
    public double getPerformanceRating() {
        return performanceRating;
    }
    public void setPerformanceRating(double performanceRating) {
        this.performanceRating = performanceRating;
    }
    public String[] getSportTypes() {
        if (this.sportTypes != null){
            return this.sportTypes.clone();
        } else return null;
    }
    public void setSportTypes(String[] sportTypes) {
        if (sportTypes != null) {
            this.sportTypes = sportTypes.clone();
        } else this.sportTypes = new String[0];
    }
    public void addSportTypes(String newType){
        if (newType != null){
            String[] newArray = Arrays.copyOf(this.sportTypes, this.sportTypes.length + 1);
            newArray[newArray.length - 1] = newType;
            this.sportTypes = newArray;
        }
    }
    public void removeSportType(String typeToRemove){
        int indexToRemove = -1;
        for (int i=0; i<this.sportTypes.length; i++){
            if (typeToRemove.equals(this.sportTypes[i])){
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1){
            String[] newArray = new String[this.sportTypes.length - 1];
            int currentNewIndex = 0;
            for (int i=0; i<this.sportTypes.length; i++){
                if (i != indexToRemove){
                    newArray[currentNewIndex] = this.sportTypes[i];
                    currentNewIndex++;
                }
            }
            this.sportTypes = newArray;
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + 
            numberOfAthletes + ", " +
            performanceRating + ", " +
            Arrays.toString(sportTypes) + ".";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Sport sport = (Sport) obj;
        return Arrays.equals(this.sportTypes, sport.sportTypes);
    }
    @Override
    public int hashCode() {
        return Arrays.hashCode(sportTypes);
    }
}
