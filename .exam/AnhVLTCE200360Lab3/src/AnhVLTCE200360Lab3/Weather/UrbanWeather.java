package AnhVLTCE200360Lab3.Weather;

public class UrbanWeather implements WeatherRecord {

    int id;
    String city;
    double temperature;
    int humidity;
    
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
        return "UrbanWeather [" + this.id + "] " + this.city + ": Temp=" + String.format("%.1f", this.temperature) + "°C, Humidity=" + this.humidity + "%";       
    }
}
