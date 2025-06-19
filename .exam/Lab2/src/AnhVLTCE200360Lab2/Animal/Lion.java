package AnhVLTCE200360Lab2.Animal;

public class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }
    
    @Override
    public String makeSound() {
        return "Roar";
    }
    
    @Override
    public String displayInfo() {
        return this.name;
    }
}
