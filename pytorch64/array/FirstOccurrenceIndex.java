import java.util.Scanner;

public class FirstOccurrenceIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create and input the array
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Ask the user for the element to find the first occurrence
        System.out.print("Enter the element to find its first occurrence: ");
        int target = scanner.nextInt();

        // Find the index of the first occurrence of the target element
        int index = -1;  // Default if the element is not found
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index = i;
                break;  // Stop the loop once the first occurrence is found
            }
        }

        // Display the result
        if (index != -1) {
            System.out.println("The first occurrence of " + target + " is at index " + index + ".");
        } else {
            System.out.println("The element " + target + " is not found in the array.");
        }
    }
}
