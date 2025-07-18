package q1;

import java.util.Comparator;

public class Circle extends Point implements Comparator {
    protected double radius;
    
    public Circle() {
        super(0,0);
        this.radius = 0.0;
    }
    
    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getDiameter() {
        return this.radius * 2;
    }
    
    public double getCircumference() {
        return this.getDiameter() * Math.PI;
    }
    
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
    
    public String toString() {
        return String.format("Circle{Center{x=%d,y=%d},radius=%.2f,diameter=%.2f,circumference=%.2f,area=%.2f}",
                this.x, this.y, this.radius, this.getDiameter(), this.getCircumference(), this.getArea());
    }
    
    public String addCircle() {
        return String.format("Add Circle (%d,%d,%.2f)", this.x, this.y, this.radius);
    }

    @Override
    public int compare(Object o1, Object o2) {
        
        Circle fi = (Circle) o1;
        Circle sn = (Circle) o2;
        
        if (fi.getArea() < sn.getArea()) {
            return -1;
        }
        
        if (fi.getArea() > sn.getArea()) {
            return 1;
        }
        
        return 0; 
   }
}
