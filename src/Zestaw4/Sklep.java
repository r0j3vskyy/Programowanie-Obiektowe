package Zestaw4;

import java.util.List;
import Zestaw5.Magazyn;
import java.util.ArrayList;
import java.time.LocalDate;


public class Sklep implements SklepI {
    private List<Produkt> lista;
    private String nazwaSklepu;
    private LocalDate dataPowstania;
    private Magazyn magazynSklepu;

    public Sklep(){
        this.lista = new ArrayList<>();
    }
    public Sklep(String nazwa, LocalDate data, Magazyn mag){
        this.lista = new ArrayList<>();
        setNazwaSklepu(nazwa);
        setDataPowstania(data);
        setMagazynSklepu(mag);
    }
    
    public List<Produkt> getLista(){
        return lista;
    }
    public void setLista(List<Produkt> lista){
        if (lista == null){
            throw new IllegalArgumentException("Lista nie moze byc nullem");
        }
        this.lista = lista;
    }

    public String getNazwaSklepu(){
        return nazwaSklepu;
    }
    public void setNazwaSklepu(String nazwa){
        if (nazwa == null || nazwa.trim().isEmpty()){
            throw new IllegalArgumentException("Nazwa nie moze byc pusta");
        }
        this.nazwaSklepu = nazwa;
    }

    public LocalDate getDataPowstania(){
        return dataPowstania;
    }
    public void setDataPowstania(LocalDate data){
        if (data.isAfter(LocalDate.now()) || data == null){
            throw new IllegalArgumentException("Data nie moze byc z przyszlosci albo nie moze byc nullem.");
        }
        this.dataPowstania = data;
    }

    public Magazyn getMagazynSklepu(){
        return magazynSklepu;
    }
    public void setMagazynSklepu(Magazyn magazyn){
        if (magazyn == null){
            throw new IllegalArgumentException("Magazyn nie moze byc nullem.");
        }
        this.magazynSklepu = magazyn;
    }


    public void dodajProdukt(Produkt p){
        this.lista.add(p);
        System.out.println("Pomyslnie dodano produkt " + p.getNazwa() + " do koszyka.");
    }

    // public void wyswietlOferty(){
    //     if (lista.isEmpty()){
    //         System.out.println("Brak produktów w ofercie.");
    //     }
    //     System.out.println("---- Oferta Sklepu ----");
    //     for (int i=0; i<lista.size(); i++){
    //         Produkt p = lista.get(i);
    //         System.out.printf("%d. %s - %.2f zł (ilość: %d szt.)\n", i+1, p.nazwa, p.cena, p.iloscNaMagazynie);
    //     }
    // }

    public Produkt wyszukajProdukt(String nazwa){
        for (int i=0; i<lista.size(); i++){
            Produkt p = lista.get(i);
            if (p.getNazwa().equalsIgnoreCase(nazwa)){
                return p;
            }
        }
        return null;
    }

    public void zakupy(String nazwa, int ilosc, KoszykZakupowy koszyk){
        Produkt doZakupu = wyszukajProdukt(nazwa);
        if (doZakupu == null){
            System.out.println("Produkt nie jest dostępny w sklepie.");
            return;
        }
        koszyk.dodajProdukt(doZakupu, ilosc);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("----- Informacje o sklepie -----\n");
        sb.append("Nazwa: ").append(nazwaSklepu).append("\n");
        sb.append("Data zalozenia: ").append(dataPowstania.toString()).append("\n");
        sb.append("Magazyn: \n");
        sb.append(magazynSklepu.toString());
        sb.append("Oferta sklepu: \n");
        if (lista.isEmpty()){
            sb.append("Brak produktow w sklepie.");
        } else {
            for (int i=0; i<lista.size(); i++){
                Produkt p = lista.get(i);
                sb.append(i+1).append(". ").append(p.toString()).append("\n");
            }
        }
        sb.append("--------------------");
        return sb.toString();
    }
}
