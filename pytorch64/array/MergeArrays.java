import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the first array
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();

        // Create and input the first array
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements for the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Ask the user for the size of the second array
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();

        // Create and input the second array
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements for the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Create a new array to store the merged result
        int[] mergedArray = new int[n1 + n2];

        // Copy elements from the first array to the merged array
        for (int i = 0; i < n1; i++) {
            mergedArray[i] = arr1[i];
        }

        // Copy elements from the second array to the merged array
        for (int i = 0; i < n2; i++) {
            mergedArray[n1 + i] = arr2[i];
        }

        // Display the merged array
        System.out.println("Merged array:");
        for (int i = 0; i < n1 + n2; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
