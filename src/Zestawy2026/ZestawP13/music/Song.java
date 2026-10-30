package Zestawy2026.ZestawP13.music;

public class Song {
    private double duration;
    private double popularity;
    private int releaseYear;

    public Song(double duration, double popularity, int releaseYear){
        this.duration = duration;
        this.popularity = popularity;
        this.releaseYear = releaseYear;
    }
    public double getDuration() {
        return duration;
    }
    public double getPopularity() {
        return popularity;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }
    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    @Override
    public String toString() {
        return "Song: [" +duration+ ", " +popularity+ ", " +releaseYear+ "].";
    }
}
