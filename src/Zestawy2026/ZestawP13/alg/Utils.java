package Zestawy2026.ZestawP13.alg;

import java.util.HashSet;
import java.util.function.Predicate;

public class Utils {
    public static <E> int removeIf(HashSet<E> set, Predicate<E> condition){
        int oldSise = set.size();
        set.removeIf(condition);
        return oldSise - set.size();
    }
}
