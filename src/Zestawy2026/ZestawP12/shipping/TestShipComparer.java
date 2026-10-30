package Zestawy2026.ZestawP12.shipping;

import java.util.Arrays;

public class TestShipComparer {
    public static void main(String[] args) {
        Ship[] ships = {
            new Ship(10, "Orzel", 5),
            new Ship(7, "Biala mewa", 3),
            new Ship(11, "Felicia", 13),
            new Ship(150, "Titanic", 200),
            new Ship(3, "Mini", 2)
        };
        System.out.println("Przed sortowaniem: ");
        // for (int i=0; i<ships.length; i++){
        //     System.out.println(ships[i]);
        // }
        for (Ship s: ships) System.out.println(s);

        Arrays.sort(ships, new TonnageNameComparator());
        System.out.println("Po sortowaniu: ");
        // for (int i=0; i<ships.length; i++){
        //     System.out.println(ships[i]);
        // }
        for (Ship s: ships){
            System.out.println(s);
        }
    }
}
