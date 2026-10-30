package Zestaw6;

import Zestaw4.ProduktPrzemyslowy;

public class Czapka extends ProduktPrzemyslowy implements Ubranie {

    private String rozmiar;
    private String material;
    private String kolor;

    public Czapka(String nazwa, double cena, int iloscNaMagazynie, String producent, int gwarancja){
        super(nazwa, cena, iloscNaMagazynie, producent, gwarancja);
    }

    public Czapka(String nazwa, double cena, int iloscNaMagazynie, String producent, int gwarancja,
                  String rozmiar, String material, String kolor){
        super(nazwa, cena, iloscNaMagazynie, producent, gwarancja);
        if (rozmiar == null || rozmiar.trim().isEmpty()){
            throw new IllegalArgumentException("Rozmiar nie moze byc pusty");
        }
        this.rozmiar = rozmiar;
        this.material = material;
        this.kolor = kolor;
    }

    public String getRozmiar(){
        return rozmiar;
    }
    public void setRozmiar(String rozmiar){
        if (rozmiar == null || rozmiar.trim().isEmpty()){
            throw new IllegalArgumentException("Rozmiar nie moze byc pusty");
        }
        this.rozmiar = rozmiar;
    }

    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        if (material == null) throw new IllegalArgumentException("Material nie moze byc nullem");
        this.material = material;
    }

    public String getKolor(){
        return kolor;
    }
    public void setKolor(String kolor){
        if (kolor == null) throw new IllegalArgumentException("Kolor nie moze byc nullem");
        this.kolor = kolor;
    }

    @Override
    public void wypierz(){
        System.out.println("Piore czapke");
    }
    @Override
    public void wysusz(){
        System.out.println("Susze czapke");
    }
    @Override
    public void wyprasuj(){
        System.out.println("Prasuje czapke");
    }
    @Override
    public void zaloz(){
        System.out.println("Zakladam czapke");
    }
    @Override
    public void zniszcz(){
        System.out.println("Niszcze czapke.");
    }
}
