package Zestawy2025.ZestawH11.shifting;

public class Utils {
    public static <T> void shiftLeft(T[] tab){
        if (tab == null) throw new NullPointerException("tablica nie moze byc null");
        if (tab.length == 0) throw new IllegalArgumentException("tablica nie moze byc pusta");
        T first = tab[0];
        for (int i=0; i<tab.length-1; i++){
            tab[i] = tab[i+1];
        }
        tab[tab.length-1] = first;
    }
}
