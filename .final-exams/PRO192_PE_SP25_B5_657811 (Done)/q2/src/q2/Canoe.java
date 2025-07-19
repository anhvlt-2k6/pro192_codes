package q2;

public abstract class Canoe {
    protected String driver;
    protected int rate;
    
    public Canoe() {
        this.driver = "";
        this.rate = 0;
    }
    
    public Canoe(String driver, int rate) {
        this.driver = driver;
        this.rate = rate;
    }
    
    public String getDriver() {
        return this.driver;
    }
    
    public int getRate() {
        return this.rate;
    }
    
    public void setDriver(String driver) {
        this.driver = driver;
    }
    
    public String toString() {
        return String.format("%s, %s", driver, rate);
    }
}
