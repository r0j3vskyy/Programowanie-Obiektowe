package Zestawy2026.ZestawP14.checking;

import java.util.HashSet;

public class TestUtils {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(10);
        set1.add(15);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(15);

        System.out.println(Utils.checkDisjoint(set1, set2));
    }
}
