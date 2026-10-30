package Zestawy2026.ZestawP14.music;

import java.util.Arrays;

public class Utils {
    public static <T extends Comparable<T>> T findMedian(T[] tab){
        if (tab == null)
            throw new IllegalArgumentException("Tablica nie moze byc nullem.");
        if (tab.length == 0)
            throw new IllegalArgumentException("Tablica nie moze byc pusta.");

        T[] tempTab = tab.clone();
        Arrays.sort(tempTab);

        if (tab.length%2 == 0){
            return tempTab[tab.length/2 -1];
        }
        return tempTab[(int)tab.length/2];
    }
}
