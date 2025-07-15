package AnhVLTCE200360Lab5;

public class SmartLight implements SmartDevice {
    protected String id;
    protected int brightness;
    protected boolean isOn;
    
    public SmartLight() {
        this.id = "";
        this.brightness = 0;
        this.isOn = false;
    }
    
    public SmartLight(String id, int brightness, boolean isOn) {
        this.id = id;
        this.brightness = brightness;
        this.isOn = isOn;
    }
    
    public SmartLight(String id, int brightness) {
        this.id = id;
        this.brightness = brightness;
        this.isOn = false;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
    
    @Override
    public String getId() {
        return this.id;
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
    public String getStatus() {
        return String.format("%s - Light - %s - Brightness: %d", 
                            this.id, (this.isOn) ? "ON" : "OFF", this.brightness);
    }
}
