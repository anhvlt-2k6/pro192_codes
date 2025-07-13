package Lab2;

public class Elephant extends Animal {

    public Elephant (String name) {
        super(name);
    }
    
    @Override
    public String makeSound() {
        return "Trumpet";
    }
    
    @Override
    public String displayInfo() {
        return super.name;
    }
    
}
