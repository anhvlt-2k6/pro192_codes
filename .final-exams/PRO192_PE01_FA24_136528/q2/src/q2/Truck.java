package q2;

public class Truck extends Vehicle {
    
    protected double cargoCapacity;

    public Truck(String model, String fuelType, double fuelEfficiency, double cargoCapacity) {
        super(model, fuelType, fuelEfficiency);
        this.cargoCapacity = cargoCapacity;
    }
    
    public double getCargoCapacity() {
        return this.cargoCapacity;
    }
    
    @Override
    public double calculateFuelEfficiency() {
        return super.fuelEfficiency * (1.0 / (1.0 + (this.cargoCapacity / 1000.0)));
    }

    @Override
    public double calculateDistanceTraveled() {
        return this.calculateFuelEfficiency() * super.fuelEfficiency;
    }
    
    @Override
    public String toString() {
        return String.format("%s,%s,%.2f,%.2f", 
                super.model, super.fuelType, super.fuelEfficiency, this.cargoCapacity);
    }
}
