package PrzykladoweZadania.Nr1.Najprostsze;

public class TestHospital {
    public static void main(String[] args) {
        Clinic c1 = new Clinic("szpital", 50, 4.5);
        Clinic c2 = new Clinic("klinika", 100, 5.0);
        Clinic c3 = new Clinic("klinika", 100, 5.0);
        Hospital h1 = new Hospital("szpital", 100);
        Hospital h2 = new Hospital("nieszpital", 50);

        System.out.println(c1.equals(h2));
        System.out.println(c2.equals(h1));
        System.out.println(c3.equals(h2));
        System.out.println(c1.equals(h1));
        System.out.println(c3.equals(c2));
    }
}
