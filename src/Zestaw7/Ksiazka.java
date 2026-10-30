package Zestaw7;

import java.time.LocalDate;
import java.util.Objects;

public class Ksiazka implements Comparable<Ksiazka> {
    private String tytul;
    private String autor;
    private LocalDate dataWydania;
    private final String ISBN;

    public Ksiazka(String tytul, String autor, LocalDate dataWydania, String ISBN){
        this.tytul = tytul;
        this.autor = autor;
        this.dataWydania = dataWydania;
        this.ISBN = ISBN;
    }
    
    public String getTytul(){ return tytul; }
    public String getAutor(){ return autor; }
    public LocalDate getDataWydania(){ return dataWydania; }
    public String getISBN(){ return ISBN; }

    @Override
    public int compareTo(Ksiazka ksiazka){
        int porownanieTytulu = this.tytul.compareTo(ksiazka.getTytul());
        if (porownanieTytulu != 0) return porownanieTytulu;
        return this.autor.compareTo(ksiazka.getAutor());
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ksiazka inna = (Ksiazka) obj;
        return Objects.equals(ISBN, inna.ISBN);
    }
    @Override
    public int hashCode(){
        return Objects.hash(ISBN);
    }
}
