import java.util.Scanner;

public class EvenPositionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare and initialize the array
        int[] array = new int[size];

        // Take array elements as input from the user
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Print elements at even positions
        System.out.println("Elements at even positions are:");
        for (int i = 1; i < size; i += 2) { // Index starts at 0, so even positions are 1, 3, 5, ...
            System.out.println(array[i]);
        }

        scanner.close();
    }
}
