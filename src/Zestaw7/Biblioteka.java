package Zestaw7;

import java.util.Collection;
import java.util.Objects;

public class Biblioteka implements Comparable<Biblioteka>{
    private Collection<Ksiazka> zbiorKsiazek;
    private Punkt3D lokalizacja;

    public Biblioteka(Collection<Ksiazka> zbiorKsiazek, Punkt3D lokalizacja){
        this.zbiorKsiazek = zbiorKsiazek;
        this.lokalizacja = lokalizacja;
    }
    public int getWielkoscZbioru(){ return zbiorKsiazek.size(); }
    public double getWysokoscNPM(){ return lokalizacja.z(); }
    public Punkt3D getLokalizacja(){ return lokalizacja; }

    @Override
    public int compareTo(Biblioteka inna){
        int rozmiarThis = this.getWielkoscZbioru();
        int rozmiarOther = inna.getWielkoscZbioru();
        int wynikRozmiar = Integer.compare(rozmiarThis, rozmiarOther);
        if (wynikRozmiar != 0) return wynikRozmiar;

        double wysokoscThis = this.getWysokoscNPM();
        double wysokoscOther = inna.getWysokoscNPM();
        return Double.compare(wysokoscThis, wysokoscOther);
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Biblioteka inna = (Biblioteka) obj;
        return Objects.equals(zbiorKsiazek, inna.zbiorKsiazek) && Objects.equals(lokalizacja, inna.lokalizacja);
    }
    @Override
    public int hashCode(){
        return Objects.hash(zbiorKsiazek, lokalizacja);
    }
}
