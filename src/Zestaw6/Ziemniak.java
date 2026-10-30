package Zestaw6;

import Zestaw4.ProduktSpozywczy;
import java.time.LocalDate;

public class Ziemniak extends ProduktSpozywczy implements Warzywo {
    public Ziemniak(String nazwa, double cena, int ilosc, LocalDate data){
        super(nazwa, cena, ilosc, data);
    }

    @Override
    public String smak(){
        return "ziemniaczany";
    }

    @Override
    public void umyj(){
        System.out.println("Szoruje ziemniaka.");
    }

    @Override
    public void zjedz(){
        System.out.println("Zjadam ziemniaka.");
    }
}
