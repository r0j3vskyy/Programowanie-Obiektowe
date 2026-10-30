package Zestaw2;

// Programowanie obiektowe
// ----------------------------------------
// Operacje na tablicach.
// ----------------------------------------
// mgr inż. Adam Zalewski
// University of Warmia and Mazury in Olsztyn
// Faculty of Mathematics and Computer Science
// Institute of Computer Science
// Chair of Applied Computer Science and Mathematical Modeling

public class Zestaw2 {

    // Zadanie 0.
    // Napisz funkcję główną (main).

    public static void main(String[] args){
        int[] tab = generujTablice(100, -50, 50);
        System.out.println(najdluzszyCiagDodatnich(tab));
    }

    // Zadanie 1.
    // Napisz funkcję generujTablice(n, minWartosc, maxWartosc), która generuje tablicę liczb gdzie n oznacza ilość
    // elementów tablicy, minWartosc wartość minimalną w tablicy,
    // a maxWartosc wartość maksymalną.

    static int[] generujTablice(int n, int minWartosc, int maxWartosc){
        int[] tab = new int[n];
        for (int i=0; i<n; i++){
            tab[i] = (int)(Math.random() * (maxWartosc - minWartosc + 1)) + minWartosc;
        }
        return tab;
    }

    // Zadanie 2.
    // Napisz funkcję wypiszTablice(tab, n, m), która wypisuje na ekranie tablice
    // w formie macierzy o wymiarach n x m. W przypadku gdy n*m
    // jest większe od długości tablicy program wypisuje puste pola.
    // Zadbaj o to, aby liczby były ułożone równo.

    static void zadanie_2(){

    }

    // Zadanie 3.
    //  Wykorzystując funkcję z zadania 1. napisz funkcje ileNieparzystych(tab)
    //  zliczające ilość liczb nieparzystych w tablicy.

    static int ileNieparzystych(int[] tab){
        int ile = 0;
        for (int i=0; i<tab.length; i++){
            if (tab[i]%2 == 1){
                ile++;
            }
        }
        return ile;
    }

    // Zadanie 4.
    //  Wykorzystując funkcję z zadania 1. napisz funkcje ileParzystych(tab)
    //  zliczające ilość liczb parzystych w tablicy.

    static int ileParzystych(int[] tab){
        int ile = 0;
        for (int i=0; i<tab.length; i++){
            if (tab[i]%2 == 0){
                ile++;
            }
        }
        return ile;
    }

    // Zadanie 5.
    //  Wykorzystując funkcję z zadania 1. napisz funkcje ileDodatnich(tab)
    //  zliczające ilość liczb dodatnich w tablicy.

    static int ileDodatnich(int[] tab){
        int ile = 0;
        for (int i=0; i<tab.length; i++){
            if (tab[i] >0){
                ile++;
            }
        }
        return ile;
    }

    // Zadanie 6.
    //  Wykorzystując funkcję z zadania 1. napisz funkcje ileUjemnych(tab)
    //  zliczające ilość liczb ujemnych w tablicy.

    static int ileUjemnych(int[] tab){
        int ile = 0;
        for (int i=0; i<tab.length; i++){
            if (tab[i] <0){
                ile++;
            }
        }
        return ile;
    }

    // Zadanie 7.
    //  Wykorzystując funkcję z zadania 1. napisz funkcje ileZerowych(tab)
    //  zliczające ilość liczb o wartości zero w tablicy.

    static int ileZerowych(int[] tab){
        int ile = 0;
        for (int i=0; i<tab.length; i++){
            if (tab[i] == 0){
                ile++;
            }
        }
        return ile;
    }

    // Zadanie 8.
    //  Wykorzystując funkcję z zadania 1. napisz funkcje ileMaxymalnych(tab)
    //  zliczające ilość liczb o wartości max w tablicy.

    static int ileMaxymalnych(int[] tab){
        int max = tab[0];
        for (int i=1; i<tab.length; i++){
            if (tab[i] > max){
                max = tab[i];
            }
        }
        int ile = 0;
        for (int i=0; i<tab.length; i++){
            if (tab[i] == max){
                ile++;
            }
        }
        return ile;
    }

    // Zadanie 9.
    //  Wykorzystując funkcję z zadania 1. napisz funkcje ileMinimalnych(tab)
    //  zliczające ilość liczb o wartości min w tablicy.

    static int ileMinimalnych(int[] tab){
        int min = tab[0];
        for (int i=1; i<tab.length; i++){
            if (tab[i] < min){
                min = tab[i];
            }
        }
        int ile = 0;
        for (int i=0; i<tab.length; i++){
            if (tab[i] == min){
                ile++;
            }
        }
        return ile;
    }

    // Zadanie 10.
    //  Wykorzystując funkcję z zadania 1. napisz funkcje ileUnikalnych(tab)
    //  zliczające ilość liczb, które się nie powtarzają w tablicy.

    static void ileUnikalnych(int[] tab){

    }

    // Zadanie 11.
    // Wykorzystując funkcje z zadania 1. napisz funkcje sumaDodatnich(tab)
    // wykonującą odpowiednie operacje arytmetyczne na elemantach tablicy.

    static int sumaDodatnich(int[] tab){
        int suma = 0;
        for (int i=0; i<tab.length; i++){
            if (tab[i] >= 0){
                suma += tab[i];
            }
        }
        return suma;
    }

    // Zadanie 12.
    // Wykorzystując funkcje z zadania 1. napisz funkcje sumaUjemnych(tab)
    // wykonującą odpowiednie operacje arytmetyczne na elemantach tablicy.

