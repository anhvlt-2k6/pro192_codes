package AnhVLTCE200360Lab3.Weather;

public class RuralWeather implements WeatherRecord {
    int id;
    String village;
    double temperature;
    boolean stormAlert;
    
    public RuralWeather(int id, String villageName, double temp, boolean stormAle) {
        this.id = id;
        this.village = villageName;
        this.temperature = temp;
        this.stormAlert = stormAle;
    }
    
    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getLocation() {
        return this.village;
    }

    @Override
    public String getType() {
        return "Rural";
    }

    @Override
    public String getInfo() {
        if (stormAlert) {
            return "RuralWeather [" + this.id + "] " + this.village + ": Temp=" + String.format("%.1f", this.temperature) + "°C, StormAlert=true";
        } else {
            return "RuralWeather [" + this.id + "] " + this.village + ": Temp=" + String.format("%.1f", this.temperature) + "°C, StormAlert=false";
        }
    }
}
