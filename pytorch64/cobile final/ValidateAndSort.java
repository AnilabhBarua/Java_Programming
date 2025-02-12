import java.util.Scanner;
import java.util.Arrays;

public class ValidateAndSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int count = 0;

        System.out.println("Enter 5 integers:");
        while (count < 5) {
            try {
                String input = scanner.next();
                numbers[count] = Integer.parseInt(input);
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
    }
}
