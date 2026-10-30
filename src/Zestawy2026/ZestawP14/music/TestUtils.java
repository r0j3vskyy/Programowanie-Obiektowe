package Zestawy2026.ZestawP14.music;

import java.util.Arrays;

public class TestUtils {
    public static void main(String[] args) {
        Song[] songs1 = new Song[3];
        songs1[0] = new Song(5.5, 80);
        songs1[1] = new Song(4.5, 100);
        songs1[2] = new Song(4.5, 70);
        System.out.println("Songs1: ");
        Arrays.sort(songs1);
        for (Song song: songs1){
            System.out.println(song);
        }
        System.out.println("Median: " +Utils.findMedian(songs1));

        Song[] songs2 = new Song[4];
        songs2[0] = new Song(5.5, 80);
        songs2[1] = new Song(4.5, 100);
        songs2[2] = new Song(4.5, 70);
        songs2[3] = new Song(6.0, 75);
        Arrays.sort(songs2);
        System.out.println("Songs2: ");
        for (Song song: songs2){
            System.out.println(song);
        }
        System.out.println("Median: " +Utils.findMedian(songs2));
    }
}
