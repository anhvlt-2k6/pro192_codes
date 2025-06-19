package AnhVLTCE200360Lab2;

import AnhVLTCE200360Lab2.Animal.Animal;

public class Zookeeper {

    public String name;
    
    public Zookeeper(String name) {
        this.name = name;
    }
    
    public String feed(Animal a) {
        return this.name;
    }
}
