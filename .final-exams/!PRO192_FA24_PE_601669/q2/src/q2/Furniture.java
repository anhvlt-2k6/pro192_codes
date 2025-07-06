package q2;

public class Furniture {
    protected String name;
    protected int price;
    
    public Furniture() {
        this.name = "";
        this.price = 0;
    }
    
    public Furniture(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return String.format("%s,%s", this.name, this.price);
    }
}
