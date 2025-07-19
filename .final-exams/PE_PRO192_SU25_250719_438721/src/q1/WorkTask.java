package q1;

public class WorkTask extends Task {

    protected String project;
    
    public WorkTask() {
        super(0, "");
        this.project = "";
    }
    
    public WorkTask(int id, String name, String project) {
        super(id, name);
        this.project = project;
    }
    
    
    
    @Override
    public String getInfo() {
        return String.format("Work: [%d] %s (%s) - %s", 
                             super.getId(),
                             super.getName(),
                             this.project,
                             (super.done) ? "Done" : "Not Done");
    }

    @Override
    public String getType() {
        return "Work";
    }
}
