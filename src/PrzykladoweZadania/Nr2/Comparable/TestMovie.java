package PrzykladoweZadania.Nr2.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMovie {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Harry Potter i komnata tajemnic", "Gucio", "Czary"));
        movies.add(new Movie("Szybcy i wsciekli 15", "honda", "samochody"));
        movies.add(new Movie("Avatar", "ktos tam", "cgi"));
        movies.add(new Movie("Skazany na Shawshang", "jakis ktos", "dokument"));

        System.out.println("Przed sortowaniem");
        for (Movie m : movies){
            System.out.println(m);
        }
        Collections.sort(movies);
        for (Movie m : movies){
            System.out.println(m);
        }
    }
}
