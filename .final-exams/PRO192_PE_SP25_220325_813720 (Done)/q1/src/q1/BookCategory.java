package q1;

public class BookCategory implements IBook {
    
    protected String id;
    protected String name;
    
    public BookCategory() {
        this.id = "";
        this.name = "";
    }
    
    public BookCategory(String id, String name) {
        this.id = id;
        this.name = name;
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
    
    @Override
    public String entry() {
        return String.format("(%s, %s) is added", this.id, this.name);
    }

    @Override
    public String print() {
        return String.format("(%s, %s)", this.id, this.name);
    }
    
}
