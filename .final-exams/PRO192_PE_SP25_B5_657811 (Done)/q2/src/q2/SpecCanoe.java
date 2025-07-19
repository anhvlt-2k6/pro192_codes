package q2;

public class SpecCanoe extends Canoe {
    
    protected String color;
    
    public SpecCanoe() {
        this.color = "";
    }
    
    public SpecCanoe(String driver, int rate, String color) {
        super.rate = rate;
        super.driver = driver;
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    
    @Override
    public String toString() {
        return String.format("%s, %s, %s", super.driver, this.color, super.rate);
    }
    
    public void setData() {
        String digits = String.format("%d", rate);
        super.driver = digits.charAt(digits.length() - 1) + driver;
    }
    
    public String getValue() {
        char firstOfColor = color.charAt(0);
        String speedforNeed = "SLOW";
        if (firstOfColor == 'B' || firstOfColor == 'Y') {
            speedforNeed = "FAST";
        }
        
        return speedforNeed.concat(super.driver);
    }
}
