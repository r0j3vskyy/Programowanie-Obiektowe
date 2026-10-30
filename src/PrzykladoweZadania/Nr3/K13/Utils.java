package PrzykladoweZadania.Nr3.K13;

public class Utils {
    public static <T> boolean isEitherNull(T arg1, T arg2){
        if (arg1 == null || arg2 == null)
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = null;
        int i1 = 10;
        int i2 = 20;

        System.out.println(Utils.isEitherNull(s1, s2));
        System.out.println(Utils.isEitherNull(i1, i2));
        System.out.println(Utils.isEitherNull(null, null));
    }
}
