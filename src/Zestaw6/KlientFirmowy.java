package Zestaw6;

import Zestaw4.Klient;
import Zestaw5.Adres;

public class KlientFirmowy extends Klient {
    private final String nip;
    private final String regon;

    public KlientFirmowy(String imie, String nazwisko, Adres adres, String nip, String regon){
        super(imie, nazwisko, adres);
        if (nip == null || nip.trim().isEmpty()){
            throw new IllegalArgumentException("Nieprawidlowy NIP");
        }
        if (regon == null || regon.trim().isEmpty()){
            throw new IllegalArgumentException("Nieprawidlowy regon");
        }
        this.nip = nip;
        this.regon = regon;
    }

    public String getNip(){
        return nip;
    }
    public String getRegon(){
        return regon;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("NIP: %s, REGON: %s", nip, regon);
    }
}
