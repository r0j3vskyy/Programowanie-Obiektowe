package PrzykladoweZadania.Nr1.Rekord;

public record Discipline(String name, String category, int trainingFrequency, int matchDuration) {
    public Discipline {
        name = (name != null) ? name : "";
        category = (category != null) ? category : "";
        trainingFrequency = (trainingFrequency >= 0) ? trainingFrequency : 0;
        matchDuration = (matchDuration >= 0) ? matchDuration : 0;
    }
    @Override
    public final String toString() {
        return name + category + trainingFrequency + matchDuration;
    }
}
