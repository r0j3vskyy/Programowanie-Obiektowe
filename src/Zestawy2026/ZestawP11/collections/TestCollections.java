package Zestawy2026.ZestawP11.collections;

import java.util.TreeSet;

public class TestCollections {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("orzel");
        set.add("sokol");
        set.add("orzel");
        boolean result = Utils.hasDuplicates(set);
        System.out.println("Treeset: " +set);
        System.out.println("Duplicates?: " +result);
    }
}
