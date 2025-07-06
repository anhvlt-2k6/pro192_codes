package q2;

public class SpecFurniture extends Furniture {
    protected String style;
    
    public SpecFurniture() {
        this.style = "";
    }
    
    public SpecFurniture(String name, int price, String style) {
        super.name = name;
        super.price = price;
        this.style = style;
    }

    public String getStyle() {
        return this.style;
    }
    
    public String super_toString() {
        return super.toString();
    }
    
    public String toString() {
        return String.format("%s,%s,%d", super.name, this.style, super.price);
    }
    
    public void setData() {
        char[] price_arr = String.format("%d", super.price).toCharArray();
        super.name = price_arr[0] + super.name;
    }
    
    public String getValue() {
        return (super.price < 10) ? (super.name + this.style) : (super.name);
    }
    
}
