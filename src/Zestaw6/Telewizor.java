package Zestaw6;

import Zestaw4.ProduktPrzemyslowy;

public class Telewizor extends ProduktPrzemyslowy implements UrzadzenieElektroniczne {
    private double iloscCali;
    private String rozdzielczosc;
    private String rodzajMatrycy;

    public Telewizor(String nazwa, double cena, int iloscNaMagazynie, String producent, int gwarancjaMiesiecy){
        super(nazwa, cena, iloscNaMagazynie, producent, gwarancjaMiesiecy);
    }
    public Telewizor(String nazwa, double cena, int iloscNaMagazynie, String producent, int gwarancjaMiesiecy, double iloscCali, String rozdzielczosc, String rodzajMatrycy){
    super(nazwa, cena, iloscNaMagazynie, producent, gwarancjaMiesiecy);
    setCale(iloscCali);
    setRozdzielczosc(rozdzielczosc);
    setMatryca(rodzajMatrycy);
    }
    
    public double getCale() { return iloscCali; }
    public void setCale(double ileCali){
        if (ileCali >= 0) {
            throw new IllegalArgumentException("Podaj poprawna ilosc cali.");
        }
        this.iloscCali = ileCali;
    }

    public String getRozdzielczosc() {return rozdzielczosc; }
    public void setRozdzielczosc(String rozdzielczosc){
        if (rozdzielczosc == null || rozdzielczosc.isEmpty()){
            throw new IllegalArgumentException("Podaj poprawna rozdzielczosc");
        }
        this.rozdzielczosc = rozdzielczosc;
    }

    public String getMatryca() { return rodzajMatrycy; }
    public void setMatryca(String matryca){
        if (matryca == null || matryca.isEmpty()){
            throw new IllegalArgumentException("Podaj poprawna matryce");
        }
        this.rodzajMatrycy = matryca;
    }


    @Override
    public void napraw(){
        System.out.println("Naprawiam telewizor.");
    }
    @Override
    public void uzyj(){
        System.out.println("Uzywam telewizora.");
    }
    @Override
    public void zepsuj(){
        System.out.println("Psuje telewizor");
    }
    @Override
    public void wlacz(){
        System.out.println("Wlaczam telewizor");
    }
    @Override
    public void wylacz(){
        System.out.println("Wylaczam telewizor.");
    }
}
