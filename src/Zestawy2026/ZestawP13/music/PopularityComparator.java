package Zestawy2026.ZestawP13.music;

import java.util.Comparator;

public class PopularityComparator implements Comparator<Song>{
    @Override
    public int compare(Song o1, Song o2) {
        return Double.compare(o2.getPopularity(), o1.getPopularity());
    }
}
