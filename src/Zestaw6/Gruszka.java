package Zestaw6;

import Zestaw4.ProduktSpozywczy;
import java.time.LocalDate;

public class Gruszka extends ProduktSpozywczy implements Owoc {
    public Gruszka(String nazwa, double cena, int ilosc, LocalDate data){
        super(nazwa, cena, ilosc, data);
    }

    @Override
    public String smak(){
        return "kwasna";
    }

    @Override
    public void umyj(){
        System.out.println("Myje gruszke.");
    }

    @Override
    public void zjedz(){
        System.out.println("Zjadam gruszke.");
    }
}
