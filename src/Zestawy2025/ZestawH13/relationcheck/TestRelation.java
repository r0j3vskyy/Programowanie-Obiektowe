package Zestawy2025.ZestawH13.relationcheck;

public class TestRelation {
    public static void main(String[] args) {
        Integer[] numbers = {1, 3, 5, 6, 2, 10, 4};
        Utils.check(numbers, 5);

        String[] words = {"Oliwia", "Tomek", "Zosia", "Bartek"};
        Utils.check(words, "Tomek");
        try {
            Utils.check(null, 5);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
