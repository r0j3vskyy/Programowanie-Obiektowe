package Zestawy2025.ZestawH14.limitVerifier;

public class TestLimit {
    public static void main(String[] args) {
        Integer score = 150;
        Integer min = 0;
        Integer max = 100;
        boolean result1 = Utils.isOutOfRange(score, min, max);
        System.out.println(result1);

        String name = "Pawe?";
        String lower = "Oliwia";
        String upper = "Zosia";
        boolean result2 = Utils.isOutOfRange(name, lower, upper);
        System.out.println(result2);
    }
}
