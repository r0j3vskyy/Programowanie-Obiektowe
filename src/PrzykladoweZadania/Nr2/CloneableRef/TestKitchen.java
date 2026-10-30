package PrzykladoweZadania.Nr2.CloneableRef;

public class TestKitchen {
    public static void main(String[] args) {

        try {
            Stove stove = new Stove(4, "Beko", 123456);
            Kitchen kitchen = new Kitchen("Kuchnia", stove);

            Kitchen kuchnia2 = kitchen.clone();
            System.out.println("Oryginal: " +kitchen);
            System.out.println("Kopia: " +kuchnia2);
        }
        catch (CloneNotSupportedException ex){
            System.out.println("Blad: " +ex);
        }
    }
}
