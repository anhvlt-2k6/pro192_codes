package AnhVLTCE200360Lab5;

public class SmartThermostat implements SmartDevice {
    protected String id;
    protected int temperature;
    protected boolean isOn;
    
    public SmartThermostat() {
        this.id = "";
        this.temperature = 0;
        this.isOn = false;
    }
    
    public SmartThermostat(String id, int temperature, boolean isOn) {
        this.id = id;
        this.temperature = temperature;
        this.isOn = isOn;
    }
    
    public SmartThermostat(String id, int temperature) {
        this.id = id;
        this.temperature = temperature;
        this.isOn = false;
    } 

    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }
    
    
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getId() {
        return this.id;
    }
    
    
    @Override
    public String getStatus() {
        return String.format("%s - Thermostat - %s - Temperature: %d", 
                            this.id, (this.isOn) ? "ON" : "OFF", this.temperature);
    }
}
