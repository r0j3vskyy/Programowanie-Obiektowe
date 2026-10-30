package Zestaw9;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

// Zadanie A1
public class zadA1 {
    public static <T> void printUnique(Collection<T> items){
        Set<T> uniqueElements = new HashSet<>();
        uniqueElements.addAll(items);
        for (T element: uniqueElements){
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        Collection<String> namesList = new ArrayList<>();
        namesList.add("Robert");
        namesList.add("Jan");
        namesList.add("Pawel");
        namesList.add("Jan");
        namesList.add("Kamil");
        printUnique(namesList);

        Collection<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(15);
        numbersList.add(21);
        numbersList.add(15);
        numbersList.add(10);
        printUnique(numbersList);
    }
}
