package Zestaw6;

import Zestaw4.ProduktSpozywczy;
import java.time.LocalDate;

public class Marchew extends ProduktSpozywczy implements Warzywo {
    public Marchew(String nazwa, double cena, int ilosc, LocalDate data){
        super(nazwa, cena, ilosc, data);
    }

    @Override
    public String smak(){
        return "elegancki";
    }

    @Override
    public void umyj(){
        System.out.println("Myje marchewke.");
    }

    @Override
    public void zjedz(){
        System.out.println("Zjadam marchewke.");
    }
}
