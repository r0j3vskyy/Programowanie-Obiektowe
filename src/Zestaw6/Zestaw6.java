package Zestaw6;

import java.time.LocalDate;

public class Zestaw6 {
    public static void main(String[] args) {
        // owoce
        Jablko j = new Jablko("Jablko Bartek", 2.50, 15, LocalDate.of(2025, 12, 31));
        Gruszka g = new Gruszka("Gruszka Grazyna", 2.99, 17, LocalDate.of(2025, 12, 15));
        Banan b = new Banan("Banan Bartek", 1.98, 15, LocalDate.of(2025, 12, 17));

        // warzywa
        Marchew m = new Marchew("Marchewka Marzena", 1.56, 11, LocalDate.of(2025, 12, 11));
        Brokul br = new Brokul("Brokul Bogdan", 4.15, 40, LocalDate.of(2026, 1, 11));
        Ziemniak z = new Ziemniak("Ziemniak Zenek", 1.25, 1000, LocalDate.of(2026, 3, 11));

        // ubrania
        Koszulka kosz = new Koszulka("Abibas", 9.99, 100, "Adibas", 0);
        Czapka czap = new Czapka("Kucci", 14.99, 200, "Boos", 0);
        Spodnie spod = new Spodnie("Nuke", 99.99, 100, "Tuna", 0);

        // urzadzenia elektroniczne
        Telefon telef = new Telefon("es 2137 pro", 1999, 11, "Szajsunk", 12);
        Komputer komp = new Komputer("er 13 ultra sigma hdmi", 4999, 7, "Appel", 30);
        Telewizor telew = new Telewizor("tysionc cali", 100000, 5, "Ksiaomi", 12);

        // spozywcze test
        System.out.println(j);
        System.out.println(g);
        System.out.println(b);
        System.out.println(m);
        System.out.println(br);
        System.out.println(z);
        System.out.println(g.getNazwa() + " - " + g.smak());
        j.umyj();
        z.zjedz();
        // przemyslowe test
        System.out.println(kosz);
        System.out.println(czap);
        System.out.println(spod);
        System.out.println(telef);
        System.out.println(komp);
        System.out.println(telew);
        kosz.zaloz();
        telew.wylacz();

        Osoba os1 = new Osoba("Robert", "Nwm", 15);
        Osoba os2 = new Osoba("Tomasz", "Lewandowski", 25);
        System.out.println(os1.compareTo(os2));
    }
}
