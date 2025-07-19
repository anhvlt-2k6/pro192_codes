package q2;

public class Employee {
    protected int id;
    protected String name;
    protected double standardSalary;
    
    public Employee() {
        this.id = 0;
        this.name = "";
        this.standardSalary = 0.0;
    }
    
    public Employee(int id, String name, double standardSalary) {
        this.id = id;
        this.name = name;
        this.standardSalary = standardSalary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getStandardSalary() {
        return this.standardSalary;
    }
    
}
