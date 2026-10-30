package PrzykladoweZadania.Nr2.ComparableRecord;

public record Song(String title, String artist, int duration) implements Comparable<Song> {
    @Override
    public int compareTo(Song o) {
        int durationComparator = Integer.compare(this.duration, o.duration);
        if (durationComparator != 0){
            return durationComparator;
        }
        return o.title.compareTo(this.title);
    }
}
