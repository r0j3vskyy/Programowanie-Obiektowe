package Zestaw6;

import Zestaw4.ProduktPrzemyslowy;

public class Komputer extends ProduktPrzemyslowy implements UrzadzenieElektroniczne {
    private String cpu;
    private int rdzenie;
    private int pamiecRamGB;
    private int dyskGB;
    private String typDysku;
    private String gpu;
    private boolean czyLaptop;
    private double przekatnaEkranu;
    private String os;

    public Komputer(String nazwa, double cena, int iloscNaMagazynie, String producent, int gwarancja,
                    String cpu, int rdzenie, int pamiecRamGB, int dyskGB, String typDysku, String gpu, boolean czyLaptop, double przekatnaEkranu, String os){
        super(nazwa, cena, iloscNaMagazynie, producent, gwarancja);
        if (rdzenie <= 0) throw new IllegalArgumentException("Liczba rdzeni musi byc dodatnia");
        if (pamiecRamGB <= 0) throw new IllegalArgumentException("RAM musi byc dodatni");
        this.cpu = cpu;
        this.rdzenie = rdzenie;
        this.pamiecRamGB = pamiecRamGB;
        this.dyskGB = dyskGB;
        this.typDysku = typDysku;
        this.gpu = gpu;
        this.czyLaptop = czyLaptop;
        this.przekatnaEkranu = przekatnaEkranu;
        this.os = os;
    }
    public Komputer(String nazwa, double cena, int iloscNaMagazynie, String producent, int gwarancja){
        super(nazwa, cena, iloscNaMagazynie, producent, gwarancja);
    }

    public String getCpu(){
        return cpu;
    }
    public void setCpu(String cpu){
        if (cpu == null) throw new IllegalArgumentException("CPU nie moze byc nullem");
        this.cpu = cpu;
    }

    public int getRdzenie(){
        return rdzenie;
    }
    public void setRdzenie(int rdzenie){
        if (rdzenie <= 0) throw new IllegalArgumentException("Liczba rdzeni musi byc dodatnia");
        this.rdzenie = rdzenie;
    }

    public int getPamiecRamGB(){
        return pamiecRamGB;
    }
    public void setPamiecRamGB(int pamiecRamGB){
        if (pamiecRamGB <= 0) throw new IllegalArgumentException("RAM musi byc dodatni");
        this.pamiecRamGB = pamiecRamGB;
    }

    public int getDyskGB(){
        return dyskGB;
    }
    public void setDyskGB(int dyskGB){
        if (dyskGB < 0) throw new IllegalArgumentException("Dysk nie moze byc ujemny");
        this.dyskGB = dyskGB;
    }

    public String getTypDysku(){
        return typDysku;
    }
    public void setTypDysku(String typDysku){
        this.typDysku = typDysku;
    }

    public String getGpu(){
        return gpu;
    }
    public void setGpu(String gpu){
        this.gpu = gpu;
    }

    public boolean isCzyLaptop(){
        return czyLaptop;
    }
    public void setCzyLaptop(boolean czyLaptop){
        this.czyLaptop = czyLaptop;
    }

    public double getPrzekatnaEkranu(){
        return przekatnaEkranu;
    }
    public void setPrzekatnaEkranu(double przekatnaEkranu){
        if (przekatnaEkranu < 0) throw new IllegalArgumentException("Przekatna nie moze byc ujemna");
        this.przekatnaEkranu = przekatnaEkranu;
    }

    public String getOs(){
        return os;
    }
    public void setOs(String os){
        this.os = os;
    }

    @Override
    public void napraw(){
        System.out.println("Naprawiam komputer.");
    }
    @Override
    public void uzyj(){
        System.out.println("Uzywam komputera.");
    }
    @Override
    public void zepsuj(){
        System.out.println("Psuje komputer");
    }
    @Override
    public void wlacz(){
        System.out.println("Wlaczam komputer");
    }
    @Override
    public void wylacz(){
        System.out.println("Wylaczam komputer.");
    }
}
