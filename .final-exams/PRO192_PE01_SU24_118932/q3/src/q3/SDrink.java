package q3;

public class SDrink {
    protected String code;
    protected String make;
    protected double price;
    
    public SDrink() {
        this.code = "";
        this.make = "";
        this.price = 0.0;
    }
    
    public SDrink(String code, String make, double price) {
        this.code = code;
        this.make = make;
        this.price = price;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return String.format("%s,%s,%.2f", 
                this.code,
                this.make.toUpperCase(),
                this.price);
    }
}
