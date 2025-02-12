
import java.util.Scanner;

public class FactorialUsingNestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
