package GameObjects;

public class GameObjects {
    private int id;
    protected double x; // position
    protected double y; // -_-
    protected String name;
    protected boolean isInteractive;
    
    
    /*
    * Only for comparator
    */
    public GameObjects() {
        this.id = 0;
        this.x = 0;
        this.y = 0;
        this.name = "";
        this.isInteractive = false;
    }
    
    public GameObjects(int id, double x, double y, String name, boolean isInteractive) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.name = name;
        this.isInteractive = isInteractive;
    }

    public void updateName(String name) {
        
    }
    
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
