package Zestawy2026.ZestawP12.plprogramowanieGeneryczne;

public class Utils {
    public static <T extends Comparable<T>> boolean isInRange(T first, T middle, T last){
        T min = (first.compareTo(last) <= 0) ? first : last;
        T max = (first.compareTo(last) >= 0) ? first : last;
        return middle.compareTo(min) >= 0 && middle.compareTo(max) <= 0;
    }
}
