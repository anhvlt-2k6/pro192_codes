package q2;

public class Person {
    protected String id;
    protected String name;
    protected String email;
    
    public Person() {
        this.id = "";
        this.name = "";
        this.email = "";
    }
    
    public Person(String id, String name, String email) {
        this.id = id;
        this.name = (name.contains("@") || name.contains(".")) ? name : "N/A";
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
       return String.format("%s, %s, %s", this.id, this.name.toUpperCase(), this.email);
    }
}
