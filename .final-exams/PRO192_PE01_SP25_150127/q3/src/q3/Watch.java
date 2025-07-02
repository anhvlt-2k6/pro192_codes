package q3;

public class Watch {
    protected int id;
    protected String brand;
    protected String model;
    protected double price;
    
    public Watch() {
        this.id = 0;
        this.brand = "";
        this.model = "";
        this.price = 0.0;
    }
    
    public Watch(int id, String brand, String model, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String toString() {
        return String.format("%s, %s, %s, %s", this.id, this.brand, this.model, this.price);
    }
}
