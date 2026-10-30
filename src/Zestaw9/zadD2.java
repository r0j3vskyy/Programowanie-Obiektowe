package Zestaw9;

import java.util.LinkedList;

// Zadanie D2
public class zadD2 {
    public static <T> LinkedList<T> findCommonElements(LinkedList<T> list1, LinkedList<T> list2){
        LinkedList<T> newList = new LinkedList<>();
        for (T t : list1) {
            if (list2.contains(t)){
                if (!newList.contains(t)){
                    newList.add(t);
                }
            }
        }
        return newList;
    }
    public static void main(String[] args) {
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("A");
        lista1.add("B");
        lista1.add("C");
        lista1.add("A");

        LinkedList<String> lista2 = new LinkedList<>();
        lista2.add("C");
        lista2.add("D");
        lista2.add("E");
        lista2.add("D");

        LinkedList<String> commonStringList = findCommonElements(lista1, lista2);
        System.out.println("Lista1: "+lista1);
        System.out.println("Lista2: "+lista2);
        System.out.println("Unique: "+commonStringList);
    }
}
