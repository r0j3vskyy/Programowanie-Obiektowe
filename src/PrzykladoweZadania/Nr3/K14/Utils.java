package PrzykladoweZadania.Nr3.K14;

public class Utils {
    public static <T extends Comparable<T>> T firstMinValue(T[] tab){
        if (tab == null || tab.length == 0)
            throw new IllegalArgumentException("Tablica nie moze byc pusta ani null");

        T min = tab[0];
        for (int i=1; i<tab.length; i++){
            if (min.compareTo(tab[i]) > 0)
                min = tab[i];
        }
        return min;
    } 

    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[4];
        fruits[0] = new Fruit("Zzz", 1.2);
        fruits[1] = new Fruit("Jablko", 1.2);
        fruits[2] = new Fruit("Banan", 4.6);
        fruits[3] = new Fruit("Wisnia", 4.5);

        System.out.println(Utils.firstMinValue(fruits));
    }
}
