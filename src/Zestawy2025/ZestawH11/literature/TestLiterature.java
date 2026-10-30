package Zestawy2025.ZestawH11.literature;

import java.util.ArrayList;

public class TestLiterature {
    public static void main(String[] args) {
        ArrayList<Double> rats1 = new ArrayList<>();
        rats1.add(5.3); rats1.add(7.8);
        Novel n1 = new Novel("Koziolek Matolek", "Oliwia", rats1);

        ArrayList<Double> rats2 = new ArrayList<>();
        rats2.add(1.5); rats2.add(8.3);
        Novel n2 = new Novel("Riko i koko", "Tomasz", rats2);
        System.out.println(n2);
        n2.addRating(3.3);
        n2.removeRating(1.5);
        System.out.println(n2.getRatings());
        System.out.println(n2.toString());
        System.out.println(n1.equals(n2));
        System.out.println(n1.hashCode());
    }
}
