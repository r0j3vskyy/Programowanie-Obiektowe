package Zestawy2026.ZestawP14.filmmanagement;

import java.util.Objects;

public class FilmScreening {
    private String cinemaName;
    private Film film;
    private int audienceCount;

    public FilmScreening(String cinemaName, Film film, int audienceCount){
        this.cinemaName = (cinemaName != null) ? cinemaName : "";
        this.film = (film != null) ? new Film(film.getFilmId(), film.getTitle(), film.getDuration()) : new Film(0, "", 0);
        this.audienceCount = (audienceCount >= 0) ? audienceCount : 0;
    } 
    public String getCinemaName() {
        return cinemaName;
    }
    public void setCinemaName(String cinemaName) {
        this.cinemaName = (cinemaName != null) ? cinemaName : "";
    }
    public Film getFilm() {
        return film;
    }
    public void setFilm(Film film) {
        this.film = (film != null) ? new Film(film.getFilmId(), film.getTitle(), film.getDuration())
        : new Film(0, "", 0);
    }
    public int getAudienceCount() {
        return audienceCount;
    }
    public void setAudienceCount(int audienceCount) {
        this.audienceCount = (audienceCount >= 0) ? audienceCount : 0;
    }
    @Override
    public String toString() {
        return "FilmScreening: [" +cinemaName+ ", " +film+ ", " +audienceCount+ "].";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FilmScreening filmsc = (FilmScreening) obj;
        return Objects.equals(this.getCinemaName(), filmsc.getCinemaName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(cinemaName);
    }
}
