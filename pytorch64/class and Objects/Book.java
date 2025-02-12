import java.util.Scanner;

class Book {
    private String title, author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter title, author, and price of book " + (i + 1) + ":");
            String title = sc.next();
            String author = sc.next();
            double price = sc.nextDouble();
            books[i] = new Book(title, author, price);
        }

        System.out.println("Book Details:");
        for (Book book : books) {
            book.displayDetails();
        }
    }
}
