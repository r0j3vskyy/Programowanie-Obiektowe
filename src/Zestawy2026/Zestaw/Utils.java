package Zestawy2026.Zestaw;

//package pl.uwm;
public class Utils {
    public static <T extends Comparable<T>> boolean isSorted(T a, T b, T c) {
        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException("Argumenty nie mogą być null");
        }
        boolean ascending = a.compareTo(b) <= 0 && b.compareTo(c) <= 0;
        boolean descending = a.compareTo(b) >= 0 && b.compareTo(c) >= 0;
        return ascending || descending;
    }
    public static void main(String[] args) {
        Student s1 = new Student("Karolina", 3.0);
        Student s2 = new Student("Monika", 4.0);
        Student s3 = new Student("Grzegorz", 5.0);
        Student s4 = new Student("Kamil", 2.0);
        try {
            System.out.println("S1, S2, S3 (3, 4, 5): " + Utils.isSorted(s1, s2, s3));
            System.out.println("S3, S2, S1 (5, 4, 3): " + Utils.isSorted(s3, s2, s1));
            System.out.println("S1, S3, S4 (3, 5, 2): " + Utils.isSorted(s1, s3, s4));
            Student s5 = new Student("Julia", 4.0);
            System.out.println("S2, S5, S2 (4, 4, 4): " + Utils.isSorted(s2, s5, s2));
            Utils.isSorted(s1, null, s3);
        } catch (IllegalArgumentException e) {
            System.out.println("Złapano wyjątek: " + e.getMessage());
        }
    }
}
