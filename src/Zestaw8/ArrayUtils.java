package Zestaw8;

public class ArrayUtils {
    public static <T> void swap(T[] array, int i, int j){
        if (i<0 || j<0 || i>array.length || j>array.length){
            throw new IllegalArgumentException("");
        }
    if (i == j) return;

    T temp = array[i];
    array[i] = array[j];
    array[j] = temp;
    }
}
