package PrzykladoweZadania.Nr2.CloneableArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> oceny = new ArrayList<>(Arrays.asList(3, 4, 5));
            Student s1 = new Student("Tomasz", oceny);
            Student s2 = s1.clone();

            s1.changeFirstGrade(10);
            System.out.println(s1);
            System.out.println(s2);
        }
        catch (CloneNotSupportedException ex){
            System.out.println("Blad: " +ex);
        }
    }
}
