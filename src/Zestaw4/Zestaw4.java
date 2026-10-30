package Zestaw4;

public class Zestaw4 {
    public static void main(String[] args) {
        Trojkat t1 = new Trojkat(3, 4, 5);
        System.out.println(t1.obwod());
        System.out.println(t1.pole());

        Produkt p1 = new Produkt("Ksiazka", 15.80, 7);
        System.out.println(p1.toString());
        p1.dodajDoMagazynu(5);
        System.out.println(p1.toString());
        Produkt p2 = new Produkt("Zegarek", 21.37, 17);

        KoszykZakupowy kosz = new KoszykZakupowy();
        System.out.println(kosz.toString());
        kosz.dodajProdukt(p1, 5);
        kosz.dodajProdukt(p2, 7);
        System.out.println(kosz.toString());
        kosz.obliczCalkowitaWartosc();

        Zamowienie zam = new Zamowienie(kosz, StatusZamowienia.NOWE);
        zam.setPlatnosc(new Platnosc(kosz.obliczCalkowitaWartosc()));
        zam.getPlatnosc().zaplac(kosz.obliczCalkowitaWartosc());

        zam.ustawStatusZamowienia(StatusZamowienia.ZREALIZOWANE);
        System.out.println(zam.toString());
        zam.finalizujZamowienie();
        zam.zwrocProdukt(p2, 3);

        // Klient kli1 = new Klient("Robert", "Lewandowski");
        // kli1.dodajZamowienie(zam);
        // kli1.wyswietlHistorieZamowien();
        // kli1.obliczLacznyKosztZamowien();

        // Sklep biedronka = new Sklep();
        // biedronka.dodajProdukt(p1);
        // biedronka.dodajProdukt(p2);
        // biedronka.wyswietlOferty();
        // biedronka.wyszukajProdukt("Zegarek");
        // biedronka.zakupy("Ksiazka", 2, kosz);
        // System.out.println(kosz.obliczCalkowitaWartosc());
    }
    public String getClass(Object object){
        return "Cześć, jestem klasą " +object.getClass().getSimpleName();
    }
}
