package q1;

public class Suitcase {
    protected int id;
    protected String name;
    protected double capacity;
    protected int maxWeight;
    
    public Suitcase() { 
        this.id = 0;
        this.name = "";
        this.capacity = 0.0;
        this.maxWeight = 0;
    }
    
    public Suitcase(int id, String name, double capacity, int maxWeight) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.maxWeight = maxWeight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public double expandSuitcase() {
        double nc = 0.0;
        
        if (this.maxWeight <= 7) {
            nc = this.capacity;
        } else if (this.maxWeight >= 15) {
            nc = this.capacity + 5.0;
        } else {
            nc = this.capacity + 2.0;
        }
        
        return nc;
    }
    
    public String toString() {
        return String.format("%s, %s, %s, %s", this.id, this.name, this.capacity, this.maxWeight);
    }
}