    static int sumaUjemnych(int[] tab){
        int suma = 0;
        for (int i=0; i<tab.length; i++){
            if (tab[i] <= 0){
                suma += tab[i];
            }
        }
        return suma;
    }

    // Zadanie 13.
    // Wykorzystując funkcje z zadania 1. napisz funkcje sumaOdwrotnosci(tab)
    // wykonującą odpowiednie operacje arytmetyczne na elemantach tablicy.

    static float sumaOdwrotnosci(int[] tab){
        float wynik = 0;
        for (int i=0; i<tab.length; i++){
            if (tab[i] >= 0){
                wynik += 1/tab[i];
            }
        }
        return wynik;
    }

    // Zadanie 14.
    // Wykorzystując funkcje z zadania 1. napisz funkcje sredniaArytmetyczna(tab)
    // wykonującą odpowiednie operacje arytmetyczne na elemantach tablicy.

    static float sredniaArytmetyczna(int[] tab){
        float wynik = 0;
        for (int i=0; i<tab.length; i++){
            wynik += tab[i];
        }
        return wynik/tab.length;
    }

    // Zadanie 15.
    // Wykorzystując funkcje z zadania 1. napisz funkcje sredniaGeometryczna(tab)
    // wykonującą odpowiednie operacje arytmetyczne na elemantach tablicy.

    static double sredniaGeometryczna(int[] tab){
        double wynik = 1;
        for (int i=0; i<tab.length; i++){
            wynik *= tab[i];
        }
        return Math.pow(wynik, 1/tab.length);
    }

    // Zadanie 16.
    // Wykorzystując funkcje z zadania 1. napisz funkcje sredniaHarmoniczna(tab)
    // wykonującą odpowiednie operacje arytmetyczne na elemantach tablicy.

    static double sredniaHarmoniczna(int[] tab){
        return tab.length/sumaOdwrotnosci(tab);
    }

    // Zadanie 17.
    // Napisz funkcje funkcjaLiniowa(tab, a, b) zwracające tablice wartości funkcji.

    static double[] funkcjaLiniowa(int[] tab, double a, double b){
        double[] result = new double[tab.length];
        for (int i=0; i<tab.length; i++){
            result[i] = a*tab[i] + b;
        }
        return result;
    }

    // Zadanie 18.
    // Napisz funkcje funkcjaKwadratowa(tab, a, b, c) zwracające tablice wartości funkcji.

    static double[] funkcjaKwadratowa(int[] tab, double a, double b, double c){
        double[] result = new double[tab.length];
        for (int i=0; i<tab.length; i++){
            result[i] = a*(tab[i]*tab[i]) + b*tab[i] + c;
        }
        return result;
    }

    // Zadanie 19.
    // Napisz funkcje funkcjaWykladnicza(tab, a, b) zwracające tablice wartości funkcji.

    static double[] funkcjaWykladnicza(int[] tab, double a, double b){
        double[] result = new double[tab.length];
        for (int i=0; i<tab.length; i++){
            result[i] = a* Math.pow(b, tab[i]);
        }
        return result;
    }

    // Zadanie 20.
    // Napisz funkcje funkcjaSignum(tab) zwracające tablice wartości funkcji.

    static int[] funkcjaSignum(int[] tab){
        int[] result = new int[tab.length];
        for (int i=0; i<tab.length; i++){
            if (tab[i] > 0) {result[i] = 1;}
            else if (tab[i] < 0) {result[i] = -1;}
            else {result[i] = 0;}
        }
        return result;
    }

    // Zadanie 21.
    // Wykorzystując funkcję z zadania 1. napisz funkcje najdluzszyCiagDodatnich(tab),
    // która wykonuje odpowiednie operacje na tablicy.

    static int najdluzszyCiagDodatnich(int[] tab){
        int best = 0, cur = 0;
        for (int i=0; i<tab.length; i++){
            if (tab[i] > 0){
                cur++;
                if (cur > best) {best = cur;}
            } else {
                cur = 0;
            }
        }
        return best;
    }

    // Zadanie 22.
    // Wykorzystując funkcję z zadania 1. napisz funkcje najdluzszyCiagUjemnych(tab),
    // która wykonuje odpowiednie operacje na tablicy.

    static int najdluzszyCiagUjemnych(int[] tab){
        int best = 0, cur = 0;
        for (int i=0; i<tab.length; i++){
            if (tab[i] < 0){
                cur++;
                if (cur > best) {best = cur;}
            } else {
                cur = 0;
            }
        }
        return best;
    }

    // Zadanie 23.
    // Wykorzystując funkcję z zadania 1. napisz funkcje odwrocTablice(tab),
    // która wykonuje odpowiednie operacje na tablicy.

    static int[] odwrocTablice(int[] tab){
        int[] tab2 = new int[tab.length];
        for (int i=0; i<tab.length; i++){
            tab2[i] = tab[tab.length-1-i];
        }
        return tab2;
    }

    // Zadanie 24.
    // Wykorzystując funkcję z zadania 1. napisz funkcje odwrocTablice(tab, indeksStart, indeksStop),
    // która wykonuje odpowiednie operacje na tablicy.

    static void odwrocTablice2(int[] tab, int indeksStart, int indeksStop){
        //int[] tab2 = new int[tab.length];

    }

    // Zadanie 25.
    //  Napisz funkcję generujZakres(n, minWartosc, maxWartosc),
    //  która generuje tablicę liczb o równych odstępach od siebie.

    static double[] generujZakres(int n, double minWartosc, double maxWartosc){
        double[] result = new double[n];
        double step = (maxWartosc - minWartosc) /  (n-1);
        for (int i=0; i<n; i++){
            result[i] = minWartosc + i*step;
        }
        return result;
    }
}
