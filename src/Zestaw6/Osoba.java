package Zestaw6;

public class Osoba implements Comparable<Osoba>{
    private String imie;
    private String nazwisko;
    private int wiek;

    public Osoba(String imie, String nazwisko, int wiek){
        setImie(imie);
        setNazwisko(nazwisko);
        setWiek(wiek);
    }
    public Osoba(String imie, String nazwisko){
        setImie(imie);
        setNazwisko(nazwisko);
    }

    public String getImie(){
        return imie;
    }
    public void setImie(String imie){
        if (imie == null || imie.trim().isEmpty()){
            throw new IllegalArgumentException("Imie nie moze byc puste.");
        } 
        this.imie = imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }
    public void setNazwisko(String nazwisko){
        if (nazwisko == null || nazwisko.trim().isEmpty()){
            throw new IllegalArgumentException("Nazwisko nie moze byc puste");
        }
        this.nazwisko = nazwisko;
    }

    public int getWiek(){
        return wiek;
    }
    public void setWiek(int wiek){
        if (wiek < 0){
            throw new IllegalArgumentException("Podaj poprawny wiek");
        }
        this.wiek = wiek;
    }

    @Override
    public int compareTo(Osoba other){
        if (other.wiek > this.wiek) return 1;
        if (other.wiek == this.wiek) return 0;
        else return -1;
    }
}
