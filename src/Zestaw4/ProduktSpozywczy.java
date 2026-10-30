package Zestaw4;

import java.time.LocalDate;

public class ProduktSpozywczy extends Produkt {
    private final LocalDate dataWaznosci;

    public ProduktSpozywczy(String nazwa, double cena, int iloscNaMagazynie, LocalDate dataWaznosci){
        super(nazwa, cena, iloscNaMagazynie);
        if (dataWaznosci == null){
            throw new IllegalArgumentException("Data ważności nie może być nullem");
        }
        this.dataWaznosci = dataWaznosci;
    }

    public LocalDate getDataWaznosci(){
        return dataWaznosci;
    }

    public boolean jestPrzeterminowany(){
        return LocalDate.now().isAfter(dataWaznosci);
    }

    @Override
    public String toString(){
        return String.format("%s, Data ważności: %s", super.toString(), dataWaznosci.toString());
    }
}
