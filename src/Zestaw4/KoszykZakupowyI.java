package Zestaw4;

import Zestaw5.Magazyn;

public interface KoszykZakupowyI {
    void dodajProdukt(Produkt p, int ilosc);
    void dodajProdukt(Magazyn mag, Produkt p, int ilosc);
    double obliczCalkowitaWartosc();

    default void dodajProduktBezpiecznie(Produkt p, int ilosc){
        if (p == null){
            System.out.println("Produkt nie istnieje");
            return;
        }
        if (ilosc <= 0){
            System.out.println("Ilosc musi byc wieksza od 0");
            return;
        }
        dodajProdukt(p, ilosc);
    }
}
