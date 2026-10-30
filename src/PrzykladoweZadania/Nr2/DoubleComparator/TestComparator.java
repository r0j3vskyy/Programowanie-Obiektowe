package PrzykladoweZadania.Nr2.DoubleComparator;

import java.util.List;
import java.util.ArrayList;

public class TestComparator {
    public static void main(String[] args) {
        List<WeatherForecast> forecasts = new ArrayList<>();
        forecasts.add(new WeatherForecast(0, "25.12", 0.7));
        forecasts.add(new WeatherForecast(1, "27.12", 1.2));
        forecasts.add(new WeatherForecast(2, "31.12", 5.5));

        TemperatureComparator tempComp = new TemperatureComparator();
        DateComparator dateComp = new DateComparator();

        forecasts.sort(tempComp.thenComparing(dateComp));
        for (WeatherForecast f: forecasts)
            System.out.println(f);
    }
}
