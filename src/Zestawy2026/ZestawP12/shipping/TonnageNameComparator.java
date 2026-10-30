package Zestawy2026.ZestawP12.shipping;

import java.util.Comparator;

public class TonnageNameComparator implements Comparator<Ship> {
    @Override
    public int compare(Ship s1, Ship s2) {
        int tonnageCompare = Double.compare(s1.tonnage(), s2.tonnage());
        if (tonnageCompare != 0){
            return tonnageCompare;
        }
        return s2.name().compareTo(s1.name());
    }
}
