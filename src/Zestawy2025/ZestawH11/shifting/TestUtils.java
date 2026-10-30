package Zestawy2025.ZestawH11.shifting;

import java.util.Arrays;

public class TestUtils {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Utils.shiftLeft(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] names = {"Tomasz", "Karolina", "Robert", "Miko?aj"};
        System.out.println(Arrays.toString(names));
        Utils.shiftLeft(names);
        System.out.println(Arrays.toString(names));
    }
}
