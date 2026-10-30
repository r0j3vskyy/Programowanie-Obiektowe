package Zestaw4;

public interface PlatnoscI {
    void zaplac(double zaplaconaKwota);

    default void zaplacBezpiecznie(double zaplaconaKwota){
        if (zaplaconaKwota <= 0){
            System.out.println("Kwota musi byc wieksza od 0");
            return;
        }
        zaplac(zaplaconaKwota);
    }
}
