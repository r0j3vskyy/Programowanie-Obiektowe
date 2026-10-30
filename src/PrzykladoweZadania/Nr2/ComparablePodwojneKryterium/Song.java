package PrzykladoweZadania.Nr2.ComparablePodwojneKryterium;

public class Song implements Comparable<Song>{
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int getDuration() {
        return duration;
    }

    @Override
    public int compareTo(Song o) {
        int durationComparator = Integer.compare(this.duration, o.duration);
        if (durationComparator != 0){
            return durationComparator;
        }
        return o.title.compareTo(this.title);
    }

    @Override
    public String toString() {
        return "Song: [" +title+ ", " +artist+ ", " +duration+ "].";
    }
}
