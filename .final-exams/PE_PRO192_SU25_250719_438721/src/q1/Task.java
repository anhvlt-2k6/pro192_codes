package q1;

public abstract class Task {
    protected int id;
    protected String name;
    protected boolean done;
    
    public Task() {
        this.id = 0;
        this.name = "";
        this.done = false;
    }
    
    public Task(int id, String name) {
        this.id = id;
        this.name = name;
        this.done = false;
    }
    
    public void markDone() {
        this.done = true;
    }
    
    public boolean isDone() {
        return this.done;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public abstract String getInfo();
    public abstract String getType();
}
