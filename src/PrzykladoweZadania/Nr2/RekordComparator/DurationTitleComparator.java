package PrzykladoweZadania.Nr2.RekordComparator;

import java.util.Comparator;

public class DurationTitleComparator implements Comparator<Song>{
    @Override
    public int compare(Song o1, Song o2) {
        int durationComparator = Integer.compare(o1.duration(), o2.duration());
        if (durationComparator != 0){
            return durationComparator;
        }
        return o1.title().compareTo(o2.title());
    }
}
