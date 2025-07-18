package AnhVLTCE200360Lab7;

public class Thermostat implements Device {

    protected String id;
    protected boolean isOn;
    protected int temperature;
    
    public Thermostat() {
        this.id = "";
        this.isOn = false;
        this.temperature = 0;
    }
    
    public Thermostat(String id) {
        this.id = id;
        this.isOn = false;
        this.temperature = 0;
    }
    
    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public String getStatus() {
        return String.format("%s [%s] - Temperature: %d°C", 
                             this.id,
                             (this.isOn) ? "ON" : "OFF",
                             this.temperature);
    }

    @Override
    public String getId() {
        return this.id;
    }

    public void setTemperature(int value) {
        this.temperature = value;
    }
}
