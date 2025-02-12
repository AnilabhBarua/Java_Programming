import java.util.Scanner;

public class RotateArray {
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

        // Ask the user for the number of steps to rotate the array
        System.out.print("Enter the number of steps to rotate the array to the right: ");
        int steps = scanner.nextInt();

        // Normalize the steps (in case the steps are greater than the array length)
        steps = steps % n;

        // Rotate the array to the right by the given number of steps
        rotateArray(arr, steps);

        // Display the rotated array
        System.out.println("Array after rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Method to rotate the array to the right by given steps
    public static void rotateArray(int[] arr, int steps) {
        int n = arr.length;
        // Create a temporary array to store the rotated result
        int[] temp = new int[n];

        // Copy the last 'steps' elements to the beginning of the temporary array
        for (int i = 0; i < steps; i++) {
            temp[i] = arr[n - steps + i];
        }

        // Copy the remaining elements to the temporary array
        for (int i = 0; i < n - steps; i++) {
            temp[steps + i] = arr[i];
        }

        // Copy the elements from the temporary array back to the original array
        System.arraycopy(temp, 0, arr, 0, n);
    }
}
