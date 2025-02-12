import java.util.Scanner;

class StringOperations {
    public String process(String str) {
        return str.toUpperCase();
    }

    public String process(String str1, String str2) {
        return str1.concat(str2);
    }

    public String process(String str, int n) {
        return str.repeat(n);
    }
}

public class StringOverloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringOperations operations = new StringOperations();

        System.out.println("Choose an operation: 1. Uppercase 2. Concatenate 3. Repeat");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter a string: ");
                String input1 = scanner.nextLine();
                System.out.println("Result: " + operations.process(input1));
                break;
            case 2:
                System.out.print("Enter first string: ");
                String str1 = scanner.nextLine();
                System.out.print("Enter second string: ");
                String str2 = scanner.nextLine();
                System.out.println("Result: " + operations.process(str1, str2));
                break;
            case 3:
                System.out.print("Enter a string: ");
                String str = scanner.nextLine();
                System.out.print("Enter repeat count: ");
                int n = scanner.nextInt();
                System.out.println("Result: " + operations.process(str, n));
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
