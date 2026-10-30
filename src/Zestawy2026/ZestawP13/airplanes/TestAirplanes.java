package Zestawy2026.ZestawP13.airplanes;

import java.util.ArrayList;

public class TestAirplanes {
    public static void main(String[] args) {
        ArrayList<String> f1 = new ArrayList<>();
        f1.add("wygodne fotele");
        f1.add("klimatyzacja");
        Airplane plane1 = new Airplane(300, 100, f1);

        ArrayList<String> f2 = new ArrayList<>();
        f2.add("wygodne fotele");
        Airplane plane2 = new Airplane(0, 0, f2);
        
        System.out.println(plane1);
        System.out.println(plane1.equals(plane2));

        plane1.addLastFeature("klimatyzacja");
        System.out.println(plane1.equals(plane2));
        System.out.println(plane1.hashCode());

        plane1.removeLastFeature();
        System.out.println(plane1);
    }
}
