import java.util.Scanner;

public class OddPositionElements {
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

        // Print elements at odd positions
        System.out.println("Elements at odd positions:");
        for (int i = 1; i < n; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
