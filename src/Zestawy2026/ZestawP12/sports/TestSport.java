package Zestawy2026.ZestawP12.sports;

import java.util.Arrays;

public class TestSport {
    public static void main(String[] args) {
        String[] types1 = {"pilkanozna", "pilkareczna", "siatkowka"};
        Sport s1 = new Sport(15, 5.6, types1);
        System.out.println("Przed zmiana " +s1);
        s1.addSportTypes("koszykowka");
        s1.removeSportType("siatkowka");
        System.out.println("Po zmianie " +s1);
        System.out.println(Arrays.toString(s1.getSportTypes()));

        String[] types2 = {"siatkowka", "lyzwiarstwo"};
        Sport s2 = new Sport(11, 2.1, types2);

        System.out.println(s2.toString());
        System.out.println(s1.equals(s2));
        System.out.println(s2.hashCode());
        System.out.println(s1);
        System.out.println(s2);
    }
}
