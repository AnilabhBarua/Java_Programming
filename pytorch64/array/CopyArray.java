import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create and input the first array
        int[] arr1 = new int[n];
        System.out.println("Enter " + n + " elements for the first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Create a second array to copy the elements from the first array
        int[] arr2 = new int[n];

        // Copy elements from arr1 to arr2
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }

        // Display the copied elements in arr2
        System.out.println("Elements in the second array after copying:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
