package q2;

public class SoidStateDrive extends Product {

    protected String code;
    protected int speed;
    protected int quantity;
    protected double price;
    
    public SoidStateDrive() {
        this.code = "";
        this.speed = 0;
        this.quantity = 0;
        this.price = 0.0;
    }
    
    public SoidStateDrive(String code, int speed, int quantity, double price, String name, String brand) {
        this.code = code;
        this.speed = speed;
        this.quantity = quantity;
        this.price = price;
        super.name = name;
        super.brand = brand;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        super.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        super.brand = brand;
    }
    
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d,%.2f", 
                this.code,
                super.name,
                super.brand,
                this.speed,
                this.price);
    }
    
    @Override
    public double getFinalPrice() {
        double finalPrice = 0;
        
        if (this.speed <= 1024) {
            finalPrice = this.price * 0.8;
        } else if (this.speed > 1024 && this.speed <= 2048) {
            finalPrice = this.price * 0.9;
        } else {
            finalPrice = this.price * 0.95;
        }
        
        return finalPrice;
    }

    @Override
    public double getTotalAmount() {
        return this.quantity * this.getFinalPrice();
    }
}
