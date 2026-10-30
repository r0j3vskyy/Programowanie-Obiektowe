package Zestaw4;

public interface SklepI {
    void dodajProdukt(Produkt p);
    Produkt wyszukajProdukt(String nazwa);
    void zakupy(String nazwa, int ilosc, KoszykZakupowy koszyk);

    default void dodajProduktSafe(Produkt p){
        if (p == null){
            System.out.println("Produkt nie istnieje");
        }
        dodajProdukt(p);
    }
}
