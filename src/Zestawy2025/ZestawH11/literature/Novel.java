package Zestawy2025.ZestawH11.literature;

import java.util.ArrayList;
import java.util.Objects;

public class Novel {
    private String title;
    private String author;
    private ArrayList<Double> ratings;

    public Novel(String title, String author, ArrayList<Double> ratings){
        this.title = title;
        this.author = author;
        this.ratings = new ArrayList<>(ratings);
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public ArrayList<Double> getRatings() {
        return new ArrayList<>(ratings);
    }
    public void setRatings(ArrayList<Double> ratings) {
        this.ratings = new ArrayList<>(ratings);
    }

    public void addRating(double rating){
        this.ratings.add(rating);
    }
    public void removeRating(double rating){
        this.ratings.remove(rating);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + title + ", " +author+ ", Ratings: " +getRatings();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null ||this.getClass() != obj.getClass()) return false;
        Novel novel = (Novel) obj;
        return Objects.equals(this.author, novel.author) && Objects.equals(this.title, novel.title);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
