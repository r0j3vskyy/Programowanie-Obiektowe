package Zestawy2025.ZestawH14.limitVerifier;

public class Utils {
    public static <T extends Comparable<T>> boolean isOutOfRange(T parameter, T lowerLimit, T upperLimit){
        if (parameter == null || lowerLimit == null || upperLimit == null)
            throw new IllegalArgumentException("Zaden z argumentow nie moze byc nullem");
        if (parameter.compareTo(lowerLimit) < 0 || parameter.compareTo(upperLimit) > 0)
            return true;
        return false;
    }
}
