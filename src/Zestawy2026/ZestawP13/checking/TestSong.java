package Zestawy2026.ZestawP13.checking;

public class TestSong {
    public static void main(String[] args) {
         Song[] songs = new Song[3];
        Song songjeden = new Song(5.5, 3);
        Song songdwa = new Song(4.5, 2);
        songs[0] = songjeden;
        songs[1] = new Song(4.5, 2);
        songs[2] = new Song(6.6, 5);
        
        System.out.println(Utils.search(songs, songjeden));
        System.out.println(Utils.search(songs, songdwa));
    }
}
