package Zestawy2025.ZestawH13.birds;

public class TestBird {
    public static void main(String[] args) {
        Bird b1 = new Bird("Bocian", "Laki", 200);
        Bird b2 = new Bird("Wrobel", "Moczary", 100);
        Bird b3 = new Bird("Bocian", "Miasto", 150);

        System.out.println(b1.equals(b2));
        System.out.println(b1.compareTo(b2));
        System.out.println(b1.equals(b3));
        System.out.println(b1.compareTo(b3));
    }
}
