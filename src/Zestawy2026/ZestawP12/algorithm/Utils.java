package Zestawy2026.ZestawP12.algorithm;

import java.util.HashSet;

public class Utils {
    public static <E> boolean isSubset(HashSet<E> set1, HashSet<E> set2){
        if (set2.containsAll(set1)) return true;
        return false;
    }
}
