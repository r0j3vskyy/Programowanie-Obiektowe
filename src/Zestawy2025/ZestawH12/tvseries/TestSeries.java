package Zestawy2025.ZestawH12.tvseries;

import java.util.ArrayList;
import java.util.Collections;

public class TestSeries {
    public static void main(String[] args) {
        ArrayList<Series> list = new ArrayList<>();
        list.add(new Series("Breaking bad", "nie wiem", 100));
        list.add(new Series("the office", "tez nie wiem", 200));
        list.add(new Series("suits", "rezyser", 150));
        list.add(new Series("lincoln lawyer", "rezyser 2", 50));
        list.add(new Series("pamietniki z wakacji", "polski rezyser", 10000));

        Collections.sort(list);
        for (Series s: list){
            System.out.println(s);
        }
    }
}
