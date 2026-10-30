package Zestaw9;

import java.util.ArrayList;

// Zadanie C1
public class zadC1 {
    public static <T> ArrayList<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2){
        ArrayList<T> newList = new ArrayList<>();
        newList.addAll(list1);
        newList.addAll(list2);
        return newList;
    }
    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Orzel");
        lista1.add("Zagotujesz sie");
        lista1.add("w tym swetrze");
        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Riko");
        lista2.add("Szeregowy");
        lista2.add("Skipper");
        lista2.add("Lewandowski");

        ArrayList<String> lista1i2 = mergeLists(lista1, lista2);
        System.out.println("Lista1:" +lista1);
        System.out.println("Lista2:" +lista2);
        System.out.println("Polaczone listy:" +lista1i2);

        ArrayList<Integer> lista3 = new ArrayList<>();
        lista3.add(2);
        lista3.add(1);
        ArrayList<Integer> lista4 = new ArrayList<>();
        lista4.add(3);
        lista4.add(7);

        ArrayList<Integer> lista3i4 = mergeLists(lista3, lista4);
        System.out.println("Lista3:" +lista3);
        System.out.println("Lista4:" +lista4);
        System.out.println("Polaczone: " +lista3i4);
    }
}
