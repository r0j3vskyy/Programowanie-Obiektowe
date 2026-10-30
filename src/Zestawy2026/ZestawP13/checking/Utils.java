package Zestawy2026.ZestawP13.checking;

public class Utils {
    public static <T> boolean search(T[] tab, T elem){
        if (tab == null)
            throw new IllegalArgumentException("Tablica nie moze byc nullem");
        if (elem == null)
            throw new IllegalArgumentException("Element nie moze byc nullem");

        for (int i=0; i<tab.length; i++){
            if (elem.equals(tab[i])){
                return true;
            }
        }
        return false;
    }
}
