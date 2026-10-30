package Zestawy2026.ZestawP14.checking;

import java.util.HashSet;

public class Utils {
    public static <E> boolean checkDisjoint(HashSet<E> set1, HashSet<E> set2){
        for (E elem: set1){
            if (set2.contains(elem)){
                return false;
            }
        }
        return true;
    }
}
