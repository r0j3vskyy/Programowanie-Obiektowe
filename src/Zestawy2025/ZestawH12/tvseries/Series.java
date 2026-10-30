package Zestawy2025.ZestawH12.tvseries;


public class Series implements Comparable<Series>{
    private String name;
    private String creator;
    private int episodes;

    public Series(String name, String creator, int episodes){
        this.name = name;
        this.creator = creator;
        this.episodes = episodes;
    }

    public String getCreator() {
        return creator;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " +name+ ", " +creator+ ", " +episodes;
    }

    @Override
    public int compareTo(Series o) {
        int episodesComparer = Integer.compare(this.episodes, o.episodes);
        if (episodesComparer != 0){
            return episodesComparer;
        }
        return o.name.compareTo(this.name);
    }
}
