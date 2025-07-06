package q1;

public class Crow {
    protected String origin;
    protected int weight;
    
    public Crow() {
        this.origin = "";
        this.weight = 0;
    }
    
    public Crow(String origin, int weight) {
        this.origin = origin;
        this.weight = weight;
    }
    
    public String getOrigin() {
        return String.format("%d%s", this.weight, this.origin);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight + 3;
    }
}
