import java.util.Scanner;

public class FrequencyOfElements {
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

        // Calculate the frequency of each element in the array
        System.out.println("Frequency of each element:");
        for (int i = 0; i < n; i++) {
            int count = 1; // Initial count is 1 for each element
            // Check if the element is already counted
            if (arr[i] != Integer.MIN_VALUE) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = Integer.MIN_VALUE; // Mark the element as counted
                    }
                }
                System.out.println(arr[i] + " appears " + count + " time(s)");
            }
        }
    }
}
