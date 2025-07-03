package q2;

public class Student extends Person {
    protected int gpa;
    
    public Student(String id, String name, String email, int gpa) {
        super.id = id;
        super.name = name;
        super.email = email;
        this.gpa = (gpa < 0 || gpa > 100) ? 0 : gpa;
    }
    
    public int getGpa() {
        return this.gpa;
    }
    
    public void setGpa(int gpa) {
        this.gpa = (gpa < 0 || gpa > 100) ? 0 : gpa;
    }
    
    public double getReward() {
        double reward = 0, p = this.gpa / 100;
        
        if (this.gpa >= 70 && this.gpa < 80) reward = 7000 * p;
        if (this.gpa >= 80 && this.gpa < 90) reward = 8000 * p;
        if (this.gpa >= 90 && this.gpa <= 100) reward = 9000 * p; 
        
        return reward;
    }
    
    @Override
    public String toString() {
        return String.format("%s, %s, %s, %.2f", 
                super.id, super.name.toUpperCase(), super.email, this.getReward());
    }
}
