package Zestawy2026.ZestawP13.alg;

import java.util.Arrays;
import java.util.HashSet;

public class TestUtils {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(10, 15, 20, 25, 30));

        System.out.println("Przed: " +set1);
        int count1 = Utils.removeIf(set1, n-> n>25);
        System.out.println("Usunieta ilosc: " +count1);
        System.out.println("Po: " +set1);
    }
}
