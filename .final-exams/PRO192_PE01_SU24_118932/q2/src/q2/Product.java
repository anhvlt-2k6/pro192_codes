package q2;

public abstract class Product {
    protected String name;
    protected String brand;
    
    public Product() {
        this.name = "";
        this.brand = "";
    }
    
    public Product(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public abstract double getFinalPrice();
    public abstract double getTotalAmount();
}
