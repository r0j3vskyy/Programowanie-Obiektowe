package PrzykladoweZadania.Nr2.RekordComparator;

import java.util.Arrays;

public class TestComparator {
    public static void main(String[] args) {
        Song[] songs = new Song[5];
        songs[0] = new Song("Parasol", "Kukon", 4);
        songs[1] = new Song("Changa", "Quebonafide", 5);
        songs[2] = new Song("Dziewczyna z biblioteki", "Kukon", 4);
        songs[3] = new Song("Cera", "Deys", 5);
        songs[4] = new Song("Roku pora piata", "Deys", 6);

        System.out.println("Przed sortowaniem:");
        for (Song song: songs){
            System.out.println(song);
        }

        DurationTitleComparator comp = new DurationTitleComparator();
        Arrays.sort(songs, comp);
        System.out.println("Po sortowaniu:");
        for (Song song: songs){
            System.out.println(song);
        }
    }
}
