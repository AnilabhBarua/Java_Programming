import java.util.Scanner;

public class RemoveDuplicates {
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

        // Variable to keep track of the new array size after removing duplicates
        int newSize = n;

        // Loop through the array and remove duplicates
        for (int i = 0; i < newSize; i++) {
            for (int j = i + 1; j < newSize; j++) {
                if (arr[i] == arr[j]) {
                    // Shift all elements to the left to overwrite the duplicate
                    for (int k = j; k < newSize - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    newSize--; // Reduce the size of the array
                    j--; // Decrement j to recheck the shifted element
                }
            }
        }

        // Display the array after removing duplicates
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
