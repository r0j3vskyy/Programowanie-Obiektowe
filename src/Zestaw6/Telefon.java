package Zestaw6;

import Zestaw4.ProduktPrzemyslowy;

public class Telefon extends ProduktPrzemyslowy implements UrzadzenieElektroniczne {
    private int bateriaMah;
    private double przekatnaEkranu;
    private int pamiecRamGB;
    private int pamiecWewnetrznaGB;
    private String kolor;

    public Telefon(String nazwa, double cena, int iloscNaMagazynie, String producent, int gwarancja,
                   int bateriaMah, double przekatnaEkranu, int pamiecRamGB, int pamiecInternalGB, String kolor){
        super(nazwa, cena, iloscNaMagazynie, producent, gwarancja);
        if (bateriaMah <= 0) throw new IllegalArgumentException("Bateria musi być dodatnia");
        if (przekatnaEkranu <= 0) throw new IllegalArgumentException("Przekątna ekranu musi być dodatnia");
        this.bateriaMah = bateriaMah;
        this.przekatnaEkranu = przekatnaEkranu;
        this.pamiecRamGB = pamiecRamGB;
        this.pamiecWewnetrznaGB = pamiecInternalGB;
        this.kolor = kolor;
    }
    public Telefon(String nazwa, double cena, int iloscNaMagazynie, String producent, int gwarancja){
        super(nazwa, cena, iloscNaMagazynie, producent, gwarancja);
    }

    public int getBateriaMah(){
        return bateriaMah;
    }
    public void setBateriaMah(int bateriaMah){
        if (bateriaMah <= 0) throw new IllegalArgumentException("Bateria musi być dodatnia");
        this.bateriaMah = bateriaMah;
    }

    public double getPrzekatnaEkranu(){
        return przekatnaEkranu;
    }
    public void setPrzekatnaEkranu(double przekatnaEkranu){
        if (przekatnaEkranu <= 0) throw new IllegalArgumentException("Przekątna ekranu musi być dodatnia");
        this.przekatnaEkranu = przekatnaEkranu;
    }

    public int getPamiecRamGB(){
        return pamiecRamGB;
    }
    public void setPamiecRamGB(int pamiecRamGB){
        if (pamiecRamGB < 0) throw new IllegalArgumentException("Pamiec RAM nie moze byc ujemna");
        this.pamiecRamGB = pamiecRamGB;
    }

    public int getPamiecWewnetrznaGB(){
        return pamiecWewnetrznaGB;
    }
    public void setPamiecWewnetrznaGB(int pamiecWewnetrznaGB){
        if (pamiecWewnetrznaGB < 0) throw new IllegalArgumentException("Pamiec wewnetrzna nie moze byc ujemna");
        this.pamiecWewnetrznaGB = pamiecWewnetrznaGB;
    }

    public String getKolor(){
        return kolor;
    }
    public void setKolor(String kolor){
        if (kolor == null) throw new IllegalArgumentException("Kolor nie moze byc nullem");
        this.kolor = kolor;
    }

    @Override
    public void napraw(){
        System.out.println("Naprawiam telefon.");
    }
    @Override
    public void uzyj(){
        System.out.println("Uzywam telefonu.");
    }
    @Override
    public void zepsuj(){
        System.out.println("Psuje telefon");
    }
    @Override
    public void wlacz(){
        System.out.println("Wlaczam telefon");
    }
    @Override
    public void wylacz(){
        System.out.println("Wylaczam telefon.");
    }
}
