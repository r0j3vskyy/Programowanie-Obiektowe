package Zestaw4;

public class ProduktPrzemyslowy extends Produkt {
    private final String producent;
    private final int gwarancjaMiesiecy;

    public ProduktPrzemyslowy(String nazwa, double cena, int iloscNaMagazynie, String producent, int gwarancjaMiesiecy){
        super(nazwa, cena, iloscNaMagazynie);
        if (producent == null || producent.trim().isEmpty()){
            throw new IllegalArgumentException("Producent nie moze byc pusty");
        }
        if (gwarancjaMiesiecy < 0){
            throw new IllegalArgumentException("Gwarancja nie moze byc ujemna");
        }
        this.producent = producent;
        this.gwarancjaMiesiecy = gwarancjaMiesiecy;
    }

    public String getProducent(){
        return producent;
    }

    public int getGwarancjaMiesiecy(){
        return gwarancjaMiesiecy;
    }

    @Override
    public String toString(){
        return String.format("%s, Producent: %s, Gwarancja: %d mies.", super.toString(), producent, gwarancjaMiesiecy);
    }
}
