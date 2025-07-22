package GameObjects;

public abstract class GameObjects {
    protected int id;
    protected double x; // position
    protected double y; // -_-
    protected String name;
    protected boolean isInteractive;
    
    public GameObjects(int id, double x, double y, String name, boolean isInteractive) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.name = name;
        this.isInteractive = isInteractive;
    }
    
    abstract public void updatePosition(double x, double y);
    abstract public void updateName(String name);
    
    public int getId() {
        return this.id;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public String getName() {
        return this.name;
    }
    
    public boolean isInteractive() {
        return this.isInteractive;
    }
}
