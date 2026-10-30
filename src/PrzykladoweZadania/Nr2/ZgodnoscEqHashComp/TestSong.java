package PrzykladoweZadania.Nr2.ZgodnoscEqHashComp;

public class TestSong {
    public static void main(String[] args) {
        Song song1 = new Song("Parasol", "Kukon", 7);
        Song song2 = new Song("Parasol", "Deys", 5);
        Song song3 = new Song("Warszawa", "Kukon", 10);

        System.out.println(song1.equals(song2));
        System.out.println(song1.equals(song3));
    }
}
