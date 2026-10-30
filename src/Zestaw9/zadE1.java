package Zestaw9;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

// Zadanie E1
public class zadE1 {
    public static <T> HashSet<T> findUniqueElements(List<T> list){
        HashSet<T> hashList = new HashSet<>(list);
        return hashList;
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("bajojajo");
        stringList.add("banan");
        stringList.add("banan");
        stringList.add("jablko");
        System.out.println("Lista1: "+stringList);
        HashSet<String> uniqueStrings = findUniqueElements(stringList);
        System.out.println("Unikalna: "+uniqueStrings);

        List<Integer> integerList = List.of(5, 1, 2, 3, 4, 5, 5, 1, 2, 7);
        HashSet<Integer> uniqueIntegers = findUniqueElements(integerList);
        System.out.println("Lista2: "+integerList);
        System.out.println("Unikalna: "+uniqueIntegers);
    }
}
