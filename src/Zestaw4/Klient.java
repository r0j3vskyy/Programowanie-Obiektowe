package Zestaw4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import Zestaw5.Adres;
import Zestaw6.Osoba;

public class Klient extends Osoba implements KlientI {
    private List<Zamowienie> listaZamowien;
    private Adres adres;

    public Klient(String imie, String nazwisko, Adres adres){
        super(imie, nazwisko);
        setAdres(adres);
        this.listaZamowien = new ArrayList<>();
    }

    public List<Zamowienie> getZamowienie(){
        return listaZamowien;
    }
    public void setZamowienie(List<Zamowienie> zam){
        if (zam == null){
            throw new IllegalArgumentException("Zamowienie nie moze byc nullem.");
        }
        this.listaZamowien = zam;
    }

    public Adres getAdres(){
        return adres;
    }
    public void setAdres(Adres adres){
        if (adres == null){
            throw new IllegalArgumentException("Adres nie moze byc nullem.");
        }
        this.adres = adres;
    }

    public void dodajZamowienie(Zamowienie zam){
        if (zam == null) return;
        if (this.listaZamowien == null){
            this.listaZamowien = new ArrayList<>();
        }
        this.listaZamowien.add(zam);
        System.out.println("Dodano zamówienie dla klienta: " + getImie() + " " + getNazwisko());
    }

    // public void wyswietlHistorieZamowien(){
    //     if (listaZamowien.isEmpty()){
    //         System.out.println("Brak zamówień w historii.");
    //         return;
    //     }
    //     System.out.println("Historia zamówień klienta: " +imie + " " + nazwisko);
    //     for (int i=0; i<listaZamowien.size(); i++){
    //         System.out.println("Zamówienie #" + (i+1));
    //         listaZamowien.get(i).wyswietlZamowienie();
    //     }
    // }

    public double obliczLacznyKosztZamowien(){
        double lacznyKoszt = 0.0;
        if (listaZamowien == null || listaZamowien.isEmpty()) return 0.0;
        for (int i=0; i<listaZamowien.size(); i++){
            Zamowienie z = listaZamowien.get(i);
            lacznyKoszt += z.getKoszyk().obliczCalkowitaWartosc();
        }
        return lacznyKoszt;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Klient klient = (Klient) obj;
        return Objects.equals(getImie(), klient.getImie()) && Objects.equals(getNazwisko(), klient.getNazwisko()) && Objects.equals(adres, klient.adres);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("--- Dane klienta ---");
        sb.append("Imie i nazwisko: ").append(getImie()).append(" ").append(getNazwisko()).append("\n");
        sb.append("Adres: ").append(adres.toString()).append("\n");
        sb.append("Liczba zamowien: ").append(listaZamowien.size()).append("\n");
        sb.append("Laczny koszt: ").append(obliczLacznyKosztZamowien()).append("pln\n");
        if (listaZamowien != null && !listaZamowien.isEmpty()){
            sb.append("Historia zamowien: \n");
            for (int i=0; i<listaZamowien.size(); i++){
                sb.append(" ").append(i+1).append(listaZamowien.get(i).toString()).append("\n");
            }
        }
        return sb.toString();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getImie(), getNazwisko(), adres);
    }
}
