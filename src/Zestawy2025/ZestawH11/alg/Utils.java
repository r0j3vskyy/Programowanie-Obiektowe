package Zestawy2025.ZestawH11.alg;

import java.util.HashMap;

public class Utils {
    public static <K, V> boolean allValuesSame(HashMap<K,V> map){
        if (map == null) throw new NullPointerException("mapa nie moze byc null");
        if (map.containsValue(null)) throw new NullPointerException("wartosci nie moga byc null");
        if (map.isEmpty()) return true;
        V firstValue = map.values().iterator().next();
        for (V cur: map.values()){
            if (!firstValue.equals(cur)) return false;
        }
        return true;
    }
}
