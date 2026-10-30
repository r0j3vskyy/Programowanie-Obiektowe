package Zestawy2026.ZestawP12.plprogramowanieGeneryczne;

public class TestUtils {
    public static void main(String[] args) {
        Computer c1 = new Computer(1000, 16);
        Computer c2 = new Computer(1000, 32);
        Computer c3 = new Computer(2000, 8);
        Computer c4 = new Computer(1000, 16);
        System.out.println(c1.compareTo(c2));
        System.out.println(c1.compareTo(c3));
        System.out.println(c2.compareTo(c3));
        System.out.println(c1.compareTo(c4));
        boolean result1 = Utils.isInRange(c1, c2, c3);
        System.out.println(result1);
    }
}
