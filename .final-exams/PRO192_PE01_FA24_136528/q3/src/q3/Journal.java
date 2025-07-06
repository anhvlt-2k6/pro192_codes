package q3;

public class Journal {
    protected int id;
    protected String publisher;
    protected double price;
    
    public Journal() {
        this.id = 0;
        this.publisher = "";
        this.price = 0.0;
    }
    
    public Journal(int id, String publisher, double price) {
        this.id = id;
        this.publisher = publisher;
        this.price = price;
    }
    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return String.format("%d,%s,%.2f", this.id, this.publisher, this.price);
    }
}
