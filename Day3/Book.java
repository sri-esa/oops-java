package Day3;

public class Book {
    private int bookId;
    private String title;
    private boolean isIssued;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isIssued = false;
    }

    public boolean issueBook() {
        if (isIssued) return false;
        isIssued = true;
        return true;
    }

    public void returnBook() {
        isIssued = false;
    }
    public static void main(String[] args) {
        Book book = new Book(1, "Java Programming");
        System.out.println("Issuing book: " + book.issueBook());
        System.out.println("Issuing again: " + book.issueBook());
        book.returnBook();
        System.out.println("Issuing after return: " + book.issueBook());
    }
}