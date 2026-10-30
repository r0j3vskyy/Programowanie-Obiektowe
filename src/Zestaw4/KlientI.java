package Zestaw4;

public interface KlientI {
    void dodajZamowienie(Zamowienie zam);
    double obliczLacznyKosztZamowien();

    default void dodajZamowienieBezpiecznie(Zamowienie zam){
        if (zam == null){
            System.out.println("Nie mozna dodac pustego zamowienia");
            return;
        }
        if (zam.getKoszyk() == null || zam.getKoszyk().obliczCalkowitaWartosc() <= 0.0){
            System.out.println("Zamowienie jest puste lub koszyk nie istnieje.");
            return;
        }
        dodajZamowienie(zam);
    }
}
