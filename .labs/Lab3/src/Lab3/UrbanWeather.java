package Lab3;

public class UrbanWeather implements WeatherRecord {

    protected int id;
    protected String city;
    protected double temperature;
    protected int humidity;
    
    public UrbanWeather(int id, String city, double temperature, int humidity) {
        this.id = id;
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
    }
    
    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getLocation() {
        return this.city;
    }

    @Override
    public String getType() {
       return "Urban";
    }

    @Override
    public String getInfo() {
        return String.format("UrbanWeather [%d] %s: Temp=%.1f°C, Humidity=%d%%",
                            this.id, this.city, this.temperature, this.humidity);
    }
    
}
