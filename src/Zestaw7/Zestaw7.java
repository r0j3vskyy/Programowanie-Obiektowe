package Zestaw7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zestaw7 {
    public static void main(String[] args) {
        Punkt3D p1 = new Punkt3D(1.0, 2.0, 3.0);
        Punkt3D p2 = new Punkt3D(5.0, 8.0, 7.0);

        System.out.println(p1);
        System.out.println(p2);

        double odleglosc1 = p1.odlegloscDo(p2);
        System.out.printf("Odleglosc p1 do p2 przed zmiana: %.2f \n", odleglosc1);

        Punkt3D p2Zmieniony = new Punkt3D(p2.x(), p2.y(), 10.0);
        System.out.println("Oryginalny p2:" + p2);
        System.out.println("P2 po zmianie:" + p2Zmieniony);

        double odleglosc2 = p1.odlegloscDo(p2Zmieniony);
        System.out.printf("Odleglosc p1 do p2 po zmianie: %.2f \n", odleglosc2);

        List<Punkt3D> punkty = new ArrayList<>();
        punkty.add(new Punkt3D(1.0, 0.0, 0.0));
        punkty.add(p2);
        punkty.add(p1);
        punkty.add(p2Zmieniony);
        punkty.add(new Punkt3D(3.0, 4.0, 0.0));

        System.out.println("Przed sortowaniem");
        punkty.forEach(p -> System.out.printf("%s, Odleglosc od (0,0,0): %.2f\n", p, p.odlegloscDo(new Punkt3D(0.0, 0.0, 0.0))));
        
        System.out.println("Po sortowaniu:");
        Collections.sort(punkty);
        punkty.forEach(p -> System.out.printf("%s, Odleglosc od (0,0,0): %.2f\n", p, p.odlegloscDo(new Punkt3D(0.0, 0.0, 0.0))));


        Punkt3D start = new Punkt3D(1.0, 1.0, 1.0);
        Punkt3D koniec = new Punkt3D(4.0, 5.0, 7.0);
        Wektor3D wektor1 = new Wektor3D(start, koniec);
        System.out.println("Wektor z dwoch punktow: " + wektor1);
        Wektor3D wektor2 = new Wektor3D(2.0, 1.0, -1.0);
        System.out.println("Wektor kanoniczny: " + wektor2);
        System.out.printf("Wektor 1 modul: %.2f \n", wektor1.modul());
        System.out.printf("Wektor 2 modul: %.2f \n", wektor2.modul());

        Ksiazka k1 = new Ksiazka("A", "X", LocalDate.now(), "100");
        Ksiazka k2 = new Ksiazka("B", "Y", LocalDate.now(), "200");
        Ksiazka k3 = new Ksiazka("C", "Z", LocalDate.now(), "300");

        List<Ksiazka> zbiorA = new ArrayList<>();
        for (int i=0; i<10; i++) zbiorA.add(k1);
        Punkt3D pA = new Punkt3D(10, 20, 100);
        Biblioteka bibliotekaA = new Biblioteka(zbiorA, pA);

        List<Ksiazka> zbiorB = new ArrayList<>();
        for (int i=0; i<5; i++) zbiorB.add(k2);
        Punkt3D pB = new Punkt3D(10, 20, 300);
        Biblioteka bibliotekaB = new Biblioteka(zbiorB, pB);

        List<Ksiazka> zbiorC = new ArrayList<>();
        for (int i=0; i<10; i++) zbiorC.add(k3);
        Punkt3D pC = new Punkt3D(10, 20, 500);
        Biblioteka bibliotekaC = new Biblioteka(zbiorC, pC);

        List<Biblioteka> listaBibliotek = new ArrayList<>();
        listaBibliotek.add(bibliotekaA); listaBibliotek.add(bibliotekaB); listaBibliotek.add(bibliotekaC);
        System.out.println("Przed sortowaniem:");
        listaBibliotek.forEach(p -> System.out.printf("Rozmiar: %d, Wysokosc: %.0f m, Lokalizacja: %s%n", p.getWielkoscZbioru(), p.getWysokoscNPM(), p.getLokalizacja().toString()));

        Collections.sort(listaBibliotek);
        System.out.println("Po sortowaniu:");
        listaBibliotek.forEach(p -> System.out.printf("Rozmiar: %d, Wysokosc: %.0f m, Lokalizacja: %s%n", p.getWielkoscZbioru(), p.getWysokoscNPM(), p.getLokalizacja().toString()));

    }
}
