package Zestawy2026.ZestawP12.algorithm;

import java.util.HashSet;

public class TestUtils {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        HashSet<Integer> set3 = new HashSet<>();
        set3.add(4);
        set3.add(5);
        System.out.println("set1 & set2: " + Utils.isSubset(set1, set2));
        System.out.println("set1 & set3: " + Utils.isSubset(set1, set3));
        System.out.println("set2 & set3: " + Utils.isSubset(set2, set3));
    }
}
