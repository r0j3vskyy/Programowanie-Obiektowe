package PrzykladoweZadania.Nr3.K11;

public class Utils {
    public static <T extends Comparable<T>> T lastMaxValue(T[] tab){
        if (tab == null || tab.length == 0)
            throw new IllegalArgumentException("Tablica nie moze byc pusta ani null");
        T max = tab[0];
        for (int i=1; i<tab.length; i++){
            if (tab[i].compareTo(max) >= 0){
                max = tab[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] liczby = {1, 3, 7, 2, 7, 4};
            
        try {
            Integer wynik = Utils.lastMaxValue(liczby);
            System.out.println("Ostatni największy element: " + wynik); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
