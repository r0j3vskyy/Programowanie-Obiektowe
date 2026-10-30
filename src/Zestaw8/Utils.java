package Zestaw8;

public class Utils {
    // Zadanie 2;
    public static <T> boolean isEqual(T ob1, T ob2){
        if (ob1 == ob2) return true;
        if (ob1 == null || ob2 == null) return false;
        return ob1.equals(ob2);
    }
    // Zadanie 15
    public static <T extends Comparable<T>> T maxValue(T[] array){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Tablica nie moze byc pusta.");
        }
        T max = array[0];
        for (int i=1; i<array.length; i++){
            if (array[i].compareTo(max) > 0){
                max = array[i];
            }
        }
        return max;
    }
    // Zadanie 22
    public static boolean compareObjects(Car object1, Car object2){
        return object1.getClass() == object2.getClass();
    }
    // Zadanie 24
    public static Bird findMin(TripleBird<? extends Bird> birdTriple){
        Bird min = birdTriple.getFirst();
        if (birdTriple.getSecond().compareTo(min) < 0){
            min = birdTriple.getSecond();
        }
        if (birdTriple.getThird().compareTo(min) < 0){
            min = birdTriple.getThird();
        }
        return min;
    }
    // Zadanie 29
    public static void findMinMaxHeight(Tree[] trees, Pair<? super Tree> result){
        if (trees == null || trees.length == 0){
            return;
        }
        Tree min = trees[0];
        Tree max = trees[0];
        for (Tree t: trees){
            if (t.compareTo(min) < 0){
                min = t;
            }
            if (t.compareTo(max) > 0){
                max = t;
            }
        }
        result.setFirst(min);
        result.setSecond(max);
    }
}