package AnhVLTCE200360Lab7;

public class Light implements Device {

    protected String id;
    protected boolean isOn;
    protected int brightness;
    
    public Light() {
        this.id = "";
        this.isOn = false;
        this.brightness = 0;
    }
    
    public Light(String id) {
        this.id = id;
        this.isOn = false;
        this.brightness = 0;
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
        return String.format("%s [%s] - Brightness: %d", 
                             this.id,
                             (this.isOn) ? "ON" : "OFF",
                             this.brightness);
    }

    @Override
    public String getId() {
        return this.id;
    }
    
    public void setBrightness(int value) {
        this.brightness = value;
    }
}
