package Zestawy2026.ZestawP13.music;

import java.util.Arrays;

public class TestSong {
    public static void main(String[] args) {
        Song[] songs = new Song[5];
        songs[0] = new Song(4.5, 5.5, 2010);
        songs[1] = new Song(5.5, 7, 2015);
        songs[2] = new Song(3, 4, 2010);
        songs[3] = new Song(5, 6, 2014);
        songs[4] = new Song(4, 5, 2020);

        DurationComparator d1 = new DurationComparator();
        PopularityComparator p1 = new PopularityComparator();

        Arrays.sort(songs, d1.thenComparing(p1));
        for (Song s: songs){
            System.out.println(s);
        }
    }
}
