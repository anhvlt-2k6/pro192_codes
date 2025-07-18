package q3;

import java.util.Comparator;

public class Furniture implements Comparator {
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

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compare(Object o1, Object o2) {
        
        Furniture fr1 = (Furniture)o1;
        Furniture fr2 = (Furniture)o2;
        
        if (fr1.getPrice() < fr2.getPrice()) {
            return 1;
        }
        
        if (fr1.getPrice() > fr2.getPrice()) {
            return -1;
        }
        
        return 0;
    }
}
