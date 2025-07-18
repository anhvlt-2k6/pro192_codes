class A {
  protected int x;
}

public class Main {
  public static void main(String args[]) {
    A t = new A();
    t.x = 5; // Ok
    System.out.println(" x = " + t.x);
    System.out.println();
  }
}

class Book {
  private String title;
  private String author;
  private String ISBN;
  private boolean isBorrowed;

  public Book(String title, String author, String ISBN) {
      this.title = title;
      this.author = author;
      this.ISBN = ISBN;
      this.isBorrowed = false;
  }

  public boolean isBorrowed() {
      return isBorrowed;
  }

  public void borrow() {
      this.isBorrowed = true;
  }

  public void returnBook() {
      this.isBorrowed = false;
  }

  // Getters omitted for brevity
}

class Member {
  protected String name;
  protected int memberId;
  protected List<Book> booksBorrowed;

  public Member(String name, int memberId) {
      this.name = name;
      this.memberId = memberId;
      this.booksBorrowed = new ArrayList<>();
  }

  public void borrowBook(Book book) {
      if (booksBorrowed.size() < getMaxBooks() && !book.isBorrowed()) {
          booksBorrowed.add(book);
          book.borrow();
          System.out.println(name + " borrowed " + book.getTitle());
      } else {
          System.out.println("Cannot borrow more books or book is already borrowed.");
      }
  }

  public void returnBook(Book book) {
      booksBorrowed.remove(book);
      book.returnBook();
      System.out.println(name + " returned " + book.getTitle());
  }

  public int getMaxBooks() {
      return 3; // Default for regular members
  }
}

class RegularMember extends Member {
  public RegularMember(String name, int memberId) {
      super(name, memberId);
  }

  @Override
  public int getMaxBooks() {
      return 3;
  }
}

class PremiumMember extends Member {
  public PremiumMember(String name, int memberId) {
      super(name, memberId);
  }

  @Override
  public int getMaxBooks() {
      return 5;
  }
}

class Library {
  private List<Book> books;
  private List<Member> members;

  public Library() {
      this.books = new ArrayList<>();
      this.members = new ArrayList<>();
  }

  public void addBook(Book book) {
      books.add(book);
  }

  public void addMember(Member member) {
      members.add(member);
  }

  public void borrowBook(Book book, Member member) {
      member.borrowBook(book);
  }

  public void returnBook(Book book, Member member) {
      member.returnBook(book);
  }

  public static void main(String[] args) {
    Library library = new Library();

    Book book1 = new Book("1984", "George Orwell", "123-1984");
    Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", "456-CR");
    Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "789-GG");

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);

    Member regularMember = new RegularMember("Alice", 1);
    Member premiumMember = new PremiumMember("Bob", 2);

    library.addMember(regularMember);
    library.addMember(premiumMember);

    System.out.println("--- Borrowing Books ---");
    library.borrowBook(book1, regularMember);
    library.borrowBook(book2, regularMember);
    library.borrowBook(book3, premiumMember);
    
    library.borrowBook(book1, premiumMember);

    System.out.println("--- Returning Books ---");
    library.returnBook(book1, regularMember);
    library.borrowBook(book1, premiumMember);

    Book book4 = new Book("Moby Dick", "Herman Melville", "101-MD");
    Book book5 = new Book("To Kill a Mockingbird", "Harper Lee", "102-TKM");
    Book book6 = new Book("Pride and Prejudice", "Jane Austen", "103-PP");

    library.addBook(book4);
    library.addBook(book5);
    library.addBook(book6);

    library.borrowBook(book4, regularMember);
    library.borrowBook(book5, regularMember);
  }
}