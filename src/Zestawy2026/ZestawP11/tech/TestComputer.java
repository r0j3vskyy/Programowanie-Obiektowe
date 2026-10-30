package Zestawy2026.ZestawP11.tech;

public class TestComputer {
    public static void main(String[] args) {
        Computer[] komps = {
        new Computer(2137, "Asus"),
        new Computer(2111, "Acer")
        };
        Computer min = Utils.firstMinValue(komps);
        System.out.println("Minimalny komputer: " +min);
    }
}
