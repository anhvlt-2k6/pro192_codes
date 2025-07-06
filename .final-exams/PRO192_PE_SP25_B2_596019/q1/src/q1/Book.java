package q1;

public class Book {
    protected String title;
    protected int pages;
    
    public Book() {
        this.title = "";
        this.pages = 0;
    }
    
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    
    public String getTitle() {
        return this.title.toUpperCase();
    }
    
    public int getPages() {
        return this.pages / 2;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }
}
