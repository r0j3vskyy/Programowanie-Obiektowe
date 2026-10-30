package PrzykladoweZadania.Nr1.Rekord;

import java.util.Objects;

public class TrainingSession {
    private String athleteName;
    private String sessionDate;
    private Discipline discipline;
    private int caloriesBurned;

    public TrainingSession(String athleteName, String sessionDate, Discipline discipline, int caloriesBurned){
        this.athleteName = (athleteName != null) ? athleteName : "";
        this.sessionDate = (sessionDate != null) ? sessionDate : "";
        this.caloriesBurned = (caloriesBurned >= 0) ? caloriesBurned : 0;
        this.discipline = discipline;
    }

    public String getAthleteName() {
        return athleteName;
    }
    public void setAthleteName(String athleteName) {
        this.athleteName = (athleteName != null) ? athleteName : "";
    }
    public String getSessionDate() {
        return sessionDate;
    }
    public void setSessionDate(String sessionDate) {
        this.sessionDate = (sessionDate != null) ? sessionDate : "";
    }
    public Discipline getDiscipline() {
        return discipline;
    }
    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
    public int getCaloriesBurned() {
        return caloriesBurned;
    }
    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = (caloriesBurned >= 0) ? caloriesBurned : 0;
    }

    @Override
    public String toString() {
        return "Sesja: " + athleteName + " dnia " + sessionDate + 
               ", " + discipline + ", Spalone kalorie: " + caloriesBurned;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainingSession that = (TrainingSession) o;
        return caloriesBurned == that.caloriesBurned && 
               Objects.equals(athleteName, that.athleteName) && 
               Objects.equals(sessionDate, that.sessionDate) && 
               Objects.equals(discipline, that.discipline);
    }
    @Override
    public int hashCode() {
        return Objects.hash(athleteName, sessionDate, discipline, caloriesBurned);
    }
}
