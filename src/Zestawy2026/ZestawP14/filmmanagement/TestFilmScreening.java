package Zestawy2026.ZestawP14.filmmanagement;

public class TestFilmScreening {
    public static void main(String[] args) {
        Film film1 = new Film(0, "Szybcy i Wsciekli", 125);
        Film film2 = new Film(1, "Tokyo Drift", 135);

        FilmScreening filmsc1 = new FilmScreening("CinemaMovie", film1, 100);
        FilmScreening filmsc2 = new FilmScreening("CinemaCos", film2, 150);
        System.out.println(film1);
        System.out.println(film2);
        System.out.println(filmsc1);
        System.out.println(filmsc2);
        System.out.println(filmsc1.equals(filmsc2));
        System.out.println(filmsc2.equals(filmsc1));
        System.out.println(filmsc1.hashCode());
        System.out.println(filmsc2.hashCode());
    }
}
