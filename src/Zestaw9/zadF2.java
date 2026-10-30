package Zestaw9;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;

public class zadF2 {
    public static <T> List<T> removeMinMax(TreeSet<T> treeset){
        if(treeset != null && treeset.size() >= 2){
            List<T> pair = new ArrayList<>();
            pair.add(treeset.pollFirst());
            pair.add(treeset.pollLast());
            return pair;
        }
        else {
            return null;
        }
    }

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        numbers.add(20);
        System.out.println("Before:" +numbers);
        System.out.println(removeMinMax(numbers));
        System.out.println("After: " +numbers);
    }
}
