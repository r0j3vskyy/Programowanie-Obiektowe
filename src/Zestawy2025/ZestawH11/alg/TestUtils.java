package Zestawy2025.ZestawH11.alg;

import java.util.HashMap;

public class TestUtils {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "jeden");
        map1.put(2, "dwa");
        System.out.println(Utils.allValuesSame(map1));
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1, "jeden");
        map2.put(2, "jeden");
        System.out.println(Utils.allValuesSame(map2));
    }
}
