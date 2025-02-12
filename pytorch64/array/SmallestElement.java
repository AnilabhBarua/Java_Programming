import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array and take user input for the elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize the smallest element to the first element of the array
        int smallest = arr[0];

        // Loop through the array to find the smallest element
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Print the smallest element
        System.out.println("The smallest element in the array is: " + smallest);
    }
}
