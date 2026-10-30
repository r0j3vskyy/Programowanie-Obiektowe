package Zestawy2025.ZestawH12.shifting;

public class Utils {
    public static <T> void shiftRight(T[] tab){
        if (tab == null) throw new NullPointerException();
        if (tab.length == 0) throw new IllegalArgumentException();
        T last = tab[tab.length-1];
        for (int i=tab.length; i>0; i--){
            tab[i] = tab[i-1];
        }
        tab[0] = last;
    }
}
