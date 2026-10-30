package Zestawy2025.ZestawH13.dataProcessing;

import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Utils {
    public static <K, V> HashSet<K> getUniqueValues(HashMap<K, V> map, V value1, V value2){
        if (map == null || value1 == null || value2 == null)
            throw new NullPointerException("Argumenty nie moga byc nullami");
        HashSet<K> keys = new HashSet<>();
        for (Map.Entry<K, V> entry: map.entrySet()){
            V currentValue = entry.getValue();
            if (currentValue.equals(value1) || currentValue.equals(value2))
                keys.add(entry.getKey());
        }
        return keys;
    }
}
