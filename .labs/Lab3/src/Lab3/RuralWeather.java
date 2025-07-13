package Lab3;

public class RuralWeather implements WeatherRecord {

    protected int id;
    protected String village;
    protected double temperature;
    protected boolean stormAlert;
    
    public RuralWeather(int id, String village, double temperature, String stormAlert) {
        this.id = id;
        this.village = village;
        this.temperature = temperature;
        this.stormAlert = (stormAlert.equals("true"));
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
        return String.format("RuralWeather [%d] %s: Temp=%.1f°C, StormAlert=%s",
                            this.id, this.village, this.temperature, (stormAlert) ? "true" : "false");
    }
    
}
