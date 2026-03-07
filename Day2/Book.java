package Day2;

public class Book {
    String title;
    String author;
    double price;
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 499.99);
        System.out.println("Title: " + b1.title);
        System.out.println("Author: " + b1.author);
        System.out.println("Price: " + b1.price + " Rs.");
    }
}
