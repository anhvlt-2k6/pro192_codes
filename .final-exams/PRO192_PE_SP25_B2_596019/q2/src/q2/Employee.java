package q2;

public class Employee {
    protected String name;
    protected int salary;
    
    public Employee() {
        this.name = "";
        this.salary = 0;
    }
    
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString_classic() {
        return String.format("%s,%s", this.name, this.salary);
    }
}
