package Zestawy2026.ZestawP13.checking;

public class Song {
    private double rating;
    private int duration;

    public Song(double rating, int duration){
        this.rating = rating;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
    public double getRating() {
        return rating;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Song: [" +rating+ ", " +duration+ "].";
    }
}
