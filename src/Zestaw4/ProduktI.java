package Zestaw4;

public interface ProduktI {
    void dodajDoMagazynu(int ilosc);
    void usunZMagazynu(int ilosc);

    default void dodajDoMagazynuCheck(int ilosc){
        if (ilosc <= 0){
            System.out.println("Ilosc musi byc wieksza od 0");
            return;
        }
        dodajDoMagazynu(ilosc);
    }
}
