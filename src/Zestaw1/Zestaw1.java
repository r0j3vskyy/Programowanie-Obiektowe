package Zestaw1;

import java.util.Scanner;

// Programowanie obiektowe
// ----------------------------------------
// Podstawowe operacje wejścia/wyjścia,
// arytmetyczne, instrukcje warunkowe oraz pętle.
// ----------------------------------------
// mgr inż. Adam Z.
// University of Warmia and Mazury in Olsztyn
// Faculty of Mathematics and Computer Science
// Institute of Computer Science
// Chair of Applied Computer Science and Mathematical Modeling

public class Zestaw1 {

    // Zadanie 0.
    // Napisz funkcję główną (main).

    public static void main(String[] args) {
        //zadanie_7();
        System.out.println(zadanie_29(5));
    }

    // Zadanie 1.
    // Wypisz swoje imię i nazwisko na ekranie.

    static void zadanie_1(){
        System.out.println("Marcin Kowalski");
    }

    // Zadanie 2.
    // Wypisz długość imienia i nazwiska.

    static void zadanie_2(){
        String firstname = "Marcin";
        String lastname = "Kowalski";
        System.out.println("Dlugosc imienia: " +firstname.length());
        System.out.println("Dlugosc nazwiska: " +lastname.length());
    }

    // Zadanie 3.
    // Za pomocą printf połącz 3 wyrazy "Ala" "ma" "kota"
    // w jeden i wyświetl go na ekranie.

    static void zadanie_3(){
        System.out.printf("%s %s %s ", "Ala", "ma", "kota");
    }

    // Zadanie 4.
    // W zdaniu „Ala ma kota” zastąp
    // wszystkie litery „a” literą „e”.

    static void zadanie_4(){
        String zdanie = "Ala ma kota";
        System.out.println(zdanie.replace('a', 'e'));
    }

    // Zadanie 5.
    // Napisz program, który będzie pobierał dwa słowa
    // od użytkownika i wypisywał je na ekranie.

    static void zadanie_5(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj pierwsze slowo: ");
        String slowo1 = myObj.nextLine();
        System.out.println("Slowo pierwsze: " +slowo1);

        System.out.println("Podaj drugie slowo:");
        String slowo2 = myObj.nextLine();
        System.out.println("Slowo drugie: " +slowo2);
        myObj.close();
    }

    // Zadanie 6.
    // Napisz program, który będzie pobierał dwie liczby od
    // użytkownika i wypisał ich sumę, różnicę, iloczyn i iloraz.

    static void zadanie_6(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        float liczba1 = myObj.nextFloat();
        System.out.println("Podaj druga liczbe: ");
        float liczba2 = myObj.nextFloat();

        System.out.println("Suma: " +(liczba1+liczba2));
        System.out.println("Różnica: " +(liczba1-liczba2));
        System.out.println("Iloczyn: " +(liczba1*liczba2));
        System.out.println("Iloraz: " +(liczba1/liczba2));
        myObj.close();
    }

    // Zadanie 7.
    // Napisz prostą aplikację kalkulatora tekstowego,
    // która przyjmuje dwa liczby od użytkownika jako wejście
    // i wykonuje podstawowe operacje matematyczne
    // (dodawanie, odejmowanie, mnożenie, dzielenie).
    // Wyświetl wyniki na ekranie.

