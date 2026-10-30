package PrzykladoweZadania.Nr2.DoubleComparator;

public class WeatherForecast {
    private int id;
    private String date;
    private double temperature;

    public WeatherForecast(int id, String date, double temperature){
        this.id = id;
        this.date = date;
        this.temperature = temperature;
    }
    public int getId() {
        return id;
    }
    public String getDate() {
        return date;
    }
    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Forecast: ["+id+ ", "+date+", "+temperature+"].";
    }
}
