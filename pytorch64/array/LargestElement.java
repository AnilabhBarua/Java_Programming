import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array and take user input for the elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the largest element in the array
        int largest = arr[0]; // Assume the first element is the largest initially
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if a bigger element is found
            }
        }

        // Print the largest element
        System.out.println("The largest element in the array is: " + largest);
    }
}
