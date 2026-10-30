package Zestawy2026.Zestaw;
//package aviation;

import java.util.ArrayList;
import java.util.Arrays;

public class TestAviation {
    public static void main(String[] args) {
        ArrayList<Double> altitudes1 = new ArrayList<>(Arrays.asList(10000.0, 11000.0));
        Aircraft plane1 = new Aircraft("Boeing 737", "LOT", altitudes1);
        Aircraft plane2 = new Aircraft(null, "Lufthansa", null);
        plane1.addFlightAltitude(12000.5);
        plane1.removeFlightAltitude(10000.0);
        plane2.setModel("Airbus A320");
        plane2.addFlightAltitude(11000.0);
        plane2.addFlightAltitude(12000.5);
        System.out.println("Samolot 1: " + plane1.toString());
        System.out.println("Samolot 2: " + plane2.toString());
        System.out.println("Czy listy wysokości są identyczne? " + plane1.equals(plane2));
        System.out.println("HashCode 1: " + plane1.hashCode());
        System.out.println("HashCode 2: " + plane2.hashCode());
    }
}