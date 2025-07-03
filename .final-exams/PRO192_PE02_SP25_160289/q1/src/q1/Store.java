package q1;

public class Store {
    protected String name;
    protected String location;
    protected int inventoryCount;
    protected int capacityLimit;
    
    public Store(String name, String location, int inventoryCount, int capacityLimit) {
        this.name = name;
        this.location = location;
        this.inventoryCount = (inventoryCount < 50) ? 50 : inventoryCount;
        this.capacityLimit = capacityLimit;
    }
    
    public String getName() {
        return (this.name.length() >= 5) ? this.name.toUpperCase() : "N/A";
    }
    
    public int getAvailableCapacity() {
        int getAvaildCap = 0;
        
        if (this.capacityLimit < this.inventoryCount) {
            getAvaildCap = this.inventoryCount * 5 - this.inventoryCount;
        } else {
            getAvaildCap = this.capacityLimit - this.inventoryCount;
        }
        
        return getAvaildCap;
    }
    
    @Override
    public String toString() {
        String txt2Str = "";
        
        if (this.capacityLimit < this.inventoryCount) {
            txt2Str = String.format("%s-%s-%s", this.location, this.inventoryCount, this.inventoryCount * 5);
        } else {
            txt2Str = String.format("%s-%s-%s", this.location, this.inventoryCount, this.capacityLimit);
        }
        
        return txt2Str;
    }
}
