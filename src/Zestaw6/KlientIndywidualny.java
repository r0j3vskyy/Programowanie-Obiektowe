package Zestaw6;

import Zestaw4.Klient;
import Zestaw5.Adres;

public class KlientIndywidualny extends Klient {
    private final String pesel;

    public KlientIndywidualny(String imie, String nazwisko, Adres adres, String pesel){
        super(imie, nazwisko, adres);
        if (pesel == null || pesel.trim().isEmpty()){
            throw new IllegalArgumentException("Nieprawidlowy PESEL");
        }
        this.pesel = pesel;
    }

    public String getPesel(){
        return pesel;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("PESEL: %s", pesel);
    }
}
