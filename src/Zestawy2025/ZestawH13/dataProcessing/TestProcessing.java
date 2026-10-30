package Zestawy2025.ZestawH13.dataProcessing;

import java.util.HashMap;
import java.util.HashSet;

public class TestProcessing {
    public static void main(String[] args) {
        HashMap<Integer, String> colors = new HashMap<>();
        colors.put(1, "red");
        colors.put(2, "blue");
        colors.put(3, "white");
        colors.put(4, "black");
        colors.put(5, "green");
        HashSet<Integer> result = Utils.getUniqueValues(colors, "red", "black");
        System.out.println(result);
    }
}
