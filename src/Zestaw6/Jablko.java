package Zestaw6;

import Zestaw4.ProduktSpozywczy;
import java.time.LocalDate;

public class Jablko extends ProduktSpozywczy implements Owoc {
    public Jablko(String nazwa, double cena, int ilosc, LocalDate data){
        super(nazwa, cena, ilosc, data);
    }

    @Override
    public String smak(){
        return "slodkie";
    }
    @Override
    public void umyj(){
        System.out.println("Myje jablko.");
    }
    @Override
    public void zjedz(){
        System.out.println("Zjadam jablko.");
    }
}
