import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Check if the array has at least two elements
        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        // Create an array and take user input for the elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Input each value
        }

        // Initialize two variables to hold the largest and second largest values
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the array to find the largest and second largest elements
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // Display the second largest element
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element in the array is: " + secondLargest);
        } else {
            System.out.println("No second largest element found.");
        }
    }
}
