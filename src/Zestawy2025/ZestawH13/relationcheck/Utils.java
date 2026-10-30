package Zestawy2025.ZestawH13.relationcheck;

public class Utils {
    public static <T extends Comparable<T>> void check(T[] array, T target){
        if (array == null || target == null) 
            throw new NullPointerException("argumenty nie moga byc null");
        System.out.println("Elementy wieksze lub rowne " +target+ ": ");
        for (T element: array){
            if (element != null && element.compareTo(target) >= 0)
                System.out.print(element+ " ");
        }
        System.out.println();
    }
}
