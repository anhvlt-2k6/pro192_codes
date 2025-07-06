package q1;

public class Ostrich {
    protected String name;
    protected int weight;
    protected int step;
    
    public Ostrich() {
        this.name = "";
        this.weight = 0;
        this.step = 0;
    }
    
    public Ostrich(String name, int weight) {
        this.name = name;
        this.weight = (weight <= 0) ? 1 : weight;
        this.step = (this.weight >= 1 && this.weight <= 10) ? 5 : this.weight + 5;
    }
    
    public String getName() {
        return this.name.toLowerCase();
    }
    
    public int getStep() {
        return this.step;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = (weight <= 0) ? 1 : weight;
        this.step = (this.weight >= 1 && this.weight <= 10) ? 5 : this.weight + 5;
    }
    
    @Override
    public String toString() {
        return String.format("%s,%d,%d", this.name.toLowerCase(), this.weight, this.step);
    }
}
