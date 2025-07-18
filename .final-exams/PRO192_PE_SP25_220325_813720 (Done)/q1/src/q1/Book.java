package q1;

public class Book extends BookCategory {
    
    protected String title;
    protected String author;
    protected int yop;
    protected BookCategory bookCategory;
    
    public Book() {
        this.title = "";
        this.author = "";
        this.yop = 0;
    }
    
    public Book(String title, String author, int yop, BookCategory bookCategory) {
        this.title = title;
        this.author = author;
        this.yop = yop;
        this.bookCategory = bookCategory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYop() {
        return yop;
    }

    public void setYop(int yop) {
        this.yop = yop;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }
    
    public String Entry() {
        return String.format("(%s) is added", this.title);
    }
    
    public String Print() {
        return String.format(
                "(%s,%s,%d) : [%s]", 
                this.title, 
                this.author,
                this.yop,
                this.bookCategory.name);
    }
}
