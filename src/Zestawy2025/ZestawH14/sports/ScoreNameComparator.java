package Zestawy2025.ZestawH14.sports;

import java.util.Comparator;

public class ScoreNameComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete o1, Athlete o2) {
        int scoreCompare = Integer.compare(o1.score(), o2.score());
        if (scoreCompare != 0){
            return scoreCompare;
        }
        return o1.name().compareTo(o2.name());
    }
}
