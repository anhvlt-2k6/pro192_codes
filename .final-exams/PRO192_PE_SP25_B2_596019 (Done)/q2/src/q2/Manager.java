package q2;

public class Manager extends Employee {
    protected String department;
    
    public Manager() {
        this.department = "";
    }
    
    public Manager(String name, int salary, String department) {
        super.name = name;
        super.salary = salary;
        this.department = department;
    }
    
    @Override
    public String toString() {
        return String.format("%s,%s,%s", super.name, super.salary, this.department);
    }
    
    public void setData() {
        this.name = this.name.replace("r", "k");
    }
    
    public int getValue() {
        return (this.department.equals("it")) ? this.salary + 200 : this.salary + 900;
    }
}
