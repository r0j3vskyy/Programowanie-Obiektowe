package Zestaw6;

import Zestaw4.ProduktPrzemyslowy;

public class Koszulka extends ProduktPrzemyslowy implements Ubranie {
    private String rozmiar;
    private String material;
    private String kolor;

    public Koszulka(String nazwa, double cena, int iloscNaMagazynie, String producent, int gwarancja){
        super(nazwa, cena, iloscNaMagazynie, producent, gwarancja);
    }
    public Koszulka(String nazwa, double cena, int iloscNaMagazynie, String producent, int gwarancja, String rozmiar, String material, String kolor){
        super(nazwa, cena, iloscNaMagazynie, producent, gwarancja);
        setRozmiar(rozmiar);
        setMaterial(material);
        setKolor(kolor);
    }

    public void setRozmiar(String rozmiar){
        if (rozmiar == null || rozmiar.trim().isEmpty()){
            throw new IllegalArgumentException("Koszulka musi miec rozmiar");
        }
        this.rozmiar = rozmiar;
    }
    public String getRozmiar(){ return rozmiar; }

    public void setMaterial(String material){
        if (material == null || material.trim().isEmpty()){
            throw new IllegalArgumentException("Koszulka musi miec jakis material");
        }
        this.material = material;
    }
    public String getMaterial() { return material; }

    public void setKolor(String kolor){
        if (kolor == null || kolor.trim().isEmpty()) {
            throw new IllegalArgumentException("Koszulka musi miec kolor");
        }
        this.kolor = kolor;
    }
    public String getKolor() { return kolor; }


    @Override
    public void wypierz(){
        System.out.println("Piore koszulke");
    }
    @Override
    public void wysusz(){
        System.out.println("Susze koszulke");
    }
    @Override
    public void wyprasuj(){
        System.out.println("Prasuje koszulke");
    }
    @Override
    public void zaloz(){
        System.out.println("Zakladam koszulke");
    }
    @Override
    public void zniszcz(){
        System.out.println("Niszcze koszulke.");
    }
}
