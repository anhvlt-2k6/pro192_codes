package javaencapsulation;

public class Car {
    
    private String manufacture;
    private int horsePower;
    private int yearofRelease;
    
    // No-arg constructor, default
    Car() {
        this.manufacture = "";
        this.horsePower = 100;
        this.yearofRelease = 2000;
    }
    
    // this will return the 
    public String getManufacture() {
        return this.manufacture;
    }
    
    public void setManufacture(String getManuOutsideClass) {
        if (getManuOutsideClass == null || getManuOutsideClass.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.manufacture = getManuOutsideClass;
    }
}

public class JavaEncapsulation {

    public static void main(String[] args) {
        Car civic = new Car();
        civic.setManufacture("Civic");
        System.out.println("Car model is: " + civic.getManufacture());
    }
}
