package Zestawy2026.Zestaw;

//package alg;
import java.util.Arrays;
import java.util.TreeSet;
public class SetUtils {
    public static <E> int compareSets(TreeSet<E> setOne, TreeSet<E> setTwo) {
        if (setOne == null || setTwo == null) {
            throw new IllegalArgumentException("Zbiory nie mogą być wartością null.");
        }
        TreeSet<E> intersection = new TreeSet<>(setOne);
        intersection.retainAll(setTwo);
        return intersection.size();
    }
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        TreeSet<Integer> set2 = new TreeSet<>(Arrays.asList(4, 5, 6, 7, 8));
        TreeSet<Integer> set3 = new TreeSet<>(Arrays.asList(10, 11, 12));
        int common1 = SetUtils.compareSets(set1, set2);
        System.out.println("Zbiór 1: " + set1);
        System.out.println("Zbiór 2: " + set2);
        System.out.println("Liczba wspólnych elementów: " + common1);
        int common2 = SetUtils.compareSets(set1, set3);
        System.out.println("\nZbiór 1: " + set1);
        System.out.println("Zbiór 3: " + set3);
        System.out.println("Liczba wspólnych elementów: " + common2);
        System.out.println("\nTest dla argumentu null:");
        try {
            SetUtils.compareSets(set1, null);
        } catch (IllegalArgumentException e) {
            System.err.println("Złapano wyjątek: " + e.getMessage());
        }
    }
}
