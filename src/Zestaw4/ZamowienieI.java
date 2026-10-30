package Zestaw4;

public interface ZamowienieI {
    void ustawStatusZamowienia(StatusZamowienia nowyStatus);
    void finalizujZamowienie();
    void zwrocProdukt(Produkt p, int iloscZwrotu);

    default void zwrocProduktBezpiecznie(Produkt p, int iloscZwrotu){
        if (p == null){
            System.out.println("Brak podanego produktu do zwrotu");
            return;
        }
        if (iloscZwrotu <= 0){
            System.out.println("Ilosc zwrotu musi byc wieksza niz 0");
            return;
        }
        zwrocProdukt(p, iloscZwrotu);
    }
}
