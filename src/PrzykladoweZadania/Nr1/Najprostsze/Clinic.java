package PrzykladoweZadania.Nr1.Najprostsze;

import java.util.Objects;

public class Clinic extends Hospital {
    private double rating;

    public Clinic(String name, double capacity, double rating){
        super(name, capacity);
        if (0.0 <= rating && rating <= 5.0)
            this.rating = rating;
        else this.rating = 3.0;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        if (0.0 <= rating && rating <= 5.0)
            this.rating = rating;
        else this.rating = 3.0;
    }
    @Override
    public String toString() {
        return super.toString() + "\nRating: " +rating+ ".";
    }
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Clinic other = (Clinic) obj;
        return Double.compare(this.rating, other.rating) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rating);
    }
}
