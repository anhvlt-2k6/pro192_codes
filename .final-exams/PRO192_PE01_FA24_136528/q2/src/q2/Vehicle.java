package q2;

public abstract class Vehicle {
    protected String model;
    protected String fuelType;
    protected double fuelEfficiency;
    
    public Vehicle(String model, String fuelType, double fuelEfficiency) {
        this.model = model;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getModel() {
        return this.model;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public double getFuelEfficiency() {
        return this.fuelEfficiency;
    }
    
    public abstract double calculateFuelEfficiency();
    public abstract double calculateDistanceTraveled();
}
