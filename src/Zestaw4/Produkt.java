package Zestaw4;

import java.util.Objects;

public class Produkt implements ProduktI {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie){
        setNazwa(nazwa);
        setCena(cena);
        setIlosc(iloscNaMagazynie);
    }

    public String getNazwa(){
        return nazwa;
    }
    public void setNazwa(String nazwa){
        if (nazwa == null || nazwa.trim().isEmpty()){
            throw new IllegalArgumentException("Nazwa nie moze byc pusta.");
        }
        this.nazwa = nazwa;
    }

    public double getCena(){
        return cena;
    }
    public void setCena(double cena){
        if (cena <= 0){
            throw new IllegalArgumentException("Cena musi byc wieksza niz 0.");
        }
        this.cena = cena;
    }

    public int getIlosc(){
        return iloscNaMagazynie;
    }
    public void setIlosc(int ilosc){
        if (ilosc < 0){
            throw new IllegalArgumentException("Ilosc nie moze byc ujemna");
        }
        this.iloscNaMagazynie = ilosc;
    }

    // public String wyswietlInformacje(){
    //     return "Nazwa: " + nazwa + "\nCena: " + cena + "\nIlosc na magazynie: " + iloscNaMagazynie;
    // }

    public void dodajDoMagazynu(int ilosc){
        iloscNaMagazynie += ilosc;
    }

    public void usunZMagazynu(int ilosc){
        if (iloscNaMagazynie >= ilosc){
            iloscNaMagazynie -= ilosc;
        } else System.out.println("Zapotrzebowanie wieksze, niz jest na magazynie.");
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Produkt p = (Produkt) obj;
        return Double.compare(cena, p.cena) == 0 && Objects.equals(nazwa, p.nazwa);
    }
    @Override
    public String toString(){
        return String.format("Produkt [Nazwa: %s, Cena: %.2f]", nazwa, cena);
    }
    @Override
    public int hashCode(){
        return Objects.hash(nazwa, cena);
    }
}
