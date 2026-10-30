package Zestaw4;

import java.util.Objects;

public class Platnosc implements PlatnoscI {
    private double kwota;
    private StatusPlatnosci statusPlatnosci;

    public Platnosc(double kwota, StatusPlatnosci statusPlatnosci){
        setKwota(kwota);
        setStatus(statusPlatnosci);
    }
    public Platnosc(double kwota){
        setKwota(kwota);
        setStatus(StatusPlatnosci.NIEOPLACONE);
    }

    public double getKwota(){
        return kwota;
    }
    public void setKwota(double kwota){
        if (kwota < 0){
            throw new IllegalArgumentException("Kwota nie moze byc mniejsza niz 0.");
        }
        this.kwota = kwota;
    }

    public StatusPlatnosci getStatus(){
        return statusPlatnosci;
    }
    public void setStatus(StatusPlatnosci status){
        if (statusPlatnosci == null){
            throw new IllegalArgumentException("Status nie moze byc nullem.");
        }
        this.statusPlatnosci = status;
    }

    public void zaplac(double zaplaconaKwota){
        if (zaplaconaKwota >= this.kwota){
            this.statusPlatnosci = StatusPlatnosci.OPLACONE;
            System.out.printf("Platnosc zakonczona sukcesem. Status: %s. Kwota: %.2f \n", statusPlatnosci, this.kwota);
        } else {
            this.statusPlatnosci = StatusPlatnosci.NIEOPLACONE;
            System.out.printf("Błąd płatności.");
        }
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Platnosc platnosc = (Platnosc) obj;
        return Double.compare(kwota, platnosc.kwota) == 0 && statusPlatnosci == platnosc.statusPlatnosci; 
    }
    @Override
    public String toString(){
        return String.format("Platnosc [Status: %s, Kwota: %.2f pln]", statusPlatnosci.name(), kwota);
    }
    @Override
    public int hashCode(){
        return Objects.hash(kwota, statusPlatnosci);
    }
}

enum StatusPlatnosci{
    OPLACONE,
    NIEOPLACONE
}
