package Zestawy2025.ZestawH14.sports;

import java.util.Arrays;

public class TestAthlete {
    public static void main(String[] args) {
        Athlete[] athletes = {
            new Athlete("Lewandowski", "Bieganie", 150),
            new Athlete("Robert", "Pilka nozna", 200),
            new Athlete("Lwandowski", "Plywanie", 100),
            new Athlete("Kamyk", "Skakanie", 200),
            new Athlete("Ziobro", "Bieganie", 100)
        };
        System.out.println("Przed sortowanien: ");
        for (Athlete a: athletes){
            System.out.println(a);
        }
        Arrays.sort(athletes, new ScoreNameComparator());
        System.out.println("Po sortowaniu:");
        for (Athlete a: athletes){
            System.out.println(a);
        }
    }
}
