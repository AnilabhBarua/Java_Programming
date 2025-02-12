
import java.util.Scanner;

public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = 1;
        int min = (num1 < num2) ? num1 : num2;

        for (int i = min; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
                break;
            }
        }

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
