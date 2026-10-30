package Zestawy2025.ZestawH14.alg;

import java.util.TreeSet;

public class TestDifference {
    public static void main(String[] args) {
        TreeSet<Integer> s1 = new TreeSet<>();
        s1.add(1); s1.add(2); s1.add(3); s1.add(4);
        TreeSet<Integer> s2 = new TreeSet<>();
        s2.add(3); s2.add(4); s2.add(5); s2.add(6);

        int result = Utils.calculateSymmetricDifference(s1, s2);
        System.out.println("Zbiór 1: " + s1);
        System.out.println("Zbiór 2: " + s2);
        System.out.println("Liczba elementów w różnicy symetrycznej: " + result);


        TreeSet<String> names1 = new TreeSet<>();
        names1.add("Karolina"); names1.add("Pawe?");
        TreeSet<String> names2 = new TreeSet<>();
        names2.add("Pawe?"); names2.add("Szymon");
        
        System.out.println("Różnica nazw: " + Utils.calculateSymmetricDifference(names1, names2));
    }
}
