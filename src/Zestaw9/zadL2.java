package Zestaw9;

import java.util.TreeMap;
import java.util.Collections;

public class zadL2 {
    public static <K, V> TreeMap<K, V> reverseOrderMap(TreeMap<K, V> map){
        TreeMap<K, V> result = new TreeMap<>(Collections.reverseOrder());
        result.putAll(map);
        return result;
    }

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Jeden");
        map.put(2, "Dwa");
        map.put(3, "Trzy");
        map.put(4, "Cztery");
        System.out.println(map);
        TreeMap<Integer, String> reversed = reverseOrderMap(map);
        System.out.println(reversed);
    }
}
