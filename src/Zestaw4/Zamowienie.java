package Zestaw4;


enum StatusZamowienia{
    NOWE,
    WYSLANE,
    GOTOWE_DO_WYSYLKI,
    ANULOWANE,
    ZREALIZOWANE
}

public class Zamowienie implements ZamowienieI {
    private KoszykZakupowy koszyk;
    private StatusZamowienia statusZamowienia;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy kosz, StatusZamowienia status){
        setKoszyk(kosz);
        setStatus(status);
        this.platnosc = new Platnosc(koszyk.obliczCalkowitaWartosc());
    }

    public KoszykZakupowy getKoszyk(){
        return koszyk;
    }
    public void setKoszyk(KoszykZakupowy koszyk){
        if (koszyk == null){
            throw new IllegalArgumentException("Koszyk nie moze byc nullem");
        }
        this.koszyk = koszyk;
    }

    public StatusZamowienia getStatus(){
        return statusZamowienia;
    }
    public void setStatus(StatusZamowienia statusZamowienia){
        this.statusZamowienia = statusZamowienia;
    }

    public Platnosc getPlatnosc(){
        return platnosc;
    }
    public void setPlatnosc(Platnosc platnosc){
        if (platnosc == null) {
            throw new IllegalArgumentException("Platnosc nie moze byc nullem");
        }
        this.platnosc = platnosc;
    }

    public void ustawStatusZamowienia(StatusZamowienia nowyStatus){
        this.statusZamowienia = nowyStatus;
        System.out.println("Zmieniono status zamówienia na: " + nowyStatus);
    }

    // public void wyswietlZamowienie(){
    //     System.out.println("---- Szczegóły zamówienia ----");
    //     koszyk.toString();
    //     System.out.println("Do zapłaty: " + koszyk.obliczCalkowitaWartosc());
    //     System.out.println("\nStatus: " + statusZamowienia);
    // }

    public void finalizujZamowienie(){
        if (platnosc.getStatus() == StatusPlatnosci.OPLACONE){
            ustawStatusZamowienia(StatusZamowienia.GOTOWE_DO_WYSYLKI);
            System.out.println("Zamówienie gotowe do wysyłki.");
        }
        else {
            System.out.println("Finalizacja zamówienia niemożliwa. Status to: " +platnosc.getStatus());
        }
    }

    public void zwrocProdukt(Produkt p, int iloscZwrotu){
        for (int i=0; i<koszyk.getIlosci().size(); i++){
            Produkt prodWkoszyku = koszyk.getListaProduktow().get(i);
            int ileWkoszyku = koszyk.getIlosci().get(i);

            if (prodWkoszyku == p){
                if (iloscZwrotu > ileWkoszyku){
                    System.out.println("Blad. Nie mozna zwrocic wiecej niz kupiono");
                    return;
                }
            
            p.setIlosc(p.getIlosc() + iloscZwrotu);

            int nowaIlosc = ileWkoszyku - iloscZwrotu;
            if (nowaIlosc == 0){
                koszyk.getListaProduktow().remove(i);
                koszyk.getIlosci().remove(i);
            } else {
                koszyk.getIlosci().set(i, nowaIlosc);
            }

            double zwrotKwoty = p.getCena() * iloscZwrotu;
            platnosc.setKwota(platnosc.getKwota() - zwrotKwoty);
            System.out.println("Zwrot produktu: " + p.getNazwa() + " ilosc: " + iloscZwrotu + " kwota: " + zwrotKwoty);
            return;
            }
        }
        System.out.println("Tego produktu nie ma w zamówieniu.");
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("----- Zamowienie -----\n");
        sb.append("Status zamowienia: ").append(statusZamowienia.name()).append("\n");
        sb.append(koszyk.toString());
        sb.append("\nSzczegoly platnosci: ").append(platnosc.toString());
        sb.append("\n-----------------\n");
        return sb.toString();
    }
}
