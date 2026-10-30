package PrzykladoweZadania.Nr2.Singleton;

public class TestArtGallery {
    public static void main(String[] args) {
        ArtGallery gal1 = ArtGallery.getInstance("galeria jeden");
        ArtGallery gal2 = ArtGallery.getInstance("gal dwa");
        System.out.println(gal1.getName());
        System.out.println(gal2.getName());
        if (gal1 == gal2){
            System.out.println("oba obiekty to ta sama instancja");
        } else {
            System.out.println("powstaly dwa rozne obiekty :/");
        }
    }
}
