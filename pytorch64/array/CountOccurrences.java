import java.util.Scanner;

public class CountOccurrences {
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

        // Ask the user for the number to count occurrences
        System.out.print("Enter the number to count its occurrences: ");
        int target = scanner.nextInt();

        // Count the occurrences of the target number
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        // Display the result
        System.out.println("The number " + target + " occurs " + count + " times in the array.");
    }
}
