package Zestaw6;

import Zestaw4.ProduktSpozywczy;
import java.time.LocalDate;

public class Brokul extends ProduktSpozywczy implements Warzywo {
    public Brokul(String nazwa, double cena, int ilosc, LocalDate data){
        super(nazwa, cena, ilosc, data);
    }

    @Override
    public String smak(){
        return "sredni";
    }

    @Override
    public void umyj(){
        System.out.println("Myje brokul.");
    }

    @Override
    public void zjedz(){
        System.out.println("Zjadam brokul");
    }
}
