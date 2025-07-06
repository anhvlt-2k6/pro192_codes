package q1;

public class ElectricMotor {
    protected String name;
    protected int voltage;
    protected int current;
    
    public ElectricMotor() {
        this.name = "";
        this.voltage = 0;
        this.current = 0;
    }
    
    public ElectricMotor(String name, int voltage, int current) { 
        this.name = name;
        this.voltage = voltage;
        this.current = current;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getPower() {
        return this.voltage * this.current;
    }
    
    public void setVotage(int voltage) {
        if (voltage >= 100 && voltage <= 220) {
            this.voltage = voltage;
        }
    }
    
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s", 
                this.name.toUpperCase(), 
                this.voltage,
                this.current,
                this.getPower());
    }
}