    static void zadanie_7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe nr1: ");
        float a = sc.nextFloat();
        System.out.println("Podaj liczbe nr2: ");
        float b = sc.nextFloat();
        System.out.println("a+b= " + (a+b));
        System.out.println("a-b= " + (a-b));
        System.out.println("a*b= " + (a*b));
        System.out.println("a/b= " + (a/b));
        sc.close();
    }

    // Zadanie 8.
    // Napisz program, który będzie pobierał
    // liczbę x od użytkownika i wypisał tę liczbę:
    //      • Powiększoną o 140
    //      • Pomniejszoną o 31
    //      • Powiększoną 7 razy
    //      • Pomniejszoną 13 razy
    //      • Modulo 7
    //      • Część całkowita z dzielenia przez 4
    //      • Podniesioną do potęgi 45
    //      • Iloczyn bitowy z 67
    //      • Suma bitowa z 59
    //      • XOR z 23
    //      • Przesuniętą o 5 bitów w lewo
    //      • Przesuniętą o 6 bitów w prawo

    static void zadanie_8(){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int x = myObj.nextInt();

        System.out.println(x+140);
        System.out.println(x-31);
        System.out.println(x*7);
        System.out.println(x/13);
        System.out.println(x%7);
        System.out.println(Math.floor(x/4));
        System.out.println(Math.pow(x, 45));
        System.out.println(x&67);
        System.out.println(x|59);
        System.out.println(x^23);
        System.out.println(x<<5);
        System.out.println(x>>6);
        myObj.close();
    }

    // Zadanie 9.
    // Napisz program, który sprawdza czy podana
    // liczba jest parzysta i wypisuje odpowiedni komunikat.

    static void zadanie_9(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int x = myObj.nextInt();

        if (x%2 == 0) {
            System.out.println("Liczba jest parzysta.");
        }
        else {
            System.out.println("Liczba nie jest parzysta");
        }
        myObj.close();
    }

    // Zadanie 10.
    // Napisz program, który pobiera od użytkownika trzy liczby
    // i wypisuje je w kolejności rosnącej.

    static void zadanie_10(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int x1 = myObj.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int x2 = myObj.nextInt();
        System.out.println("Podaj trzecia liczbe: ");
        int x3 = myObj.nextInt();

        if (x1 <= x2 && x1 <= x3) {
            if (x2 <= x3) {
                System.out.println(x1 + ", " + x2 + ", " + x3);
            } else {
                System.out.println(x1 + ", " + x3 + ", " + x2);
            }
        } 
        else if (x2 <= x1 && x2 <= x3) {
            if (x1 <= x3) {
                System.out.println(x2 + ", " + x1 + ", " + x3);
            } else {
                System.out.println(x2 + ", " + x3 + ", " + x1);
            }
        } 
        else { 
            if (x1 <= x2) {
                System.out.println(x3 + ", " + x1 + ", " + x2);
            } else {
                System.out.println(x3 + ", " + x2 + ", " + x1);
            }
        }
        myObj.close();
    }

    // Zadanie 11.
    // Napisz program, który pobiera od użytkownika trzy liczby
    // i wypisuje je w kolejności malejącej.

    static void zadanie_11(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int x1 = myObj.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int x2 = myObj.nextInt();
        System.out.println("Podaj trzecia liczbe: ");
        int x3 = myObj.nextInt();

        if (x1 >= x2 && x1 >= x3) {
            if (x2 >= x3) {
                System.out.println(x1 + ", " + x2 + ", " + x3);
            } else {
                System.out.println(x1 + ", " + x3 + ", " + x2);
            }
        } 
        else if (x2 >= x1 && x2 >= x3) {
            if (x1 >= x3) {
                System.out.println(x2 + ", " + x1 + ", " + x3);
            } else {
                System.out.println(x2 + ", " + x3 + ", " + x1);
            }
        } 
        else { 
            if (x1 >= x2) {
                System.out.println(x3 + ", " + x1 + ", " + x2);
            } else {
                System.out.println(x3 + ", " + x2 + ", " + x1);
            }
        }
        myObj.close();
    }

    // Zadanie 12.
    // Napisz program, który rozwiązuje równanie liniowe ax + b = 0
    // o parametrach a i b podanych przez użytkownika.

    static void zadanie_12(){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Podaj a: ");
        double a = myObj.nextDouble();
        System.out.print("Podaj b: ");
        double b = myObj.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Rownanie ma nieskonczenie wiele rozwiazan.");
            }
            else {
                System.out.println("Rownanie sprzeczne, brak rozwiazan.");
            }
        } else {
            double x = -b / a;
            System.out.println("Rozwiazanie: x = " +x);
        }
        myObj.close();
    }

    // Zadanie 13.
    // Napisz program, który pobiera od użytkownika wartości parametrów
    // a, b i c, i sprawdza czy można z nich zbudować trójkąt.

    static void zadanie_13(){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Podaj a: ");
        float a = myObj.nextFloat();
        System.out.print("Podaj b: ");
        float b = myObj.nextFloat();
        System.out.print("Podaj c: ");
        float c = myObj.nextFloat();

        if (a+b > c && a+c > b && b+c > a) {
            System.out.print("Mozna zbudowac trojkat.");
        } else {
            System.out.print("Nie mozna zbudowac trojkata");
        }
        myObj.close();
    }

    // Zadanie 14.
    // Napisz program, który pobiera od użytkownika wartości parametrów
    // a, b i c, które powinny być bokami pewnego trójkąta
    // i sprawdza czy trójkąt jest ostrokątny, prostokątny czy rozwartokątny.

    static void zadanie_14(){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Podaj a: ");
        float a = myObj.nextFloat();
        System.out.print("Podaj b: ");
        float b = myObj.nextFloat();
        System.out.print("Podaj c: ");
        float c = myObj.nextFloat();

        float akw = a*a;
        float bkw = b*b;
        float ckw = c*c;

        if (akw + bkw == ckw) {
            System.out.print("Trojkat jest prostokatny");
        }
        else if (akw + bkw > ckw) {
            System.out.print("Trojkat jest ostrokatny.");
        }
        else {
            System.out.print("Trojkat jest rozwartokatny.");
        }
        myObj.close();
    }

    // Zadanie 15.
    // Napisz program, który pobiera od użytkownika liczbę m oraz n
    // i zwraca resztę z dzielenia m przez n.

    static void zadanie_15(){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Podaj m: ");
        int m = myObj.nextInt();
        System.out.print("Podaj n: ");
        int n = myObj.nextInt();

        if (n == 0){
            System.out.println("Nie mozna dzielic przez 0!");
        } else {
            int reszta = m % n;
            System.out.println("Reszta z dzielenia: " +reszta);
        }
        myObj.close();
    }

    // Zadanie 16.
    // Napisz program, który oblicza podatek należny
    // na podstawie kwoty dochodu podanej przez użytkownika
    // i następujących progów podatkowych:
    //      Kwota wolna od podatku: 30 000 zł
    //      I próg podatkowy: do 120 000 zł stawka 12%
    //      II próg podatkowy: od 120 000 zł stawka 32%
    //      Danina solidarnościowa: od 1 000 000 zł stawka 4%
    // Kwota zmniejszająca podatek wynosi 3 600 zł.

    void zadanie_16(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj kwote swojego dochodu: ");
        double dochod = sc.nextFloat();
        double podatek = 0;

        //nie znam sie na podatkach
        if (dochod <= 30000){
            System.out.println("Kwota wolna od podatku.");
        }
        else if (dochod <= 120000){
            podatek = (dochod - 30000)*0.12 - 3600;
            System.out.printf("1 prog podatkowy, do zaplaty: %.2f PLN", podatek);
        }
        else{
            podatek = 10800 + (dochod - 120000)*0.32;
            if (dochod > 1000000){
                double danina = (dochod - 1000000)*0.04;
                podatek += danina;
                System.out.printf("Podatek + danina solidarnosciowa: %.2f PLN", podatek);
            } else {
                System.out.printf("Podatek do zaplaty: %.2f PLN", podatek);
            }
        }
        sc.close();
    }

    // Zadanie 17.
    // Napisz program, który pobiera od użytkownika liczbę n
    // i wypisze dla długości boków od 1 do n
    // wszystkie trójki pitagorejskie.

    static void zadanie_17(){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = myObj.nextInt();

        for (int a=1; a<=n; a++){
            for (int b=1; b<=n; b++){
                for (int c=1; c<=n; c++){
                    if (a*a + b*b == c*c && a<b && b<c){
                        System.out.printf("%d %d %d", a, b, c);
                    }
                }
            }
        }
        myObj.close();
    }

    // Zadanie 18.
    // Napisz program, który pobiera od użytkownika liczbę n
    // i wypisze wszystkie liczby pierwsze od 2 do n.

    static void zadanie_18(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = sc.nextInt();

        for (int i=2; i<=n; i++){
            boolean flaga = true;
            for (int j=2; j<=i/2; j++){
                if (i%j == 0){
                    flaga = false;
                    break;
                }
            }
            if (flaga){
                System.out.println(i);
            }
        }
        sc.close();
    }

    // Zadanie 19.
    // Napisz program, który pobiera od użytkownika liczbę m i n,
    // a następnie wypisze wszystkie liczby m-cyfrowe,
    // które podzielne są przez n.

    static void zadanie_19(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe n: ");
        int n = sc.nextInt();
        System.out.println("Podaj liczbe m: ");
        int m = sc.nextInt();

        int start = (int)Math.pow(10, m-1);
        int end = (int) Math.pow(10, m) -1;
        for (int i=start; i<=end; i++){
            if(i%n == 0){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    // Zadanie 20.
    // Napisz program, który wypisze piramidę z gwiazdek (*)
    // w dwóch wariantach, której wysokość jest liczbą n.
    // Program powinien przyjmować dwa argumenty - n (wysokość) i v (wariant).

    static void zadanie_20(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wysokosc - n: ");
        int n = sc.nextInt();
        System.out.println("Podaj wariant - v (1/2): ");
        int v = sc.nextInt();

        switch (v) {
            case 1 -> {
                for (int i=1; i<=n; i++){
                    for (int j=1; j<=i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            case 2 -> {
                for (int i=1; i<=n; i++){
                    for (int j=1; j<=n-i; j++){
                        System.out.print(" ");
                    }
                    for (int j=1; j<=i; j++){
                        System.out.print("*");
                        if (j<i){
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
            default -> System.out.println("Nieznany warunek.");
        }
        sc.close();
    }

    // Zadanie 21.
    // Napisz program, który obliczy i zwróci silnie liczby n.
    // Program powinien przyjmować jeden argument - liczbę n.

    static int zadanie_21(int n){
        int wynik = 1;
        for (int i=2; i<=n; i++){
            wynik *= i;
        }
        return wynik;
    }

    // Zadanie 22.
    // Napisz program, który obliczy i zwróci silnie podwójną liczby n.
    // Program powinien przyjmować jeden argument - liczbę n.

    static int zadanie_22(int n){
        int wynik = 1;
        for(int i=n; i>0; i-=2){
            wynik *= i;
        }
        return wynik;
    }

    // Zadanie 23.
    // Napisz program, który obliczy i zwróci silnie m-tą liczby n.
    // Program powinien przyjmować dwa argumenty - liczbę m oraz n.

    static int zadanie_23(int m, int n){
        int wynik = 1;
        for(int i=n; i>0; i-=m){
            wynik *= i;
        }
        return wynik; 
    }

    // Zadanie 24.
    // Napisz program, który obliczy i zwróci sumę n
    // kolejnych liczb naturalnych.
    // Program powinien przyjmować jeden argument - liczbę n.

    static int zadanie_24(int n){
        int wynik = 0;
        for (int i=0; i<=n; i++){
            wynik += i;
        }
        return wynik;
    }

    // Zadanie 25.
    // Napisz program, który obliczy i zwróci sumę n
    // kolejnych liczb parzystych.
    // Program powinien przyjmować jeden argument - liczbę n.

    static int zadanie_25(int n){
        int suma = 0;
        for (int i=0; i<=n; i++){
            if (i%2 == 0){
                suma += i;
            }
        }
        return suma;
    }

    // Zadanie 26.
    // Napisz program, który obliczy i zwróci sumę n
    // kolejnych liczb nieparzystych.
    // Program powinien przyjmować jeden argument - liczbę n.

    static int zadanie_26(int n){
        int suma = 0;
        for (int i=0; i<=n; i++){
            if (i%2 != 0){
                suma += i;
            }
        }
        return suma;
    }

    // Zadanie 27.
    // Napisz program, który obliczy i zwróci sumę n
    // liczb będących kwadratami kolejnych liczb naturalnych.
    // Program powinien przyjmować jeden argument - liczbę n.

    static int zadanie_27(int n){
        int suma = 0;
        for (int i=1; i<=n; i++){
            suma += i*i;
        }
        return suma;
    }

    // Zadanie 28.
    // Napisz program, który obliczy i zwróci sumę n
    // liczb będących sześcianami kolejnych liczb naturalnych.
    // Program powinien przyjmować jeden argument - liczbę n.

    static int zadanie_28(int n){
        int suma = 0;
        for (int i=1; i<=n; i++){
            suma += (i*i*i);
        }
        return suma;
    }

    // Zadanie 29.
    // Napisz program, który obliczy i zwróci sumę n
    // liczb będących odwrotnościami kolejnych liczb naturalnych.
    // Program powinien przyjmować jeden argument - liczbę n.

    static double zadanie_29(int n){
        double suma = 0.0;
        for (int i=1; i<=n; i++){
            suma += 1.0/i;
        }
        return suma;
    }

    // Zadanie 30.
    // Napisz program, który sprawdza (prawda/fałsz)
    // czy liczba n jest doskonała.
    // Program powinien przyjmować jeden argument - liczbę n.

    static boolean zadanie_30(int n){
        int x = 0;
        for (int i=1; i<n; i++){
            if (n%i == 0){
                x+=i;
            }
            if (x == n) {
                return true;
            }
        }
        return false;
    }
}
