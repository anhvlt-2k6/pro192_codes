package Lab2;

public class Zookeeper {
    protected String name;
    
    public Zookeeper() {
        this.name = "";
    }
    
    public Zookeeper(String name) {
        this.name = name;
    }
    
    public String feed(Animal a) {
        return "Zookeeper " + this.name + " feeds " + a.displayInfo();
    }
}
