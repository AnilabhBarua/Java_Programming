import java.util.Scanner;

abstract class LibraryItem {
    final String category;

    LibraryItem(String category) {
        this.category = category;
    }

    public abstract void displayDetails();
}

class Book extends LibraryItem {
    static int totalBooks = 0;
    String title;

    Book(String title) {
        super("Book");
        this.title = title;
        totalBooks++;
    }

    @Override
    public void displayDetails() {
        System.out.println("Category: " + category + ", Title: " + title);
    }
}

public class LibrarySystemWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[10];
        int count = 0;

        while (true) {
            System.out.println("1. Add Book 2. View All Books 3. View Total Books 4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (count >= books.length) {
                        System.out.println("Library is full, no more books can be added.");
                    } else {
                        System.out.print("Enter the title of the book: ");
                        String title = scanner.nextLine();
                        books[count++] = new Book(title);
                        System.out.println("Book added successfully!");
                    }
                    break;
                case 2:
                    System.out.println("Books in the Library:");
                    for (int i = 0; i < count; i++) {
                        books[i].displayDetails();
                    }
                    break;
                case 3:
                    System.out.println("Total Books: " + Book.totalBooks);
                    break;
                case 4:
                    System.out.println("Exiting the Library System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
