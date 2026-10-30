package PrzykladoweZadania.Nr2.ComparableRecord;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class TestSong {
    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("Parasol", "Kukon", 4));
        songs.add(new Song("Changa", "Quebonafide", 5));
        songs.add(new Song("Dziewczyna z biblioteki", "Kukon", 4));
        songs.add(new Song("Cera", "Deys", 5));
        songs.add(new Song("Roku pora piata", "Deys", 6));

        System.out.println("Przed sortowaniem:");
        for (Song song: songs){
            System.out.println(song);
        }
        Collections.sort(songs);
        System.out.println("Po sortowaniu: ");
        for (Song song: songs){
            System.out.println(song);
        }
    }
}

