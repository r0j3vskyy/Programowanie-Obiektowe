package Zestawy2026.ZestawP11.tech;

public class Utils {
    public static <T extends Comparable<T>> T firstMinValue(T[] array){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Tablica nie moze byc null ani pusta.");
        }
        T minElement = array[0];
        int count = 1;
        for (int i=1; i<array.length; i++){
            int compararer = array[i].compareTo(minElement);
            if (compararer < 0){
                minElement = array[i];
                count = 1;
            } else if (compararer == 0){
                count++;
            }
        }
        if (count > 1){
            throw new IllegalStateException("Minimalny element wystepuje wiecej niz raz");
        }
        return minElement;
    }
}
