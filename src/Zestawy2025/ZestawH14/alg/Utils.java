package Zestawy2025.ZestawH14.alg;

import java.util.TreeSet;

public class Utils {
    public static <E extends Comparable<E>> int calculateSymmetricDifference(TreeSet<E> setOne, TreeSet<E> setTwo){
        // 1. Tworzymy kopię pierwszego zbioru, aby obliczyć sumę (A U B)
        TreeSet<E> union = new TreeSet<>(setOne);
        union.addAll(setTwo);
        // 2. Tworzymy kopię pierwszego zbioru, aby obliczyć część wspólną (A ∩ B)
        TreeSet<E> intersection = new TreeSet<>(setOne);
        intersection.retainAll(setTwo);
        // 3. Wynik to różnica rozmiarów
        return union.size() - intersection.size();
    }
}
