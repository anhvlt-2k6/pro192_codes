package AnhVLTCE200360Lab2.Animal;

public class Elephant extends Animal {
    
    public Elephant(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Trumpet";
    }
    
    @Override
    public String displayInfo() {
        return this.name;
    }
}
