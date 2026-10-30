package PrzykladoweZadania.Nr1.Tablica;

import java.util.Arrays;
import java.util.Objects;

public class ComputerGame {
    private String title;
    private String producer;
    private double[] ratings;

    public ComputerGame(String title, String producer, double[] ratings){
        this.title = title;
        this.producer = producer;
        this.ratings = (ratings != null) ? ratings.clone() : new double[0];
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public double[] getRatings() {
        return (ratings != null) ? ratings.clone() : null;
    }
    public void setRatings(double[] ratings) {
        this.ratings = (ratings != null) ? ratings.clone() : new double[0];
    }

    public void addRating(double rating){
        double[] newRatings = Arrays.copyOf(ratings, ratings.length + 1);
        newRatings[newRatings.length - 1] = rating;
        this.ratings = newRatings;
    }
    public void removeRating(int index){
        if (index < 0 || index >= ratings.length) return;

        double[] newRatings = new double[ratings.length - 1];
        for (int i=0, j=0; i<ratings.length; i++){
            if (i == index) continue;
            newRatings[j++] = ratings[i];
        }
        this.ratings = newRatings;
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, producer, Arrays.hashCode(ratings));
    }
}
