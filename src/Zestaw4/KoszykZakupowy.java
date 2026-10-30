package Zestaw4;

import Zestaw5.Magazyn;

import java.util.ArrayList;
import java.util.List;

public class KoszykZakupowy implements KoszykZakupowyI {
    private List<Produkt> listaProduktow;
    private List<Integer> ilosci;

    public KoszykZakupowy(){
        this.listaProduktow = new ArrayList<>();
        this.ilosci = new ArrayList<>();
    }

    public List<Produkt> getListaProduktow(){
        return listaProduktow;
    }
    public void setListaProduktow(List<Produkt> listaProd){
        this.listaProduktow = listaProd;
    }

    public List<Integer> getIlosci(){
        return ilosci;
    }
    public void setIlosci(List<Integer> ilosci){
        this.ilosci = ilosci;
    }

    public void dodajProdukt(Magazyn mag, Produkt p, int ilosc){
        if (ilosc <= 0) {
            System.out.println("Błędna ilość.");
            return;
        }
        if (mag.getIlosc(p) < ilosc){
            System.out.println("Za mała ilość produktu na magazynie");
            return;
        }
        listaProduktow.add(p);
        ilosci.add(ilosc);
    }

    public void dodajProdukt(Produkt p, int ilosc){
        if (ilosc <= 0) {
            System.out.println("Błędna ilość.");
            return;
        }
        if (p.getIlosc() < ilosc){
            System.out.println("Za mała ilość produktu na magazynie");
            return;
        }
        p.setIlosc(p.getIlosc() - ilosc);
        listaProduktow.add(p);
        ilosci.add(ilosc);
    }
    
    // public void wyswietlZawartoscKoszyka(){
    //     if (listaProduktow.isEmpty()) {
    //         System.out.println("Koszyk jest pusty.");
    //     }
    //     else {
    //         System.out.println("-----------------------");
    //         System.out.println("Twoj koszyk:");
    //         for (int i=0; i< listaProduktow.size(); i++){
    //             Produkt prod = listaProduktow.get(i);
    //             int iloscWKoszyku = ilosci.get(i);
    //             System.out.printf("Nazwa: %s, ilosc: %d \n", prod.nazwa, iloscWKoszyku);
    //         }
    //         System.out.println("-----------------------");
    //     }
    // }
    public double obliczCalkowitaWartosc(){
        double wartoscCalkowita = 0.0;
        for (int i=0; i<listaProduktow.size(); i++){
            Produkt prod = listaProduktow.get(i);
            int iloscWKoszyku = ilosci.get(i);
            wartoscCalkowita += prod.getCena() * iloscWKoszyku;
        }
        return wartoscCalkowita;
    }
    @Override
    public String toString(){
        if (listaProduktow.isEmpty()){
            return "Koszyk jest pusty.";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("---- Zawartosc koszyka ----\n");
        sb.append("Wartosc: ").append(String.format("%.2f", obliczCalkowitaWartosc())).append("zl\n");
        for (int i=0; i<listaProduktow.size(); i++){
            Produkt p = listaProduktow.get(i);
            int ile = ilosci.get(i);
            double wartoscprod = p.getCena() * ile;
            sb.append(p.toString());
            sb.append(String.format("%d szt. (Lacznie %.2f)\n", ile, wartoscprod));
        }
        sb.append("------------");
        return sb.toString();
    }
}
