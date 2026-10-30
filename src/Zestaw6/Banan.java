package Zestaw6;

import Zestaw4.ProduktSpozywczy;
import java.time.LocalDate;

public class Banan extends ProduktSpozywczy implements Owoc {
    public Banan(String nazwa, double cena, int ilosc, LocalDate data){
        super(nazwa, cena, ilosc, data);
    }

    @Override
    public String smak(){
        return "slodki";
    }

    @Override
    public void umyj(){
        System.out.println("Obieram i myje banana.");
    }

    @Override
    public void zjedz(){
        System.out.println("Zjadam banana.");
    }
}
