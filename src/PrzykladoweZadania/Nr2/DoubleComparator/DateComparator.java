package PrzykladoweZadania.Nr2.DoubleComparator;

import java.util.Comparator;

public class DateComparator implements Comparator<WeatherForecast>{
    @Override
    public int compare(WeatherForecast o1, WeatherForecast o2) {
        return o2.getDate().compareTo(o1.getDate());
    }
}
