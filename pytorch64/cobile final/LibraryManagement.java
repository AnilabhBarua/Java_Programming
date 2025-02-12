import java.util.Scanner;

class Library {
    static final String LIBRARY_NAME = "City Central Library";
    static int totalBooks = 100;

    public static void issueBook() {
        if (totalBooks > 0) {
            totalBooks--;
            System.out.println("Book issued successfully. Remaining books: " + totalBooks);
        } else {
            System.out.println("No books available for issuing.");
        }
    }

    public static void returnBook() {
        totalBooks++;
        System.out.println("Book returned successfully. Total books: " + totalBooks);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to " + Library.LIBRARY_NAME);
        while (true) {
            System.out.println("Choose an option: 1. Issue Book 2. Return Book 3. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Library.issueBook();
                    break;
                case 2:
                    Library.returnBook();
                    break;
                case 3:
                    System.out.println("Thank you for using " + Library.LIBRARY_NAME);
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
