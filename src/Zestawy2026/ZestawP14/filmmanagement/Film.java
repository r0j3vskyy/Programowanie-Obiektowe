package Zestawy2026.ZestawP14.filmmanagement;

import java.util.Objects;

public class Film {
    private int filmId;
    private String title;
    private int duration;

    public Film(int filmId, String title, int duration){
        this.filmId = (filmId >= 0) ? filmId : 0;
        this.title = (title != null) ? title : "";
        this.duration = (duration >= 0) ? duration : 0; 
    }
    public int getFilmId() {
        return filmId;
    }
    public void setFilmId(int filmId) {
        this.filmId = (filmId >= 0) ? filmId : 0;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = (title != null) ? title : "";
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = (duration >= 0) ? duration : 0; 
    }
    @Override
    public String toString() {
        return "Film: [" +filmId+ ", " +title+ ", " +duration+ "]."; 
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Film film = (Film) obj;
        return film.filmId == this.filmId;
    }
    @Override
    public int hashCode() {
        return Objects.hash(filmId);
    }
}
