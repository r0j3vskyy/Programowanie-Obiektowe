package PrzykladoweZadania.Nr1.Rekord;

public class TestTrainingSession {
    public static void main(String[] args) {
        Discipline d1 = new Discipline("Bieganie", "Indywidualny", 5, 45);
        TrainingSession s1 = new TrainingSession("Robert Lewandowski", "2024-05-20", d1, 500);
        
        TrainingSession s2 = new TrainingSession("Robert Lewandowski", "2024-05-20", d1, 500);

        System.out.println(s1.toString());

        System.out.println("Czy sesje są równe? " + s1.equals(s2));
        System.out.println("HashCode s1: " + s1.hashCode());
        System.out.println("HashCode s2: " + s2.hashCode());
    }
}
