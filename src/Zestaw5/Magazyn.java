package Zestaw5;

import Zestaw4.Produkt;
import java.util.ArrayList;
import java.util.List;

public class Magazyn {
    private List<Produkt> produkty;
    private List<Integer> ilosci;

    public Magazyn(){
        this.produkty = new ArrayList<>();
        this.ilosci = new ArrayList<>();
    }

    public Magazyn(Produkt p, int ilosc){
        this();
        dodajProdukt(p, ilosc);
    }

    public List<Produkt> getProdukty(){
        return produkty;
    }
    public void setProdukty(List<Produkt> prod){
        if (prod == null){
            throw new IllegalArgumentException("Lista produktow nie moze byc pusta.");
        }
        this.produkty = prod;
    }

    public List<Integer> getIlosci(){
        return ilosci;
    }
    public void setIlosci(List<Integer> ilosci){
        if (ilosci == null){
            throw new IllegalArgumentException("Ilosci nie moga byc nullem.");
        }
        this.ilosci = ilosci;
    }

    public void dodajProdukt(Produkt p, int ilosc){
        int idx = produkty.indexOf(p);
        if (idx >= 0){
            ilosci.set(idx, ilosci.get(idx) + ilosc);
        } else {
            produkty.add(p);
            ilosci.add(ilosc);
        }
    }

    public int getIlosc(Produkt p) {
        int idx = produkty.indexOf(p);
        if (idx >= 0) {
            return ilosci.get(idx);
        }
        return 0;
    }

    // public void wyswietlAsortyment(){
    //     if (produkty.isEmpty()){
    //         System.out.println("Magazyn jest pusty.");
    //         return;
    //     }
    //     System.out.println("--- Asortyment magazynu ---");
    //     for (int i=0; i<produkty.size(); i++){
    //         Produkt p = produkty.get(i);
    //         int ile = ilosci.get(i);
    //         System.out.println(p.toString());
    //         System.out.printf("Ilość w magazynie: %d\n", ile);
    //     }
    //     System.out.println("---------------------------");
    // }
    @Override
    public String toString(){
        if (produkty.isEmpty()){
            return "Magazyn jest pusty.";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("--- Asortyment magazynu ---\n");
        sb.append("Ilosc rzeczy w magazynie: ").append(produkty.size());
        for (int i=0; i<produkty.size(); i++){
            Produkt p = produkty.get(i);
            int ile = ilosci.get(i);
            sb.append("[").append(p.toString()).append("] -> Ilosc: ").append(ile).append("\n");
        }
        sb.append("-----------------------");
        return sb.toString();
    }
}
