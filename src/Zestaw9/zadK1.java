package Zestaw9;

import java.util.HashMap;

public class zadK1 {
    public static <K, V> HashMap<V, Integer> countValueOccurences(HashMap<K, V> map){
        HashMap<V, Integer> occurencesMap = new HashMap<>();
        for (V value: map.values()){
            occurencesMap.put(value, occurencesMap.getOrDefault(value, 0)+1);
        }
        return occurencesMap;
    }

    public static void main(String[] args) {
        HashMap<Integer, String> names = new HashMap<>();
        names.put(1, "Karolina");
        names.put(2, "?ukasz");
        names.put(3, "Karolina");
        names.put(4, "Krzysztof");
        names.put(5, "?ukasz");
        names.put(6, "Karolina");
        HashMap<String, Integer> result = countValueOccurences(names);
        System.out.println(result);
    }
}
