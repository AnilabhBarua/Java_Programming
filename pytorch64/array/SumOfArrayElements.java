import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array and take user input for the elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        int sum = 0;  // Variable to store the sum of elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Input each value
            sum += arr[i]; // Add the value to sum
        }

        // Display the sum of the array elements
        System.out.println("The sum of the array elements is: " + sum);
    }
}
