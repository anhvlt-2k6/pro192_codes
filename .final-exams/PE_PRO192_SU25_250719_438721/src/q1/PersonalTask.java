package q1;

public class PersonalTask extends Task {
    protected String location;
    
    public PersonalTask() {
        super(0, "");
        this.location = "";
    }
    
    public PersonalTask(int id, String name, String location) {
        super(id, name);
        this.location = location;
    }

    @Override
    public String getInfo() {
        return String.format("Personal: [%d] %s (%s) - %s", 
                super.getId(),
                super.getName(),
                this.location, 
                (super.done) ? "Done" : "Not Done");
    }

    @Override
    public String getType() {
        return "Personal";
    }
}
