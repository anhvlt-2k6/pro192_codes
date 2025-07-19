package q2;

public class Professor extends Employee {
    protected String department;
    
    public Professor() {
        this.department = "";
    }
    
    public Professor(int id, String name, double standardSalary, String department) {
        super.id = id;
        super.name = name;
        super.standardSalary = standardSalary;
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }
    
    public double calculateActualSalary() {
        double professorSalary = super.standardSalary;
        
        if (this.department.equals("GD") || this.department.equals("gd")) {
            professorSalary = professorSalary * 1.5;
        }
        
        if (this.department.equals("IT") || this.department.equals("it")) {
            professorSalary = professorSalary * 2.0;
        }
        
        super.standardSalary = professorSalary;
        
        return professorSalary;
    }
    
    public String toString() {
        super.standardSalary = this.calculateActualSalary();
        
        return String.format("%s, %s, %s, %s", 
                super.id, super.name, this.department, super.standardSalary);
    }
}
