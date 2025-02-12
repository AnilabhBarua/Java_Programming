import java.util.Scanner;

public class ArrayEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the arrays
        System.out.print("Enter the size of the arrays: ");
        int n = scanner.nextInt();

        // Create two arrays and take user input for the elements
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Check if the arrays are equal
        boolean areEqual = true;
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                areEqual = false;
                break;
            }
        }

        // Display the result
        if (areEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
}
