package Zestawy2026.ZestawP14.music;

public class Song implements Comparable<Song>{
    private double duration;
    private int popularity;

    public Song(double duration, int popularity){
        this.duration = duration;
        this.popularity = popularity;
    }

    @Override
    public int compareTo(Song o) {
        int durationComparator = Double.compare(this.duration, o.duration);
        if (durationComparator != 0)
            return durationComparator;
        return Integer.compare(this.popularity, o.popularity);
    }

    @Override
    public String toString() {
        return "Song: [" +duration+ ", " +popularity+ "].";
    }
}
