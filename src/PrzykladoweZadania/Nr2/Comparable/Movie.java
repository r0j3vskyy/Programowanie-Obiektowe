package PrzykladoweZadania.Nr2.Comparable;

public class Movie implements Comparable<Movie>{
    private String title;
    private String director;
    private String genre;

    public Movie(String title, String director, String genre){
        this.title = title;
        this.director = director;
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public int compareTo(Movie other) {
        int lengthCompararer = Integer.compare(other.title.length(), this.title.length());
        if (lengthCompararer != 0)
            return lengthCompararer;
        return this.title.compareTo(other.title);
    }
}
